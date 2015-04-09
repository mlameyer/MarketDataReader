/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import MSMQWriter.WritetoMSMQ;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import mktdata.MDIncrementalRefreshBook32;
import mktdata.MatchEventIndicator;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;

/**
 *
 * @author Administrator
 */
public class Message32Decoder {
    private final MDIncrementalRefreshBook32 marketData = new MDIncrementalRefreshBook32();
    private final WritetoMSMQ mq;
    private final String queue;
    private final byte[] message;
    private final byte[] messageCount;
    private final int bufferOffset;
    private final int actingBlockLength;
    private final int actingVersion;
    private BigDecimal mdEntryPriceRaw, mdEntryPriceFormated;
    private int mdEntryPriceDecimalPlace;
    private String MEI;
    
    public Message32Decoder(final byte[] message, byte[] messageCount, final int bufferOffset, final int actingBlockLength, final int actingVersion, String queue) {
       this.message = message;
       this.messageCount = messageCount;
       this.bufferOffset = bufferOffset;
       this.actingBlockLength = actingBlockLength;
       this.actingVersion = actingVersion; 
       this.queue = queue;
       mq = new WritetoMSMQ(queue);
       decode();
    }
    
    private void decode()
    {
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

       for(final MDIncrementalRefreshBook32.NoMDEntries noMDEntries : marketData.noMDEntries())
       {
           mdEntryPriceRaw = new BigDecimal(noMDEntries.mDEntryPx().mantissa());
           mdEntryPriceDecimalPlace = noMDEntries.mDEntryPx().exponent();
           mdEntryPriceFormated = mdEntryPriceRaw.movePointRight(mdEntryPriceDecimalPlace);
           sbmd.append("\"[270]=\"").append(mdEntryPriceFormated);
           sbmd.append("\"[271]=\"").append(noMDEntries.mDEntrySize());          
           sbmd.append("\"[48]=\"").append(noMDEntries.securityID());           
           sbmd.append("\"[83]=\"").append(noMDEntries.rptSeq());           
           sbmd.append("\"[346]=\"").append(noMDEntries.numberOfOrders());           
           sbmd.append("\"[1023]=\"").append(noMDEntries.mDPriceLevel());           
           sbmd.append("\"[279]=\"").append(noMDEntries.mDUpdateAction().ordinal());           
           sbmd.append("\"[269]=\"").append(noMDEntries.mDEntryType().ordinal());
           sbmd.append("\"?");
       }
       
       sbmd.append("\"\"");
       
       System.out.println(sbmd);
       mq.write(sbmd.toString());

    }
    
}
