/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Properti {
    private String nama;
    private String alamat;
    private String deskripsi;
    private double harga;
    private double rating;
    private String kota;
    private String status;
    private String tipe_properti;
    private int diskon;
    private ArrayList<Foto> listFoto;

    public Properti(String nama, String alamat, String deskripsi, double harga, double rating, String kota, String status, String tipe_properti, int diskon, ArrayList<Foto> listFoto) {
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.rating = rating;
        this.kota = kota;
        this.status = status;
        this.tipe_properti = tipe_properti;
        this.diskon = diskon;
        this.listFoto = new ArrayList<Foto>();
    }
    
    
}
