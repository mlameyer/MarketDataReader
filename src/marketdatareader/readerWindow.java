/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import EmailNotifier.Email;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Administrator
 */
class readerWindow extends JPanel 
{
    private Thread tA;
    private Thread tB;
    Properties prop = new Properties();
    JTextArea screen = new JTextArea();
    JButton readerA = new JButton("Options Start");
    JButton readerB = new JButton("Futures Start");
    JButton replayA = new JButton("Options Replay");
    JButton replayB = new JButton("Futures Replay");
    JMenuBar menuBar;
    JMenu menu, submenu;
    JMenuItem menuItem, fileitem;
    
    public readerWindow(InputStream inputStream) 
    {
        super(new BorderLayout());
        JPanel menuPanel = new JPanel(new BorderLayout());
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel2 = new JPanel(new GridLayout(0,1));
        
        screen.setEditable(false);
        screen.setWrapStyleWord(true);
        screen.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(screen);
        
        menuBar = new JMenuBar();
        
        menu = new JMenu("File");
        fileitem = new JMenuItem("Exit Program",
                                 KeyEvent.VK_T);
        
        menu.add(fileitem);
        menuBar.add(menu);
        menu = new JMenu("Menu");
        menu.setMnemonic(KeyEvent.VK_M);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);
        
        menuItem = new JMenuItem("Manual Load",
                                 KeyEvent.VK_T);
        menu.add(menuItem);
        
        
        
        menuPanel.add(menuBar);
        panel1.add(readerA);
        panel1.add(readerB);
        panel1.add(replayA);
        panel1.add(replayB);
        panel2.add(scroll);
        
        add(menuPanel, BorderLayout.NORTH);
        add(panel1,BorderLayout.WEST);
        add(panel2, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        
        fileitem.addActionListener(new exitProgram());
        readerA.addActionListener(new feedA(inputStream));
        readerB.addActionListener(new feedB(inputStream));
    }

    private class feedA implements ActionListener 
    {
        //Properties prop = new Properties();
        private String ip, socket, queue, threadName = "Feed A";

        public feedA(InputStream inputStream) 
        {
            try {
                prop.load(inputStream);
                
                ip = prop.getProperty("ConnectionID461IAIP");
                socket = prop.getProperty("ConnectionID461IASocket");
                queue = prop.getProperty("Channel461MSMQ");
            } catch (IOException ex) {
                Logger.getLogger(readerWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            screen.append("Reader A Started "  + new Date() + "\n\n");
            screen.append("Channel 461 IA config file loading "  + new Date() + "\n"
                            + "Channel IP: " + ip + "\nChannel Socket: " + socket
                            + "\nMSMQ loaction: " + queue + "\n\n");
            
            tA = new Thread(new UDPReader(ip, socket, queue, threadName, screen));
            tA.start();
            FeedIntegrityChecker feed = new FeedIntegrityChecker(tA, ip, socket, threadName, screen);
            feed.check();
        }
    }

    private class feedB implements ActionListener 
    {
        //Properties prop = new Properties();
        private String ip, socket, queue, threadName = "Feed B";

        public feedB(InputStream inputStream) 
        {
            try {
                prop.load(inputStream);
                
                ip = prop.getProperty("ConnectionID460IAIP");
                socket = prop.getProperty("ConnectionID460IASocket");
                queue = prop.getProperty("Channel460MSMQ");
            } catch (IOException ex) {
                Logger.getLogger(readerWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            screen.append("Reader B Started "  + new Date() + "\n\n");
            screen.append("Channel 460 IA config file loading "  + new Date() + "\n"
                            + "Channel IP: " + ip + "\nChannel Socket: " + socket
                            + "\nMSMQ loaction: " + queue + "\n\n");
            
            tB = new Thread(new UDPReader(ip, socket, queue, threadName, screen));
            tB.start();
            FeedIntegrityChecker feed = new FeedIntegrityChecker(tB, ip, socket, threadName, screen);
            feed.check();
        }
    }
    
    public class manualProcedures implements ActionListener 
    {
            @Override
            public void actionPerformed (ActionEvent e) 
            {
               //man.OpenWindow();
            }
    }
    
    public class exitProgram implements ActionListener 
    {
            @Override
            public void actionPerformed (ActionEvent e) 
            {
               Email email = new Email("Market Data Reader 1 Application has "
                       + "been Intentionally closed!!!!","WARNING Market Data "
                       + "Reader Has been Closed");
               email.sendMail();
               System.exit(0);
            }
    }
    
}
