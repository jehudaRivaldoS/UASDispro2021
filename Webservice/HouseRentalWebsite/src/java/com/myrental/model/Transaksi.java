/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental.model;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Transaksi extends myConnection{
    private int id;
    private User username;
    private Properti properti;
    private double harga;
    private Date tanggal_penyewaan;
    private int durasi_sewa;
    private int jumlah_orang;
    private String tipe_pembayaran;
    private String nomor_kartu;
    private List<Foto> listFoto;
    
    public Transaksi() {
        getConnect();
    }

    public Transaksi(int id, User username, Properti properti, double harga, Date tanggal_penyewaan, int durasi_sewa, int jumlah_orang, String tipe_pembayaran, String nomor_kartu) {
        this.id = id;
        this.username = username;
        this.properti = properti;
        this.harga = harga;
        this.tanggal_penyewaan = tanggal_penyewaan;
        this.durasi_sewa = durasi_sewa;
        this.jumlah_orang = jumlah_orang;
        this.tipe_pembayaran = tipe_pembayaran;
        this.nomor_kartu = nomor_kartu;
        getConnect();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public Properti getProperti() {
        return properti;
    }

    public void setProperti(Properti properti) {
        this.properti = properti;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public Date getTanggal_penyewaan() {
        return tanggal_penyewaan;
    }

    public void setTanggal_penyewaan(Date tanggal_penyewaan) {
        this.tanggal_penyewaan = tanggal_penyewaan;
    }

    public int getDurasi_sewa() {
        return durasi_sewa;
    }

    public void setDurasi_sewa(int durasi_sewa) {
        this.durasi_sewa = durasi_sewa;
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

    public String getNomor_kartu() {
        return nomor_kartu;
    }

    public void setNomor_kartu(String nomor_kartu) {
        this.nomor_kartu = nomor_kartu;
    }
    

//    public ArrayList<Transaksi> showData(){
//        ArrayList<Transaksi> temp = new ArrayList<Transaksi>();
//        try {
//            stat = (Statement)connect.createStatement();
//            result = stat.executeQuery("SELECT * FROM riwayat_transaksi");
//            while(result.next()){
//                //koneksinya ke class user & properti
//                Transaksi t = new Transaksi(
//                        result.getInt("id"),
//                        result.getString("username"),
//                        result.getString("properti_id"),
//                        result.getDouble("harga"),
//                        result.getDate("tanggal_penyewaan"),
//                        result.getInt("durasi_sewa"),
//                        result.getString("tipe_pembayaran"),
//                        result.getString("nomor_kartu")
//                );
//                temp.add(t);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
    
//    public void insert(){
//        try {
//            PreparedStatement sql = (PreparedStatement)connect.prepareStatement("INSERT INTO riwayat_transaksi (username, properti_id, harga, tanggal_penyewaan, durasi_sewa, jumlah_orang, tipe_pembayaran, nomor_kartu) VALUES (?,?,?,?,?,?,?,?)");
//            
//            sql.setString(1, getUsername());
//            sql.setString(2, getProperti());
//            sql.setDouble(3, getHarga());
//            sql.setDate(4, getTanggal_penyewaan());
//            sql.setInt(5, getDurasi_sewa());
//            sql.setInt(6, getJumlah_orang());
//            sql.setString(7, getTipe_pembayaran());
//            sql.setString(8, getNomor_kartu());
//
//            sql.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
