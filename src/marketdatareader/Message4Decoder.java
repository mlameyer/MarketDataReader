/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketdatareader;

import MSMQWriter.WritetoMSMQ;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import mktdata.ChannelReset4;
import mktdata.MatchEventIndicator;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;
/**
 *
 * @author Administrator
 */
class Message4Decoder {
    private final ChannelReset4 marketData = new ChannelReset4();
    private final WritetoMSMQ mq;
    private final String queue;
    private final byte[] message;
    private final byte[] messageCount;
    private final int bufferOffset;
    private final int actingBlockLength;
    private final int actingVersion;
    private String MEI;
    
    public Message4Decoder(byte[] message, byte[] messageCount, int bufferOffset, int actingBlockLength, int actingVersion, String queue) {
        this.message = message;
        this.messageCount = messageCount;
        this.bufferOffset = bufferOffset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion; 
        this.queue = queue;
        mq = new WritetoMSMQ(queue);
        decode();
    }

    private void decode() {
        final DirectBuffer directBuffer = new DirectBuffer(message);
        final ByteBuffer buffer = ByteBuffer.wrap(message);
        StringBuilder sbmd = new StringBuilder();
        buffer.order(ByteOrder.LITTLE_ENDIAN);
       
        marketData.wrapForDecode(directBuffer, bufferOffset, actingBlockLength, actingVersion);
        sbmd.append("[34]=\"").append(buffer.getInt() & 0xffffffff).append("-").append(messageCount[0]);
        sbmd.append("\"[52]=\"").append(buffer.getLong() & 0xffffffff);
        sbmd.append("\"[TEMPID]=\"").append(marketData.sbeTemplateId());
        sbmd.append("\"[35]=\"").append(marketData.sbeSemanticType());
        sbmd.append("\"[60]=\"").append(marketData.transactTime());
        sbmd.append("\"[5799]=\"");
       
        final MatchEventIndicator event = marketData.matchEventIndicator();
        if(event.EndOfEvent()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI); 
        if(event.LastQuoteMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI);
        if(event.LastImpliedMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI); 
        if(event.LastStatsMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI);
        if(event.LastTradeMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI); 
        if(event.LastVolumeMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI);
        if(event.RecoveryMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI); 
        if(event.Reserved()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI); 
        sbmd.append("\"%");

        for(final ChannelReset4.NoMDEntries noMDEntries : marketData.noMDEntries())
        {         
            sbmd.append("\"[279]=\"").append(noMDEntries.mDUpdateAction());           
            sbmd.append("\"[269]=\"").append(noMDEntries.getMDEntryType(message, 0, message.length));
            sbmd.append("\"[1180]=\"").append(noMDEntries.applID());
            sbmd.append("\"?");
        }
        
        sbmd.append("\"\"");
        
        System.out.println(sbmd);
        mq.write(sbmd.toString());
    }
}
