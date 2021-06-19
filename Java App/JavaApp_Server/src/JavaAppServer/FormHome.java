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
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class FormHome extends javax.swing.JFrame implements Runnable{
 ServerSocket ss;
 Socket client;
 DataOutputStream out;
 BufferedReader inp;
 Thread t;
 
 String waktuIn="";
 String waktuOut="";
 double biaya =0;
 int durasi =0;
 String jenis_pembayaran ="";
 String no_rek ="";
 int jumOrg = 0;
 int pid =0;
 int no_urut=0;
 double diskon =0;
 String pengingat="";
 
 String pembeli="";
 String pemilik="";
 
 property p;
 UserServer s; 
   

 ArrayList<property>listRumah = new ArrayList<property>();
    /**
     * Creates new form FormHome
     */
    
    public FormHome() {
         initComponents();
       try {
           
            ss = new ServerSocket(34123);
            client = ss.accept();      
            this.out = new DataOutputStream(client.getOutputStream());
            this.inp = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            if(t == null)
            {
                this.t = new Thread(this,"Client");
                t.start();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(FormHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showChat(String tmp)
    { 
         try {
            String kiriman="";
  
            String[] msg = tmp.split("-");
            if(msg[0].equalsIgnoreCase("reservasi"))
            {
                kiriman ="Selamat Datang!*Apa yang bisa kami bantu?*"
                        + "(Silahkan ikutin perintah di bawah ini:*"
                        + "=>tampilkan rumah*"
                        + "=>cek pemesanan*"
                        + "=>sewa[nama rumah]*"
                        + "=>myrental*"
                        + "=>exit)";
            }

            else if(msg[0].equalsIgnoreCase("tampilkan rumah"))
            {

                p = new property();
                int no=1;
                for(property data : p.DaftarRumah("")){
                    kiriman += no+"."+ data.getNama()+"**Alamat: "+data.getAlamat()+"**Informasi Tambahan: *"+data.getDeskripsi()+"**Kota: "
                            +data.getKota()+"**Status: "+data.getStatus()+"**Tipe: "+data.getTipe_properti()
                            +"*-----------------------------------------------------------------------------------------------------------**";
                    no++;

                }
            }
            else if(msg[0].equalsIgnoreCase("daftar rumah"))
            {
               property p = new property();

                for(property data : p.DaftarRumah("")){
                    kiriman += data.getNama()+"-"+data.getAlamat()+"-"+data.getHarga()+"-";
                }
            }
            else if(msg[0].equalsIgnoreCase("sewa"))
            {   
                String namaRumah = "";
                
                if(msg[2].contains("1"))
                {
                    namaRumah = msg[1].replaceAll("sewa", "");
                    kiriman = "Masukkan tanggal check-in (01/01/2021):";
                    
                }
                else if(msg[2].contains("2"))
                {
                    String[] tgl = msg[1].split("/");
                    waktuIn=tgl[2]+"/" +tgl[1]+"/"+tgl[0]+" " + LocalTime.now();
                    
                    kiriman = "Masukkan tanggal check-out (01/01/2021):";
 
                }
                else if(msg[2].contains("3"))
                {
                    String[] tgl = msg[1].split("/");
                    waktuOut=tgl[2]+"/" +tgl[1]+"/"+tgl[0]+" " + LocalTime.now();
                                        
                    kiriman = "Masukkan jumlah orang:";
                    
                }
                else if(msg[2].contains("4"))
                {
                   jumOrg = Integer.valueOf(msg[1]);
                   
                   kiriman = "Pilih jenis pembayaran dan masukkan nomor rekening"
                            + "*(debit[no rekening]/kredit[no rekekning]):";
 
                }
                else if(msg[2].contains("5"))
                {
                   if(msg[1].contains("debit")){
                        jenis_pembayaran = "Debit";
                         no_rek = msg[1].replaceAll("debit\\[|\\]", "");
                       
                   }
                   else{
                        jenis_pembayaran = "Kredit";
                         diskon = 5;
                         no_rek = msg[1].replaceAll("kredit\\[|\\]", "");
                        
                   } 
                      
                    kiriman = "Apa Anda ingin menambahkan catatan*(Kosongkan jika tidak ada tambahan):";
                }
                 else if(msg[2].contains("6"))
                {
                    if(!(msg[1].equals(""))){
                         pengingat = msg[1];
                   }
                   else{
                         pengingat = "";
                        
                   }  
                      
                    kiriman = "Apakah anda yakin?(ya/tidak)";
                }
                else if(msg[2].contains("7"))
                {
                    if(msg[1].equalsIgnoreCase("ya"))
                    {
                        try{
                            DateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                            
                            Date tglAwal = date.parse(waktuIn);
                            String tamp = String.valueOf(date.format(tglAwal.getTime()));
                                                     
                            Date tglAkhir = date.parse(waktuOut);
                            String tamp2 = String.valueOf(date.format(tglAkhir.getTime()));
                                                      
                            long lama = SelisihHari(tglAwal, tglAkhir);
                            durasi = (int)lama;
                                                        
                            s = new UserServer(pembeli);
                            HitungTotalBiaya(namaRumah);
                            property py = new property(pid);      

                            riwayatTransaksi rt = new riwayatTransaksi(no_urut,
                                  s, py, durasi, jumOrg, jenis_pembayaran,
                                    no_rek, diskon, tamp, biaya,pengingat);
                            rt.ProsesSewa();
                            
                            kiriman = "Proses pembayaran telah berhasil!*Terima kasih telah melakukan pembayaran*di myRental";
                        }catch(Exception o){
                            System.out.println(o.getMessage());
                        }
                    }
                    else
                    {
                        kiriman ="Selamat Datang!*Apa yang bisa kami bantu?*"
                                + "(Silahkan ikutin perintah di bawah ini:*"
                                + "=>tampilkan rumah*"
                                + "=>cek pemesanan*"
                                + "=>sewa[nama rumah]*"
                                + "=>myrental*"
                                + "=>exit)";
                    }
                }
            }
            else if(msg[0].equalsIgnoreCase("CEK PEMESANAN"))
            {

                riwayatTransaksi p = new riwayatTransaksi();
                int no=1;
                int jum=0;
                for(riwayatTransaksi data : p.RiwayatPesanan(pembeli)){
                    kiriman += data.getId()+"."+ data.getRumah().getNama()+"**Alamat: "+data.getRumah().getAlamat()+"**Kota: "+data.getRumah().getKota()
                             +"**Total Biaya: "+data.getHarga()
                            +"*-----------------------------------------------------------------------------------------------------------";
                    no++;
                   jum++;
                }
                if(jum==0){
                    kiriman = "Mohon maaf, Anda belum pernah menyewa rumah.";
                }
               
            }
            else if (msg[0].equalsIgnoreCase("myRental"))
            {
  
                kiriman = "myRental bergerak di bidang penyewaan property. Kalian dapat*menyewa rumah "
                 +"yang disukai melalui website ataupun*aplikasi myRental kami. Untuk pembayaran, kami menyediakan*secara debit maupun kredit. "
                +"*Jika merasa kurang yakin dengan property yang disajikan,*silahkan menghubungi sang pemilik melalui aplikasi kami ini.";
            }
            else if (msg[0].equalsIgnoreCase("exit")){
                kiriman = "Anda telah keluar dari form Reservasi ini.";
            }
            else if(msg[0].equalsIgnoreCase("error")){
                kiriman = "Perintah tidak sesuai";
            }
            else if (msg[0].equalsIgnoreCase("chat")){
           //     pembeli = msg[1];
                pemilik = msg[1];
                
                UserServer p = new UserServer();
                String npemb="";
                
                for(UserServer data : p.DaftarPenyewa(pembeli)){
                   npemb = data.getNama();
                    
                }
                // out.writeBytes("chat-"+npemb+"\n");
                 FormChatUser k = new FormChatUser(client, npemb, pembeli ,pemilik, inp, out);
                
                k.setVisible(true);
              
            }
            else if (msg[0].contains("LOGIN"))
            {                    
                UserServer u = new UserServer();               
                boolean cek = u.checkLogin(msg[1], msg[2]);
                if(cek == true)
                {                    
                    kiriman = "TRUE";
                    pembeli = msg[1];
                }
                else if (cek == false)
                {                    
                    kiriman = "FALSE";
                }
                else
                {
                    kiriman="SALAH";
                }
                System.out.println(cek);
            }
            else if (msg[0].contains("REGISTER"))
            {               
                UserServer u = new UserServer();
               boolean cek = u.checkData(msg[1], msg[3]);;
                
                if(cek == true)
                {                    
                    kiriman = "TRUE";
                   
                }
                else if (cek == false)
                {                    
                    kiriman = "FALSE";
                    u.Register(msg[1], msg[2], msg[3], msg[4], msg[5], msg[6], msg[7]);
                }
                else
                {
                    kiriman = "ERROR";
                }
                System.out.println(cek);
            }
  
         out.writeBytes(kiriman + "\n");
         
     } 
         catch (Exception ex) {
         Logger.getLogger(FormHome.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
    
    private long SelisihHari(Date date1, Date date2){
        long selisih = (date2.getTime()-date1.getTime())/(24*60*60*1000);
        return selisih;
    }
    
    private void HitungTotalBiaya(String n){
        p = new property();
                        
        for(property data : p.DaftarRumah(n)){
             biaya = (durasi * data.getHarga()*jumOrg)*((100-diskon)/100);
             pid = data.getId();
             
        }

        riwayatTransaksi rt = new riwayatTransaksi();
        no_urut = rt.LihatIdTerakhir();
       
    }
    
     public void ChatTable(){
       
        try {
            chat c = new chat();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            Object[] rowData = new Object[2];
         
            for(chat ch : c.RiwayatChat("")){

                 rowData[0] = ch.penyewa.getUsernames();
                 rowData[1] = ch.isiChat;
                
                 model.addRow(rowData);
            }

        }
        catch (Exception ex) {
            Logger.getLogger(FormHome.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public void RiwayatTable(){
       
        try {
            riwayatTransaksi rt = new riwayatTransaksi();
            
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            model.setRowCount(0);
            Object[] rowData = new Object[6];
         
            for(riwayatTransaksi rts : rt.RiwayatPesanan("")){
                 rowData[0] = rts.id;
                 rowData[1] = rts.rumah.getNama();
                 rowData[2] = rts.penyewa.getUsernames();
                 rowData[3] = rts.tanggal_sewa;
                 rowData[4] = rts.durasi;
                 rowData[5] = rts.jumlah_orang;
                 model.addRow(rowData);
            }

        }
        catch (Exception ex) {
            Logger.getLogger(FormHome.class.getName()).log(Level.SEVERE, null, ex);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("myRental");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User", "Chat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Reservasi", "Rumah", "Pemesan", "Tanggal Check In", "Durasi Sewa", "Jumlah Orang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Riwayat Reservasi Properti");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Konsultasi Penyewa");

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKeluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int i = jTable2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        
        String id = model.getValueAt(i, 0).toString();
        String rumah = model.getValueAt(i, 1).toString();
        String penyewa = model.getValueAt(i, 2).toString();
        String tgl = model.getValueAt(i, 3).toString();
        String durasi = model.getValueAt(i, 4).toString();
        String jumOrang = model.getValueAt(i, 5).toString();
        String catat="";
                 
        riwayatTransaksi ns = new riwayatTransaksi();
         
        for(riwayatTransaksi a : ns.RiwayatPesanan(penyewa)){
            catat = a.getCatatan();
        }
       
        FormDetailTransaksi k = new FormDetailTransaksi(client, id, rumah, penyewa,
             tgl,durasi,jumOrang, catat,out,inp);

        k.setVisible(true);
       
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     try {
         // TODO add your handling code here:
         int i = jTable1.getSelectedRow();
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         
         String username = model.getValueAt(i, 0).toString();
         riwayatTransaksi ns = new riwayatTransaksi();
         
         for(riwayatTransaksi a : ns.RiwayatPesanan(username)){
             pembeli = a.penyewa.getNama();
             pemilik ="Pemilik"+ a.rumah.getNama();
         }
         
//         FormChatUser k = new FormChatUser(client,pembeli,pemilik,out,inp);
//       
//         k.setVisible(true);
         
     } catch (Exception ex) {
         Logger.getLogger(FormHome.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
         //To change body of generated methods, choose Tools | Templates.
          try {
    
                while(true)
                {
                  
                    RiwayatTable();
                    ChatTable();
                    String msg = inp.readLine();
 
                    this.showChat(msg);
 
                }
            }
             catch (Exception ex) {
                 Logger.getLogger(FormHome.class.getName()).log(Level.SEVERE, null, ex);
             }

               
               
        }
    }

