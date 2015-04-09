/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public final class ipaddrConnection implements Runnable
{
    private ReentrantLock lock;
    private byte[] bytes = new byte[(int)100000];
    private InetAddress group; 
    private MulticastSocket s;
    private DatagramPacket packet = new DatagramPacket(bytes, bytes.length);;
    private String queue, threadName;

    public ipaddrConnection(String ip, String socket, String queue, ReentrantLock lock) {
        try {
            this.s = new MulticastSocket(Integer.parseInt(socket));
            this.group = InetAddress.getByName(ip);
            this.queue = queue;
            this.lock = lock;
        } catch (IOException ex) {
            Logger.getLogger(ipaddrConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
        public void run() {
            try {
                parseUDP p = new parseUDP(queue);
                s.joinGroup(group);
                //s.setSoTimeout(95000);//95000

                while(true)
                {
                    try
                    {
                        s.receive(packet);
                        
                        lock.lock();
                        
                        byte[] readData = Arrays.copyOf(packet.getData(), packet.getLength());
/*
                        StringBuilder sb = new StringBuilder();
                        for (byte b : packet.getData()) 
                        {
                            sb.append(String.format("%02X ", b));
                        }
                        

                        System.out.println("PK:: " + sb.toString());
                        System.out.println("PK:: " + packet.getLength());

                        StringBuilder sb1 = new StringBuilder();
                        for (byte b : readData) 
                        {
                            sb1.append(String.format("%02X ", b));
                        }
                        System.out.println("RD:: " + sb1.toString());
                        System.out.println("RD:: " + readData.length);
*/
                        p.parseUDP(readData);
                        //packet.setLength(bytes.length);
                    } 
                    finally
                    {
                        lock.unlock();
                    }   
                }   
            } catch (SocketException ex) {
                Logger.getLogger(ipaddrConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ipaddrConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}

