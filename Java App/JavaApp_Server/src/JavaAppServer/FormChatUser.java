/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppServer;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Acer
 */
public class FormChatUser extends javax.swing.JFrame implements Runnable {

    Socket client;
    ServerSocket ss;
    String pesan = "";
    DataOutputStream out;
    BufferedReader inp;
    Thread t;
    String nama = "";
    boolean onWhile = true;
    /**
     * Creates new form FormChatUser
     */
    public FormChatUser() {
        initComponents();
    }

    public FormChatUser(Socket c, String npemb, DataOutputStream outs, BufferedReader inps) {
        try {
            initComponents();
            client = c;
            nama = npemb;
            jLabel1.setText(npemb);
            this.out = outs;
            this.inp =  inps;
            
            System.out.println("51");
            if (t == null) {
                System.out.println("53");
                this.t = new Thread(this, "Client");
                t.start();
            }
        } catch (Exception ex) {
            Logger.getLogger(FormChatUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sendChat(String msg) {
        try {
            //this.out = new DataOutputStream(client.getOutputStream());
            out.writeBytes(msg + "\n");
        } catch (Exception ex) {
            Logger.getLogger(FormChatUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showChat() {
        try {
            //  this.inp = new BufferedReader(new InputStreamReader(client.getInputStream()));
            //Menerima pesan dari Server
            System.out.println("95");
            String pesan = inp.readLine();
            System.out.println(pesan);
            //Menampilkan pesan
            if (pesan.contains("Bye")) {
                sendChat("Bye");
                onWhile=false;
                this.dispose();
            } else if (!pesan.contains("chat/myRental")) {
                txtAreaMsg.append(pesan + "\n");
            }
            System.out.println("100");
//            //Memasukkan chat ke dalam database 
//            DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Calendar cal = Calendar.getInstance();
//            String waktu = date.format(cal.getTime());

//            UserServer s = new UserServer(nama);
//            chat c = new chat(s,waktu,pesan);
//            c.CatatChat();
        } catch (Exception ex) {
            Logger.getLogger(FormChatUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMsg = new javax.swing.JTextArea();
        txtMsg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSend1 = new javax.swing.JButton();
        btnSend2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtAreaMsg.setColumns(20);
        txtAreaMsg.setRows(5);
        jScrollPane1.setViewportView(txtAreaMsg);

        jLabel2.setText("Pesan:");

        btnSend.setText("Kirim");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("kennethangelo");

        btnSend1.setText("Audio");
        btnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend1ActionPerformed(evt);
            }
        });

        btnSend2.setText("Video");
        btnSend2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(101, 101, 101)
                        .addComponent(btnSend1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSend2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSend1)
                    .addComponent(btnSend2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSend))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String pesan = txtMsg.getText();
        txtAreaMsg.append("Me: " + pesan + "\n");
        this.sendChat("myRental: " + pesan);
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend1ActionPerformed
        FormAudioServer frm = new FormAudioServer();
        frm.setVisible(true);

    }//GEN-LAST:event_btnSend1ActionPerformed

    private void btnSend2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSend2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormChatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChatUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSend1;
    private javax.swing.JButton btnSend2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaMsg;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            out.writeBytes("Halo, " + nama);
            while (onWhile) { //Thread membuat Client selalu menerima pesan dari Server
                this.showChat();
            }
        } catch (Exception e) {
            Logger.getLogger(FormChatUser.class.getName()).log(Level.SEVERE, null, e);
        }//To change body of generated methods, choose Tools | Templates.
    }
}
