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
import mktdata.SettlPriceType;
import mktdata.SnapshotFullRefresh38;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;

/**
 *
 * @author Administrator
 */
class Message38Decoder {
    private final SnapshotFullRefresh38 marketData = new SnapshotFullRefresh38();
    private final WritetoMSMQ mq;
    private final String queue;
    private final byte[] message;
    private final byte[] messageCount;
    private final int bufferOffset;
    private final int actingBlockLength;
    private final int actingVersion;
    private BigDecimal mdEntryPriceRaw, mdEntryPriceFormated;
    private int mdEntryPriceDecimalPlace;
    private String SPT;
    
    public Message38Decoder(byte[] message, final byte[] messageCount, int bufferOffset, int actingBlockLength, int actingVersion, String queue) {
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
       sbmd.append("\"[369]=\"").append(marketData.lastMsgSeqNumProcessed());
       sbmd.append("\"[911]=\"").append(marketData.totNumReports());
       sbmd.append("\"[48]=\"").append(marketData.securityID());
       sbmd.append("\"[83]=\"").append(marketData.rptSeq());
       sbmd.append("\"[60]=\"").append(marketData.transactTime());
       sbmd.append("\"[779]=\"").append(marketData.lastUpdateTime());
       sbmd.append("\"[75]=\"").append(marketData.tradeDate());
       sbmd.append("\"[1682]=\"").append(marketData.mDSecurityTradingStatus());
       sbmd.append("\"[1149]=\"").append(marketData.highLimitPrice());
       sbmd.append("\"[1148]=\"").append(marketData.lowLimitPrice());
       sbmd.append("\"[1143]=\"").append(marketData.maxPriceVariation());
       sbmd.append("\"%");
       
       for(final SnapshotFullRefresh38.NoMDEntries noMDEntries : marketData.noMDEntries())
       {
           mdEntryPriceRaw = new BigDecimal(noMDEntries.mDEntryPx().mantissa());
           mdEntryPriceDecimalPlace = noMDEntries.mDEntryPx().exponent();
           mdEntryPriceFormated = mdEntryPriceRaw.movePointRight(mdEntryPriceDecimalPlace);
           sbmd.append("\"[270]=\"").append(mdEntryPriceFormated);
           sbmd.append("\"[271]=\"").append(noMDEntries.mDEntrySize());                   
           sbmd.append("\"[346]=\"").append(noMDEntries.numberOfOrders());           
           sbmd.append("\"[1023]=\"").append(noMDEntries.mDPriceLevel()); 
           sbmd.append("\"[5796]=\"").append(noMDEntries.tradingReferenceDate()); 
           sbmd.append("\"[286]=\"").append(noMDEntries.openCloseSettlFlag().ordinal());   
           
           sbmd.append("\"[731]=\"");            
           final SettlPriceType event1 = noMDEntries.settlPriceType();
           if(event1.Actual()){SPT = "1";}else{SPT = "0";}
           sbmd.append(SPT); 
           if(event1.Final()){SPT = "1";}else{SPT = "0";}
           sbmd.append(SPT);
           if(event1.Intraday()){SPT = "1";}else{SPT = "0";}
           sbmd.append(SPT); 
           if(event1.NullValue()){SPT = "1";}else{SPT = "0";}
           sbmd.append(SPT);
           if(event1.ReservedBits()){SPT = "1";}else{SPT = "0";}
           sbmd.append(SPT); 
           if(event1.Rounded()){SPT = "1";}else{SPT = "0";}
           sbmd.append(SPT);
       
           sbmd.append("\"[269]=\"").append(noMDEntries.mDEntryType());
           sbmd.append("\"?");
       }
       
       sbmd.append("\"\"");
       
       System.out.println(sbmd);
       mq.write(sbmd.toString());
    }
    
}


