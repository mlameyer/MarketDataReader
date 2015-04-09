/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marketdatareader;

import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class MarketDataReader extends JFrame{
    
    private static void mainWindow(InputStream inputStream)
    {
        MarketDataReader mainwindow = new MarketDataReader();
        mainwindow.setMinimumSize(new Dimension(1200, 600)); 
        mainwindow.setResizable(false);
        mainwindow.setTitle("Market Data Reader 1"); 
        mainwindow.add(new readerWindow(inputStream));
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainwindow.pack();
        mainwindow.setLocationRelativeTo(null);
        mainwindow.setVisible(true);
    }
    public static void main(String[] args) throws IOException {  
	String propFileName = "C:\\ProgramData\\MDR\\configReader1.properties";

	InputStream inputStream = new FileInputStream(propFileName);
        mainWindow(inputStream);
    }
    
}
