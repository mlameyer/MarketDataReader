/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketdatareader;

import MSMQWriter.WritetoMSMQ;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import mktdata.MatchEventIndicator;
import mktdata.SecurityStatus30;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;

/**
 *
 * @author Administrator
 */
class Message30Decoder {
    private final SecurityStatus30 marketData = new SecurityStatus30();
    private final WritetoMSMQ mq;
    private final String queue;
    private final byte[] message;
    private final byte[] messageCount;
    private final int bufferOffset;
    private final int actingBlockLength;
    private final int actingVersion;
    private String MEI;

    public Message30Decoder(byte[] message, final byte[] messageCount, int bufferOffset, int actingBlockLength, int actingVersion, String queue) {
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
        try {
            sbmd.append("\"[1151]=\"").append(new String(message, 0, marketData.getSecurityGroup(message, 0), SecurityStatus30.securityGroupCharacterEncoding()));
            sbmd.append("\"[6937]=\"").append(new String(message, 0, marketData.getAsset(message, 0), SecurityStatus30.assetCharacterEncoding()));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Message30Decoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        sbmd.append("\"[48]=\"").append(marketData.securityID());
        sbmd.append("\"[75]=\"").append(marketData.tradeDate());
        
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
        
        sbmd.append("\"[326]=\"").append(marketData.securityTradingStatus());
        sbmd.append("\"[327]=\"").append(marketData.haltReason());
        sbmd.append("\"[1174]=\"").append(marketData.securityTradingEvent()).append("\"\"\"");
       
        System.out.println(sbmd);
        mq.write(sbmd.toString());
    }
    
}
