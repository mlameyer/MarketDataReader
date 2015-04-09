/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import EmailNotifier.Email;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Administrator
 */
public class FeedIntegrityChecker 
{
    private int i = 0;
    private Thread t;
    private Timer timer;
    private Email email;
    private String ip, socket, queue, threadName;
    JTextArea screen;
    
    public FeedIntegrityChecker(Thread t, String ip, String socket, String threadName, JTextArea screen)
    {
        this.t = t;
        this.ip = ip;
        this.socket = socket;
        this.threadName = threadName;
        this.screen = screen;
    }

    public void check() 
    {
        timer = new Timer();
        timer.scheduleAtFixedRate(new ThreadCheck(), 15 * 1000, 60 * 1000);
    }
    
    private class ThreadCheck extends TimerTask
    {
        public void run()
        {
            if(t.isAlive() == false)
            {
                System.out.println("Thread " + t.getName() + " is " + t.getState() + " Not Good!!!!!!");
                String ErrorMessage = "Thread " + threadName + " has failed, Attempting to Restart";
                screen.append("Thread " + threadName + " has failed, Attempting to Restart\n");
                Email email = new Email(ErrorMessage,"WARNING Market Data Reader Failure");
                email.sendMail();
                t = RestartFeed();
            }
            else if(t.isAlive())
            {
                System.out.println("Thread " + t.getName() + " is " + t.getState());
            }
        }     

        private Thread RestartFeed() {
            
            if(i < 10)
            {
                try {
                    t = new Thread(new UDPReader(ip, socket, queue, threadName, screen));
                    t.start();
                    Thread.sleep(6000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FeedIntegrityChecker.class.getName()).log(Level.SEVERE, null, ex);
                    String ErrorMessage = "Thread " + threadName + " has failed, Contact System Administraitor";
                    screen.append("Thread " + threadName + " has failed, Contact System Administraitor\n");
                    email = new Email(ErrorMessage,"WARNING Market Data Reader Failure");
                }
                i++;
            }
            
            if(i == 10)
            {
                String ErrorMessage = "Thread " + threadName + " has failed, Contact System Administraitor";
                screen.append("Thread " + threadName + " has failed, Contact System Administraitor\n");
                email = new Email(ErrorMessage,"WARNING Market Data Reader Failure");
                
                timer.cancel();
            }
            
            return t;
        }
    }
}
