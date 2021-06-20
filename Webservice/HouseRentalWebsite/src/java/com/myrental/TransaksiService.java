/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental;

import com.myrental.model.Properti;
import com.myrental.model.Transaksi;
import com.myrental.model.User;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Acer
 */
@WebService(serviceName = "TransaksiService")
public class TransaksiService {

    Transaksi model;

    public TransaksiService() {
        model = new Transaksi();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showDataTrans")
    public ArrayList<Transaksi> showDataTrans() {
        //TODO write your implementation code here:
        return model.showData();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "show")
    public ArrayList<Transaksi> show(String username) {
        ArrayList<Transaksi> trans = new ArrayList<Transaksi>();
        //TODO write your implementation code here:
        for (Transaksi t : model.showData()) {
            String usernm = t.getUser().getUsername();
            if (usernm.equals(username)) {
                trans.add(t);
            }
        }
        return trans;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "user") String user, @WebParam(name = "properti") int properti, @WebParam(name = "harga") int harga, @WebParam(name = "tanggal") String tanggal, @WebParam(name = "durasi_sewa") int durasi_sewa, @WebParam(name = "jumlah_orang") int jumlah_orang, @WebParam(name = "tipe_pembayaran") String tipe_pembayaran, @WebParam(name = "nomor_kartu") String nomor_kartu, @WebParam(name = "catatan") String catatan, @WebParam(name = "status") int status) {
        //Memasukkan transaksi
        model = new Transaksi(harga, tanggal, durasi_sewa, jumlah_orang, tipe_pembayaran, nomor_kartu, catatan, status);
        return model.insert(user, properti);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkDays")
    public String checkAvailability(@WebParam(name = "date") String date, @WebParam(name = "nama") String nama, @WebParam(name = "durasi") int durasi) {
        //Memasukkan transaksi
        LocalDate dateChkIn = LocalDate.parse(date);
        LocalDate dateChkOut = dateChkIn.plusDays(durasi);
        String result = "";
        for (Transaksi t : model.showData()) {
            String namaProp = t.getProperti().getNama();
            LocalDate tglChkIn = LocalDate.parse(t.getTanggal_penyewaan());
            int durasiModel = t.getDurasi_sewa();
            LocalDate tglChkOut = tglChkIn.plusDays(durasiModel);
            if (dateChkIn.isEqual(tglChkIn) || dateChkOut.isEqual(tglChkOut)
                    || dateChkIn.isEqual(tglChkOut) || dateChkOut.isEqual(tglChkIn)
                    || dateChkIn.isAfter(tglChkIn) && dateChkIn.isBefore(tglChkOut)
                    || dateChkOut.isAfter(tglChkIn) && dateChkOut.isBefore(tglChkOut)) {
                if (namaProp.equals(nama)) {
                    result = "Invalid";
                    break;
                } else {
                    result = "Valid";
                }
            } else {
                result = "Valid";
            }
        }
        return result;
    }

    @WebMethod(operationName = "update")
    public String update(@WebParam(name = "status") int status, @WebParam(name = "id") int id) {
        //Memasukkan transaksi
        return model.update(status, id);
    }
}
