/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppServer;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author patrick
 */
public class Property extends MyConnect{
    private int id;
    private String nama;
    private String alamat;
    private String deskripsi;
    private int harga;
    private double rating;
    private String kota;
    private String tipe_properti;

    public Property(int id,String nama, String alamat, String deskripsi, int harga, double rating, String kota, String tipe_properti) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.rating = rating;
        this.kota = kota;
        this.tipe_properti = tipe_properti;
        
    }

    public Property() {
        
    }
    public Property(int id) {
        this.id=id;
    }
    public Property(String nama, String alamat, int harga, String kota) {
        this.nama = nama;
        this.alamat = alamat;
        this.harga = harga;
        this.kota = kota;
   
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getTipe_properti() {
        return tipe_properti;
    }

    public void setTipe_properti(String tipe_properti) {
        this.tipe_properti = tipe_properti;
    }

     public ArrayList<Property> DaftarRumah(String tipe)
    {
        super.getConnect();
        ArrayList<Property> collection = new ArrayList<Property>();
            
         try 
         {
            state = (Statement)connect.createStatement();
            if(tipe.equals("")){
                result = state.executeQuery("select * from properti");
            }
            else{
                PreparedStatement sql1 = (PreparedStatement)connect.prepareStatement("select * from properti where nama = '"+ tipe +"'");
                
                result = sql1.executeQuery();
            }
            while(result.next()){
                Property b =  new Property(
                        result.getInt("id"),
                        result.getString("nama"),
                        result.getString("alamat"),
                        result.getString("deskripsi"),
                        result.getInt("harga"),
                        result.getDouble("rating"),
                        result.getString("kota"),
                        result.getString("tipe_properti")
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
