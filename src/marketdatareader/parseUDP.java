/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class parseUDP {

    private final String queue;
    private final DecodeMessage message;

    public parseUDP(String queue) {
        this.queue = queue;
        message = new DecodeMessage(queue);
    }
    
    public void parseUDP(byte[] i) {
        int counter = 1;
        final ByteBuffer buffer = ByteBuffer.wrap(i);
        byte[] newArr = null;
        byte[] headerArr = new byte[12];
        byte[] head;
        byte[] messageCount = new byte[1];
/*       
        StringBuilder sb = new StringBuilder();
        for (byte b : i) 
        {
            sb.append(String.format("%02X ", b));
        }
        System.out.println("1:: " + sb.toString());
*/        
        head = Arrays.copyOf(i, 12);
        buffer.get(headerArr);
        
        while (buffer.hasRemaining()) {
                  
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            buffer.mark();
            int length = buffer.getShort() & 0xffff;
            if (length == 0) {
                break;
            }
            //System.out.println(length);
            newArr = new byte[length];
            buffer.reset();
            buffer.get(newArr, 0, length);
            
            messageCount[0] = (byte)counter;
            counter++;
/*
            StringBuilder sb1 = new StringBuilder();
            for (byte b : newArr) 
            {
                sb1.append(String.format("%02X ", b));
            }
            System.out.println("newArr:: " + sb1.toString());
*/
            sendnewArray(head, messageCount, newArr);        
        }
        
    }
    
    private void sendnewArray(byte[] headerArr, byte[] messageCount, byte[] newArr) {
        byte[] completeArray = null;
        
        completeArray = new byte[headerArr.length + messageCount.length + newArr.length];
        for(int i = 0; i < headerArr.length; i++)
        {
          completeArray[i] = headerArr[i];  
        }
        
        for(int i = headerArr.length, j = 0; j < newArr.length; i++, j++)
        {
          completeArray[i] = newArr[j];  
          
          if(i == (completeArray.length - 1))
          {
            completeArray[i + 1] = messageCount[0];  
          }
        }
/*      
        StringBuilder sb = new StringBuilder();
        for (byte b : completeArray) 
        {
            sb.append(String.format("%02X ", b));
        }
        System.out.println("2:: " + sb.toString());
*/       
        //System.out.println(completeArray[12]);
        message.decode(completeArray, messageCount);      
    }
}
