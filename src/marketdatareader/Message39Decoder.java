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
import mktdata.QuoteRequest39;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;

/**
 *
 * @author Administrator
 */
class Message39Decoder {
    private final QuoteRequest39 marketData = new QuoteRequest39();
    private final WritetoMSMQ mq;
    private final String queue;
    private final byte[] message;
    private final byte[] messageCount;
    private final int bufferOffset;
    private final int actingBlockLength;
    private final int actingVersion;
    private String MEI;
    
    public Message39Decoder(byte[] message, final byte[] messageCount, int bufferOffset, int actingBlockLength, int actingVersion, String queue) {
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
            sbmd.append("\"[131]=\"").append(new String(message, 0, marketData.getQuoteReqID(message, 0),QuoteRequest39.quoteReqIDCharacterEncoding()));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Message39Decoder.class.getName()).log(Level.SEVERE, null, ex);
        }
       
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
       
       for(final QuoteRequest39.NoRelatedSym noRelatedSym : marketData.noRelatedSym())
       {
           try {          
               sbmd.append("\"[55]=\"").append(new String(message, 0, noRelatedSym.getSymbol(message, 0), QuoteRequest39.NoRelatedSym.symbolCharacterEncoding()));
           } catch (UnsupportedEncodingException ex) {
               Logger.getLogger(Message27Decoder.class.getName()).log(Level.SEVERE, null, ex);
           }          
           sbmd.append("\"[48]=\"").append(noRelatedSym.securityID());           
           sbmd.append("\"[38]=\"").append(noRelatedSym.orderQty());           
           sbmd.append("\"[537]=\"").append(noRelatedSym.quoteType());           
           sbmd.append("\"[54]=\"").append(noRelatedSym.side()); 
           sbmd.append("\"?");
       }
       
       sbmd.append("\"\"");
       
       System.out.println(sbmd);
       mq.write(sbmd.toString());
    }
    
}


