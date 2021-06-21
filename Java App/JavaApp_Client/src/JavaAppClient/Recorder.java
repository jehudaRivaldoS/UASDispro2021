/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppClient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.TargetDataLine;

/**
 *
 * @author Acer
 */
public class Recorder extends Thread {

    public TargetDataLine audio_in = null;
    public DatagramSocket dOut;
    byte byte_buff[] = new byte[512];
    public InetAddress server_ip;
    public int server_port;

    @Override
    public void run() {
        int i = 0;
        while (AudioClient.calling) {
            try {
                audio_in.read(byte_buff, 0, byte_buff.length);
                DatagramPacket data = new DatagramPacket(byte_buff, byte_buff.length, server_ip, server_port);
                System.out.println("Send #" + i++);
                dOut.send(data);
            } catch (IOException ex) {
                Logger.getLogger(Recorder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        audio_in.close();
        audio_in.drain();
        System.out.println("Thread stop");
    }
}
