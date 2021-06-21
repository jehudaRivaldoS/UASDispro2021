/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental.model;

import  com.mysql.jdbc.Blob;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Properti extends myConnection {

    private int id;
    private String nama;
    private String alamat;
    private String deskripsi;
    private int harga;
    private double rating;
    private String kota;
    private String tipe_properti;
    Foto foto;

    public Properti() {
        getConnect();
    }

    public Properti(int id, String nama, String alamat, String deskripsi, int harga, double rating, String kota, String tipe_properti) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.rating = rating;
        this.kota = kota;
        this.tipe_properti = tipe_properti;
        getConnect();
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

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public ArrayList<Properti> showData() {
        ArrayList<Properti> temp = new ArrayList<Properti>();
        try {
            stat = (Statement) connect.createStatement();
            result = stat.executeQuery("SELECT p.id, p.nama, p.alamat, p.deskripsi, p.harga, p.rating, p.kota, p.tipe_properti FROM properti p");

            while (result.next()) {
                //koneksinya ke class foto & properti
                Properti p = new Properti(
                        result.getInt("id"),
                        result.getString("nama"),
                        result.getString("alamat"),
                        result.getString("deskripsi"),
                        result.getInt("harga"),
                        result.getDouble("rating"),
                        result.getString("kota"),
                        result.getString("tipe_properti")
                );
                temp.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
}
