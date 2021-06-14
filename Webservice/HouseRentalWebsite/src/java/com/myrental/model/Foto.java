/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental.model;

import java.sql.Blob;



/**
 *
 * @author Acer
 */
public class Foto exten{
    private int id;
    private Properti properti;
    private Blob foto1;
    private Blob foto2;
    private Blob foto3;
    private Blob foto4;

    public Foto() {
    }

    public Foto(int id, Properti properti, Blob foto1, Blob foto2, Blob foto3, Blob foto4) {
        this.id = id;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.foto4 = foto4;
    }

    public Foto(Blob foto1, Blob foto2, Blob foto3, Blob foto4) {
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.foto4 = foto4;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Properti getProperti() {
        return properti;
    }

    public void setProperti(Properti properti) {
        this.properti = properti;
    }

    public Blob getFoto1() {
        return foto1;
    }

    public void setFoto1(Blob foto1) {
        this.foto1 = foto1;
    }

    public Blob getFoto2() {
        return foto2;
    }

    public void setFoto2(Blob foto2) {
        this.foto2 = foto2;
    }

    public Blob getFoto3() {
        return foto3;
    }

    public void setFoto3(Blob foto3) {
        this.foto3 = foto3;
    }

    public Blob getFoto4() {
        return foto4;
    }

    public void setFoto4(Blob foto4) {
        this.foto4 = foto4;
    }
    
    
}
