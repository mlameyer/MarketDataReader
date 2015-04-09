/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketdatareader;

import MSMQWriter.WritetoMSMQ;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import mktdata.AdminLogout16;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;

/**
 *
 * @author Administrator
 */
class Message16Decoder {
    private final AdminLogout16 marketData = new AdminLogout16();
    private final WritetoMSMQ mq;
    private final String queue;
    private final byte[] message;
    private final byte[] messageCount;
    private final int bufferOffset;
    private final int actingBlockLength;
    private final int actingVersion;
    
    public Message16Decoder(byte[] message, byte[] messageCount, int bufferOffset, int actingBlockLength, int actingVersion, String queue) {
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
       sbmd.append("\"[58]=\"").append(marketData.text(0)).append("\"\"\"");
       System.out.println(sbmd);
       mq.write(sbmd.toString());
    }
    
}
