/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Acer
 */
public class Player extends Thread {
    
    public DatagramSocket dIn;
    public SourceDataLine audio_out;
    byte[] buffer = new byte[512];
    
    
    @Override
    public void run() {
        DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
        int i = 0;
        while(AudioServer.calling){
            try {
                dIn.receive(incoming);
                buffer = incoming.getData();
                audio_out.write(buffer, 0, buffer.length);
                System.out.println("#" + i++);
            } catch (IOException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
        audio_out.close();
        audio_out.drain();
        System.out.println("Stop");
    }
}
