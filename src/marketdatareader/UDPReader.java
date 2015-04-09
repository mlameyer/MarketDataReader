/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JTextArea;

/**
 *
 * @author Administrator
 */
class UDPReader implements Runnable
{
    private final static ReentrantLock lock = new ReentrantLock();
    private final String ip, socket, queue, threadName;
    private final JTextArea screen;
    private final boolean threadRunning = true;

    UDPReader(String ip, String socket, String queue, String threadName, JTextArea screen) {
        this.ip = ip;
        this.socket = socket;
        this.queue = queue;
        this.threadName = threadName;
        this.screen = screen;
    }
    
    @Override
    public void run()
    {
        screen.append("Thread " + threadName + " running\n\n");
        
        for(int i = 0; i < 5; i++)
        {
            ExecutorService executor = Executors.newFixedThreadPool(5);
            Runnable reader = new ipaddrConnection(ip, socket, queue, lock);
            executor.execute(reader);
        }
       
        while(threadRunning)
        {

        }
        
        
    }

}
