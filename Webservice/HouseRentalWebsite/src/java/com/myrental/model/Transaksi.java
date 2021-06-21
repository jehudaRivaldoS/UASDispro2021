/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental.model;

import com.mysql.jdbc.Blob;
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
public class Transaksi extends myConnection {

    private int id;
    private User user;
    private Properti properti;
    private int harga;
    private String tanggal_penyewaan;
    private int durasi_sewa;
    private int jumlah_orang;
    private String tipe_pembayaran;
    private String nomor_kartu;
    private String catatan;
    private int status;

    public Transaksi() {
        getConnect();
    }

    public Transaksi(int id, User user, Properti properti, int harga, String tanggal_penyewaan, int durasi_sewa, int jumlah_orang, String tipe_pembayaran, String nomor_kartu, int status) {
        this.id = id;
        this.user = user;
        this.properti = properti;
        this.harga = harga;
        this.tanggal_penyewaan = tanggal_penyewaan;
        this.durasi_sewa = durasi_sewa;
        this.jumlah_orang = jumlah_orang;
        this.tipe_pembayaran = tipe_pembayaran;
        this.nomor_kartu = nomor_kartu;
        this.status = status;
        getConnect();
    }

    public Transaksi(int id, User user, Properti properti, int harga, String tanggal_penyewaan, int durasi_sewa, int jumlah_orang, String tipe_pembayaran, String nomor_kartu, String catatan, int status) {
        this.id = id;
        this.user = user;
        this.properti = properti;
        this.harga = harga;
        this.tanggal_penyewaan = tanggal_penyewaan;
        this.durasi_sewa = durasi_sewa;
        this.jumlah_orang = jumlah_orang;
        this.tipe_pembayaran = tipe_pembayaran;
        this.nomor_kartu = nomor_kartu;
        this.catatan = catatan;
        this.status = status;
        getConnect();
    }

    public Transaksi(User user, Properti properti, int harga, String tanggal_penyewaan, int durasi_sewa, int jumlah_orang, String tipe_pembayaran, String nomor_kartu, String catatan, int status) {
        this.user = user;
        this.properti = properti;
        this.harga = harga;
        this.tanggal_penyewaan = tanggal_penyewaan;
        this.durasi_sewa = durasi_sewa;
        this.jumlah_orang = jumlah_orang;
        this.tipe_pembayaran = tipe_pembayaran;
        this.nomor_kartu = nomor_kartu;
        this.catatan = catatan;
        this.status = status;
        getConnect();
    }

    public Transaksi(User user, Properti properti, int harga, String tanggal_penyewaan, int durasi_sewa, int jumlah_orang, String tipe_pembayaran, String nomor_kartu, int status) {
        this.user = user;
        this.properti = properti;
        this.harga = harga;
        this.tanggal_penyewaan = tanggal_penyewaan;
        this.durasi_sewa = durasi_sewa;
        this.jumlah_orang = jumlah_orang;
        this.tipe_pembayaran = tipe_pembayaran;
        this.nomor_kartu = nomor_kartu;
        this.status = status;
        getConnect();
    }

    public Transaksi(int harga, String tanggal_penyewaan, int durasi_sewa, int jumlah_orang, String tipe_pembayaran, String nomor_kartu, String catatan, int status) {
        this.harga = harga;
        this.tanggal_penyewaan = tanggal_penyewaan;
        this.durasi_sewa = durasi_sewa;
        this.jumlah_orang = jumlah_orang;
        this.tipe_pembayaran = tipe_pembayaran;
        this.nomor_kartu = nomor_kartu;
        this.catatan = catatan;
        this.status = status;
        getConnect();
    }

    public Transaksi(User user, Properti properti, String tanggal_penyewaan, int durasi_sewa, int jumlah_orang) {
        this.user = user;
        this.properti = properti;
        this.tanggal_penyewaan = tanggal_penyewaan;
        this.durasi_sewa = durasi_sewa;
        this.jumlah_orang = jumlah_orang;
        getConnect();
    }

    public Transaksi(Properti properti, String tanggal_penyewaan, int durasi_sewa, int jumlah_orang) {
        this.properti = properti;
        this.tanggal_penyewaan = tanggal_penyewaan;
        this.durasi_sewa = durasi_sewa;
        this.jumlah_orang = jumlah_orang;
        getConnect();
    }

    public Transaksi(String tanggal_penyewaan, int durasi_sewa, int jumlah_orang) {
        this.tanggal_penyewaan = tanggal_penyewaan;
        this.durasi_sewa = durasi_sewa;
        this.jumlah_orang = jumlah_orang;
        getConnect();
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Properti getProperti() {
        return properti;
    }

    public void setProperti(Properti properti) {
        this.properti = properti;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTanggal_penyewaan() {
        return tanggal_penyewaan;
    }

    public void setTanggal_penyewaan(String tanggal_penyewaan) {
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<Transaksi> showData() {
        ArrayList<Transaksi> temp = new ArrayList<Transaksi>();
        try {
            stat = (Statement) connect.createStatement();
            result = stat.executeQuery("SELECT rt.id AS rt_id, rt.properti_id, rt.harga AS total, rt.tanggal_penyewaan, rt.durasi_sewa, rt.jumlah_orang, rt.tipe_pembayaran, rt.nomor_kartu, rt.status, rt.catatan, "
                    + "u.username, u.password, u.nama, u.alamat, u.nomor_telpon, "
                    + "p.nama AS p_nama, p.alamat AS p_alamat, p.deskripsi, p.harga, p.rating, p.kota, p.tipe_properti "
                    + "FROM riwayat_transaksi rt INNER JOIN user u ON u.username = rt.username "
                    + "INNER JOIN properti p ON p.id = rt.properti_id");
            while (result.next()) {

                Properti p = new Properti(
                        result.getInt("properti_id"),
                        result.getString("p_nama"),
                        result.getString("p_alamat"),
                        result.getString("deskripsi"),
                        result.getInt("harga"),
                        result.getDouble("rating"),
                        result.getString("kota"),
                        result.getString("tipe_properti")
                );

                User u = new User(
                        result.getString("username"),
                        result.getString("password"),
                        result.getString("nama"),
                        result.getString("alamat"),
                        result.getString("nomor_telpon")
                );
                Transaksi t = new Transaksi(
                        result.getInt("rt_id"),
                        u,
                        p,
                        result.getInt("total"),
                        result.getString("tanggal_penyewaan"),
                        result.getInt("durasi_sewa"),
                        result.getInt("jumlah_orang"),
                        result.getString("tipe_pembayaran"),
                        result.getString("nomor_kartu"),
                        result.getString("catatan"),
                        result.getInt("status")
                );
                temp.add(t);
            }
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    public String insert(String username, int id) {
        try {
            if (!connect.isClosed()) {
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("INSERT INTO riwayat_transaksi (username, properti_id, harga, tanggal_penyewaan, durasi_sewa, jumlah_orang, tipe_pembayaran, nomor_kartu, catatan, status) VALUES (?,?,?,?,?,?,?,?,?,?)");

                sql.setString(1, username);
                sql.setInt(2, id);
                sql.setInt(3, getHarga());
                sql.setString(4, getTanggal_penyewaan());
                sql.setInt(5, getDurasi_sewa());
                sql.setInt(6, getJumlah_orang());
                sql.setString(7, getTipe_pembayaran());
                sql.setString(8, getNomor_kartu());
                sql.setString(9, getCatatan());
                sql.setInt(10, getStatus());

                int result = sql.executeUpdate();
                if (result > -1) {
                    return "Success";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Gagal";
    }

    public String update(int status, int id) {
        try {
            if (!connect.isClosed()) {
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("UPDATE riwayat_transaksi SET status = ? WHERE id= ?");

                sql.setInt(1, status);
                sql.setInt(2, id);

                int result = sql.executeUpdate();
                if (result > -1) {
                    return "Success";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Gagal";
    }
}
