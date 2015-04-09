/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import mktdata.MessageHeader;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;

/**
 *
 * @author Administrator
 */
class DecodeMessage {
    private final MessageHeader MESSAGE_HEADER = new MessageHeader();
    private final String queue;
    private Message4Decoder msg4; //Done
    private Message12Decoder msg12; //Done
    private Message15Decoder msg15; //Done
    private Message16Decoder msg16; //Done
    private Message27Decoder msg27; //Done
    private Message29Decoder msg29; //Done
    private Message30Decoder msg30; //Done
    private Message32Decoder msg32; //Done
    private Message33Decoder msg33; //Done
    private Message34Decoder msg34; //Done
    private Message35Decoder msg35; //Done
    private Message36Decoder msg36; //Done
    private Message37Decoder msg37; //Done
    private Message38Decoder msg38; //Done
    private Message39Decoder msg39; //Done
    private Message41Decoder msg41; //Done
    private Message42Decoder msg42; //Done
    private final String readableMessage = null;

    public DecodeMessage(String queue) {
        this.queue = queue;
    }
    
    
    public String decode(byte[] message, byte[] messageCount) {
        final DirectBuffer directBuffer = new DirectBuffer(message);
        final short messageTemplateVersion = 1;
        final int templateId, actingBlockLength, schemaId, actingVersion;
        int bufferOffset = 14;
        
        MESSAGE_HEADER.wrap(directBuffer, bufferOffset, messageTemplateVersion);
        
        templateId = MESSAGE_HEADER.templateId();
        actingBlockLength = MESSAGE_HEADER.blockLength();
        schemaId = MESSAGE_HEADER.schemaId();
        actingVersion = MESSAGE_HEADER.version();
        
        bufferOffset += MESSAGE_HEADER.size();
        
        StringBuilder sb1 = new StringBuilder();
        for (byte b : message) 
        {
            sb1.append(String.format("%02X ", b));
        }
        System.out.println("Template: " + templateId + ":" + sb1.toString());
                
        switch(templateId){
            case 4: 
                
                msg4 = new Message4Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);
                
                break;
            
            case 12: 
                
                msg12 = new Message12Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);
                
                break;
            
            case 15:
                
                msg15 = new Message15Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);
                
                break;
                
            case 16: 
                
                msg16 = new Message16Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);
                
                break;
                
            case 27: 
                
                msg27 = new Message27Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);
                
                break;
                
            case 29: 
                
                msg29 = new Message29Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);
          
                break;
                
            case 30: 
                
                msg30 = new Message30Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);
                
                break;
               
            case 32: 
                
                msg32 = new Message32Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
                
            case 33: 
                
                msg33 = new Message33Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
                
            case 34: 
                
                msg34 = new Message34Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
                
            case 35: 
                
                msg35 = new Message35Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
                
            case 36: 
                
                msg36 = new Message36Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
                
            case 37: 
                
                msg37 = new Message37Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
                
            case 38: 
                
                msg38 = new Message38Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
                
            case 39: 
                
                msg39 = new Message39Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
                
            case 41: 
                
                msg41 = new Message41Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
                
            case 42: 

                msg42 = new Message42Decoder(message, messageCount, bufferOffset, actingBlockLength, actingVersion, queue);

                break;
        }
        
        return readableMessage;
    }
    
}
/*                
                StringBuilder sb1 = new StringBuilder();
                for (byte b : message) 
                {
                    sb1.append(String.format("%02X ", b));
                }
                System.out.println("Message 32" + sb1.toString());
*/