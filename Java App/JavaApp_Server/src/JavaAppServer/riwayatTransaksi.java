/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppServer;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author patrick
 */
public class riwayatTransaksi extends MyConnect{
    protected int id;
    protected UserServer penyewa;
    protected property rumah;
    protected int durasi;
    protected int jumlah_orang;
    protected String tipe_pembayaran;
    protected String no_kartu;
    protected double diskon;
    protected String tanggal_sewa;
    protected double harga;
    protected String catatan;
    
    public riwayatTransaksi() {
    }

    public riwayatTransaksi(int id,UserServer penyewa, property rumah, int durasi, int jumlah_orang, String tipe_pembayaran, 
            String no_kartu, double diskon, String tanggal_sewa, double harga, String catatan) {
        this.id = id;
        this.penyewa = penyewa;
        this.rumah = rumah;
        this.durasi = durasi;
        this.jumlah_orang = jumlah_orang;
        this.tipe_pembayaran = tipe_pembayaran;
        this.no_kartu = no_kartu;
        this.diskon = diskon;
        this.tanggal_sewa = tanggal_sewa;
        this.harga = harga;
        this.catatan=catatan;
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public UserServer getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(UserServer penyewa) {
        this.penyewa = penyewa;
    }

    public property getRumah() {
        return rumah;
    }

    public void setRumah(property rumah) {
        this.rumah = rumah;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getJumlah_orang() {
        return jumlah_orang;
    }

    public void setJumlah_orang(int jumlah_orang) {
        this.jumlah_orang = jumlah_orang;
    }

    public String getTipe_pembayaran() {
        return tipe_pembayaran;
    }

    public void setTipe_pembayaran(String tipe_pembayaran) {
        this.tipe_pembayaran = tipe_pembayaran;
    }

    public String getNo_kartu() {
        return no_kartu;
    }

    public void setNo_kartu(String no_kartu) {
        this.no_kartu = no_kartu;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public String getTanggal_sewa() {
        return tanggal_sewa;
    }

    public void setTanggal_sewa(String tanggal_sewa) {
        this.tanggal_sewa = tanggal_sewa;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
     public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

      public void ProsesSewa(){
        getConnect();
        
        try {
            state = (Statement)connect.createStatement();
     
            if(!connect.isClosed()){
               
                PreparedStatement sql1 = (PreparedStatement)connect.prepareStatement("insert into riwayat_transaksi values(?,?,?,?,?,?,?,?,?,?,?)");
                sql1.setInt(1, id);
                sql1.setString(2, penyewa.getUsernames());
                sql1.setInt(3, rumah.getId());
                sql1.setDouble(4, harga);
                sql1.setString(5, tanggal_sewa);
                sql1.setInt(6, durasi);
                sql1.setInt(7, jumlah_orang);
                sql1.setString(8, tipe_pembayaran);
                sql1.setString(9, no_kartu);
                 sql1.setDouble(10, diskon);
                 sql1.setString(11, catatan);
                               
                sql1.executeUpdate();
                
                PreparedStatement sql2 = (PreparedStatement)connect.prepareStatement("update properti set status ='Tersewa' where id=?;");
                sql2.setInt(1, rumah.getId());
                sql2.executeUpdate();
            }
            connect.close();
        } catch (SQLException ex) {
//            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      
      public int LihatIdTerakhir()
      {
        getConnect();
        int hasil=0;
        try 
        {
            state = (Statement)connect.createStatement();
     
            if(!connect.isClosed()){
               
                result = state.executeQuery("select id from riwayat_transaksi order by id desc limit 1");
                 while(result.next()){
                    hasil = result.getInt("id") + 1;

                 }
            }
             connect.close();
        } catch (SQLException ex) {
//            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
       
         return hasil;
    }
      
    public ArrayList<riwayatTransaksi> RiwayatPesanan(String namaUser)
    {
        super.getConnect();
        ArrayList<riwayatTransaksi> collection = new ArrayList<riwayatTransaksi>();
            
         try 
         {
            state = (Statement)connect.createStatement();
           if(namaUser == ""){
                result = state.executeQuery("select * from riwayat_transaksi rt inner join properti p on rt.rumah_id = p.id "
                    + "inner join user s on s.username=rt.user_username;");
           }   
           else{
              PreparedStatement sql1 = (PreparedStatement)connect.prepareStatement(" SELECT * FROM riwayat_transaksi rt inner join properti p"
                    + " on rt.rumah_id = p.id inner join user s on s.username = rt.user_username where s.username = ?");
              sql1.setString(1, namaUser);
              result = sql1.executeQuery();
           }
            while(result.next()){
                riwayatTransaksi b = new riwayatTransaksi(
                          result.getInt("rt.id"),
                          new UserServer(result.getString("rt.user_username")),
                          new property(result.getString("p.nama"),result.getString("p.alamat"), result.getDouble("p.harga"), result.getString("p.kota")),
                         result.getInt("rt.durasi_sewa"),
                          result.getInt("rt.jumlah_orang"),
                         result.getString("rt.tipe_pembayaran"),
                          result.getString("rt.nomor_kartu"),
                          result.getDouble("rt.diskon"),
                          result.getString("rt.tanggal_penyewaan"),
                         result.getDouble("rt.harga"),
                         result.getString("rt.catatan")
                );
                collection.add(b); 
            }
            connect.close();
         }
         catch (Exception ex) 
         {
//                 Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
         }
         return  collection;
    }
}