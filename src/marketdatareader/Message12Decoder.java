/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import MSMQWriter.WritetoMSMQ;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import mktdata.AdminHeartbeat12;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;

/**
 *
 * @author Administrator
 */
public class Message12Decoder 
{
    private final AdminHeartbeat12 heartBeat = new AdminHeartbeat12();
    private final WritetoMSMQ mq;
    private final String queue;
    private final byte[] message;
    private final byte[] messageCount;
    private final int bufferOffset;
    private final int actingBlockLength;
    private final int actingVersion;
    
    public Message12Decoder(final byte[] message, byte[] messageCount, final int bufferOffset, final int actingBlockLength, final int actingVersion, final String queue)
    {
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
       StringBuilder sbhb = new StringBuilder();
       buffer.order(ByteOrder.LITTLE_ENDIAN);
       
       heartBeat.wrapForDecode(directBuffer, bufferOffset, actingBlockLength, actingVersion);
       sbhb.append("[34]=\"").append(buffer.getInt() & 0xffffffff).append("-").append(messageCount[0]);
       sbhb.append("\"[52]=\"").append(buffer.getLong() & 0xffffffff);
       sbhb.append("\"[TEMPID]=\"").append(heartBeat.sbeTemplateId());
       sbhb.append("\"[35]=\"").append(heartBeat.sbeSemanticType()).append("\"\"\"");
       System.out.println(sbhb);
       mq.write(sbhb.toString());
    }
}
