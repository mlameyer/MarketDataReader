/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import mktdata.MDIncrementalRefreshTradeSummary42;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;
import MSMQWriter.WritetoMSMQ;
import java.math.BigDecimal;
import mktdata.MatchEventIndicator;

/**
 *
 * @author Administrator
 */
public class Message42Decoder {
    private final MDIncrementalRefreshTradeSummary42 marketData = new MDIncrementalRefreshTradeSummary42();
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
    
    public Message42Decoder(final byte[] message, final byte[] messageCount, final int bufferOffset, final int actingBlockLength, final int actingVersion, final String queue) {
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
       final ByteBuffer buffers = ByteBuffer.wrap(message);
       StringBuilder sbmd = new StringBuilder();
       buffers.order(ByteOrder.LITTLE_ENDIAN);
       
       marketData.wrapForDecode(directBuffer, bufferOffset, actingBlockLength, actingVersion);
       sbmd.append("[34]=\"").append(buffers.getInt() & 0xffffffff).append("-").append(messageCount[0]);
       sbmd.append("\"[52]=\"").append(buffers.getLong() & 0xffffffff);
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
       
       for(final MDIncrementalRefreshTradeSummary42.NoMDEntries noMDEntries : marketData.noMDEntries())
       {
           mdEntryPriceRaw = new BigDecimal(noMDEntries.mDEntryPx().mantissa());
           mdEntryPriceDecimalPlace = noMDEntries.mDEntryPx().exponent();
           mdEntryPriceFormated = mdEntryPriceRaw.movePointRight(mdEntryPriceDecimalPlace);
           sbmd.append("\"[270]=\"").append(mdEntryPriceFormated);
           sbmd.append("\"[271]=\"").append(noMDEntries.mDEntrySize());          
           sbmd.append("\"[48]=\"").append(noMDEntries.securityID());           
           sbmd.append("\"[83]=\"").append(noMDEntries.rptSeq());           
           sbmd.append("\"[346]=\"").append(noMDEntries.numberOfOrders());           
           sbmd.append("\"[5797]=\"").append(noMDEntries.aggressorSide().ordinal());
           sbmd.append("\"[279]=\"").append(noMDEntries.mDUpdateAction().ordinal());  
           sbmd.append("\"?");
       }
       
       for(final MDIncrementalRefreshTradeSummary42.NoOrderIDEntries NoOrderIDEntries : marketData.noOrderIDEntries())
       {
           sbmd.append("\"[37]=\"").append(NoOrderIDEntries.orderID());
           sbmd.append("\"[32]=\"").append(NoOrderIDEntries.lastQty()); 
           sbmd.append("\"?");
       }
       
       sbmd.append("\"\"");
               
       System.out.println(sbmd);
       mq.write(sbmd.toString());

    }
    
}
