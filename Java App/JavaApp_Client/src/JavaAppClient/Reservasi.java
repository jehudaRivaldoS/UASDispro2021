/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppClient;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patrick
 */
public class Reservasi extends javax.swing.JFrame implements Runnable {

    Socket client;
    DataOutputStream out;
    BufferedReader inp;
    int i = 1;
    Thread t;
    String user = "";
    String diterima = "";
    boolean onWhile = true;
    FormPilihan frm;

    /**
     * Creates new form Reservasi
     */
    public Reservasi() {
        initComponents();
    }

    public Reservasi(FormPilihan form, Socket s, int no, String nama) {
        initComponents();
        try {
            frm = form;
            this.client = s;
            user = nama;
            this.out = new DataOutputStream((client.getOutputStream()));
            this.inp = new BufferedReader(new InputStreamReader(client.getInputStream()));
            if (t == null) {
                this.t = new Thread(this, "Client");
                t.start();
            }
        } catch (Exception ex) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        btnKirim = new javax.swing.JButton();
        scrllPanePesan = new javax.swing.JScrollPane();
        txtAreaPesan = new javax.swing.JTextArea();
        lblJudul = new javax.swing.JLabel();
        txtFieldPesan = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnKirim.setText("KIRIM");
        btnKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirimActionPerformed(evt);
            }
        });

        txtAreaPesan.setEditable(false);
        txtAreaPesan.setColumns(20);
        txtAreaPesan.setRows(5);
        scrllPanePesan.setViewportView(txtAreaPesan);

        lblJudul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblJudul.setText("RESERVASI FORM");

        txtFieldPesan.setText("Ketikkan pesan....");
        txtFieldPesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFieldPesanMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrllPanePesan)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 136, Short.MAX_VALUE)
                .addComponent(lblJudul)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtFieldPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKirim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJudul)
                .addGap(30, 30, 30)
                .addComponent(scrllPanePesan, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKirim)
                    .addComponent(txtFieldPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void sendChat(String msg) {
        try {
            out.writeBytes(msg + "\n");
            System.out.println(msg);
        } catch (Exception ex) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showChat() {
        try {
            diterima = inp.readLine();
            System.out.println(diterima);
            if (diterima.contains("check-in") || diterima.contains("durasi sewa") || diterima.contains("jenis pembayaran")
                    || diterima.contains("jumlah orang") || diterima.contains("ya/tidak") || diterima.contains("catatan")) {
                i++;
            } else if (diterima.contains("Selamat Datang!")) {
                i = 1;
            } else if (diterima.contains("Bye")) {
                onWhile = false;
                frm.setEnabled(true);
                this.dispose();
            }
            txtAreaPesan.append(diterima + "\n");
        } catch (Exception ex) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirimActionPerformed
        try {
            // TODO add your handling code here:
            String msg = txtFieldPesan.getText();
            txtAreaPesan.append(txtFieldPesan.getText() + "\n");

            if (msg.contains("sewa")) {
                String[] str = msg.split(":");
                msg = "sewa/" + str[1] + "/1";
            } else if ((!msg.contains("sewa")) && i > 1) {
                msg = "sewa/" + txtFieldPesan.getText() + "/" + i;
            } else if (!(msg.contains("sewa") || msg.contains("myrental")
                    || msg.contains("cek pemesanan") || msg.contains("tampilkan rumah"))) {
                msg = "error";
            } else if (msg.contains("Terima kasih")) {
                out.writeBytes("reservasi\n");
            }
            sendChat(msg);
        } catch (Exception ex) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnKirimActionPerformed

    private void txtFieldPesanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldPesanMousePressed
        // TODO add your handling code here:
        txtFieldPesan.setText("");
    }//GEN-LAST:event_txtFieldPesanMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sendChat("Bye");
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKirim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JScrollPane scrllPanePesan;
    private javax.swing.JTextArea txtAreaPesan;
    private javax.swing.JTextField txtFieldPesan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            System.out.println("265");
            String booking = "reservasi";
            System.out.println("267");
            this.sendChat(booking);
            while (onWhile) {
                System.out.println("271");
                this.showChat();
            }
        } catch (Exception e) {
            Logger.getLogger(Reservasi.class.getName()).log(Level.SEVERE, null, e);
        } //To change body of generated methods, choose Tools | Templates.
    }
}
