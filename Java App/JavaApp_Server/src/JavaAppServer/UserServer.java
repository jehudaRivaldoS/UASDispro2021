/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppServer;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author patrick
 */
public class UserServer extends MyConnect{
    protected String usernames;
    protected String nama;
    protected String password;
    protected String alamat;
    protected String nomorTelepon;
    protected String tanggalLahir;
    protected String tempatLahir;

     public UserServer(String usernames, String nama, String password, String alamat, String nomorTelepon, String tanggalLahir, String tempatLahir) {
        this.usernames = usernames;
        this.nama = nama;
        this.password = password;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatLahir;
    }
  
    public UserServer(String usernames, String nama) {
        this.usernames = usernames;
        this.nama = nama;
    }

    public UserServer() {
    }

    public UserServer(String usernames) {
        this.usernames = usernames;
    }    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String username) {
        this.usernames = username;
    }
    
    public ArrayList<UserServer> DaftarPenyewa(String tipe)
    {
        super.getConnect();
        ArrayList<UserServer> collection = new ArrayList<UserServer>();
            
         try 
         {
            state = (Statement)connect.createStatement();
            if(tipe.equals("")){
                result = state.executeQuery("select * from user");
            }
            else{
                PreparedStatement sql1 = (PreparedStatement)connect.prepareStatement("select * from user where username = ?");
                 sql1.setString(1, tipe);
                result = sql1.executeQuery();
            }
            while(result.next()){
                UserServer b =  new UserServer(
                        result.getString("username"),
                        result.getString("nama")
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
         return collection;
    }
    
    public boolean checkLogin(String username, String password) {
        Boolean hasil = false;
        int banyak=0;
        super.getConnect();
        try {

            state = (Statement) connect.createStatement();
            java.sql.PreparedStatement sql = (java.sql.PreparedStatement) connect.prepareStatement("select * from user where username=? and password=?");

            sql.setString(1, username);
            sql.setString(2, password);

            result = sql.executeQuery();

            if (result.next()) {
                hasil = true;
            }
            connect.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }
    
    public void Register(String username, String password, String nama, String alamat,String nomorTelepon, String tglLahir, String tempatLahir){
       
           super.getConnect();
         try{
             state = (Statement) connect.createStatement();
     
             if (!connect.isClosed()) {
                 java.sql.PreparedStatement sql = (java.sql.PreparedStatement) connect.prepareStatement("Insert into user values (?,?,?,?,?,?,?,?)");
                 sql.setString(1, username);
                 sql.setString(2, password);
                 sql.setString(3, nama);
                 sql.setString(4, alamat);
                 sql.setString(5, nomorTelepon);
                 sql.setString(6, tglLahir);
                 sql.setString(7, tempatLahir);   
                sql.setString(8, null); 
                
                sql.executeUpdate();
             }
             connect.close();
         }
         catch(Exception e){
             System.err.println(e);
         }
      
    }
    
     public boolean checkData(String username, String nama){
          Boolean hasil = false;
        super.getConnect();
        try{
            state = (Statement) connect.createStatement();
            java.sql.PreparedStatement sql = (java.sql.PreparedStatement) connect.prepareStatement("select * from user where username=? and nama=?");
            
            sql.setString(1, username);
            sql.setString(2, nama);
            
            result = sql.executeQuery();
            
            if(result.next())
            {
                hasil = true;
            }
             connect.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return hasil;
    }     
}
