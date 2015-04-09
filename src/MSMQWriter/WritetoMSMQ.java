/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MSMQWriter;

import ionic.Msmq.Message;
import ionic.Msmq.MessageQueueException;
import ionic.Msmq.Queue;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Administrator
 */
public class WritetoMSMQ 
{  
    private final String queueName;
    
    public WritetoMSMQ(final String queue)
    {
            queueName = queue;
    }
    public void write(final String message)
    {
        try 
        {
            Queue queue= new Queue(queueName);
            String label="Messages";
            String body= message;
            byte[] correlationId = { 0,2,4,6,8,9 }; 
            Message msg= new Message(body, label, correlationId);
            queue.send(msg);
            queue.close();
        }
        catch (MessageQueueException ex1) 
        {
            System.out.println("Put failure: " + ex1.toString());
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(WritetoMSMQ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
