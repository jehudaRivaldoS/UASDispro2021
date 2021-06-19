/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppClient;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;

/**
 *
 * @author MyAcer
 */
public class FormMicClient extends javax.swing.JFrame {

    /**
     * Creates new form FormMicClient
     */
     public byte[] buffer;
    private int port;
    static AudioInputStream ais;
    static SourceDataLine sourceDataLine;
    
    static AudioFormat format;
    static boolean status = true;
    
    static int sampleRate = 44100;

    static DataLine.Info dataLineInfo;
    /**
     * Creates new form FormAudioUser
     */
     TargetDataLine line;
    AudioInputStream audioInputStream;   
    public FormMicClient() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Mic");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws LineUnavailableException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMicClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMicClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMicClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMicClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMicClient().setVisible(true);
                
                try
        {
            
            System.setProperty("java.net.preferIPv4Stack", "true");
            TargetDataLine line;
            DatagramPacket dgp;
            AudioFormat.Encoding encoding = AudioFormat.Encoding.PCM_SIGNED;
            float rate = 44100.0f;
            int channels = 2;
            int sampleSize = 16;
            boolean bigEndian = false;
            InetAddress addr;
            int port = 40005;
            System.out.println("Server started at port:" + port);
            format = new AudioFormat(sampleRate, 16, 2, true, false);
            dataLineInfo = new DataLine.Info(SourceDataLine.class, format);
            sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
            sourceDataLine.open(format);
            sourceDataLine.start();
            AudioFormat format = new AudioFormat(encoding, rate, sampleSize, channels, (sampleSize / 8) * channels, rate, bigEndian);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
            if (!AudioSystem.isLineSupported(info)) {
                System.out.println("Line matching " + info + " not supported.");
                return;
            }
            try
            {
                line = (TargetDataLine) AudioSystem.getLine(info);
                
                line.open(format);
                
                line.start();
                
                byte[] data = new byte[4096];
                byte[] receiveData = new byte[4096];
                addr = InetAddress.getByName("225.6.7.8");
                MulticastSocket socket = new MulticastSocket();
                MulticastSocket mSocket = new MulticastSocket(port);
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                ByteArrayInputStream baiss = new ByteArrayInputStream(receivePacket.getData());
                while (true) {
                    // Read the next chunk of data from the TargetDataLine.
                    line.read(data, 0, data.length);
                    // Save this chunk of data.
                    dgp = new DatagramPacket (data,data.length,addr,port);
                    
                    socket.send(dgp);
                    mSocket.receive(receivePacket);
                    ais = new AudioInputStream(baiss, format, receivePacket.getLength());
                    toSpeaker(receivePacket.getData());
                }
                
            }catch (LineUnavailableException e) {
                e.printStackTrace();
            }catch (UnknownHostException e) {
                // TODO: handle exception
            } catch (SocketException e) {
                // TODO: handle exception
            } catch (IOException e2) {
                // TODO: handle exception
            }

        }catch (LineUnavailableException ex) {
             Logger.getLogger(FormMicClient.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        });
        
    }
    public static void toSpeaker(byte soundbytes[]) {
        try
        {
            System.out.println("At the speaker");
            sourceDataLine.write(soundbytes, 0, soundbytes.length);
        } catch (Exception e) {
            System.out.println("Not working in speakers...");
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}