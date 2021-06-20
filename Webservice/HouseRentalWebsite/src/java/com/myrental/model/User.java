/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental.model;

import com.mysql.jdbc.*;
import java.sql.Date;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.remote.JMXConnectorFactory;
/**
 *
 * @author Acer
 */
public class User extends myConnection{
    private String username;
    private String password;
    private String nama;
    private String alamat;
    private String nomor_telepon;
    private String tanggal_lahir;
    private String tempat_lahir;

    public User() {
        getConnect();
    }
    
    public User(String username, String password, String nama, String alamat, String nomor_telepon, String tanggal_lahir, String tempat_lahir) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.tanggal_lahir = tanggal_lahir;
        this.tempat_lahir = tempat_lahir;
        getConnect();
        
    }
    
    public User(String username, String password, String nama, String alamat, String nomor_telepon) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        getConnect();
    }
    
    public User(String username, String password, String nama) {
        this.username = username;
        this.password = password;
        this.nama = nama;
     
        getConnect();
    }
    
    public User(String username, String password, String nama, String alamat, String nomor_telepon, String tempat_lahir) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.tempat_lahir = tempat_lahir;
    }


    public User(String username, String password) {
        this.username = username;
        this.password = password;
        getConnect();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public ArrayList<User> showData(){
        getConnect();
        ArrayList<User> temp = new ArrayList<User>();
        try {
            stat = (Statement)connect.createStatement();
            result = stat.executeQuery("SELECT * FROM user");
            while(result.next()){
                User u = new User(
                        result.getString("username"),
                        result.getString("password"),
                        result.getString("nama"),
                        result.getString("alamat"),
                        result.getString("nomor_telpon"),
                        result.getString("tempat_lahir"),
                        result.getString("tanggal_lahir")
                );
                temp.add(u);
            }
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
    
    public void insert(){
        try {
            PreparedStatement sql = (PreparedStatement)connect.prepareStatement("INSERT INTO user (username, password, nama, alamat, nomor_telpon, tanggal_lahir, tempat_lahir) VALUES (?,?,?,?,?,?,?)");
            
            sql.setString(1, getUsername());
            sql.setString(2, getPassword());
            sql.setString(3, getNama());
            sql.setString(4, getAlamat());
            sql.setString(5, getNomor_telepon());
            sql.setString(6, getTanggal_lahir());
            sql.setString(7, getTempat_lahir());
            
            sql.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
