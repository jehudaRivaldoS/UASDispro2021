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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author patrick
 */
public class RiwayatTransaksi extends MyConnect {

    protected int id;
    protected UserServer penyewa;
    protected Property properti;
    protected int durasi;
    protected int jumlah_orang;
    protected String tipe_pembayaran;
    protected String no_kartu;
    protected String tanggal_sewa;
    protected int harga;
    protected String catatan;
    protected int status;

    public RiwayatTransaksi() {
    }

    public RiwayatTransaksi(int id, UserServer penyewa, Property properti, int durasi, int jumlah_orang, String tipe_pembayaran,
            String no_kartu, String tanggal_sewa, int harga, String catatan, int status) {
        this.id = id;
        this.penyewa = penyewa;
        this.properti = properti;
        this.durasi = durasi;
        this.jumlah_orang = jumlah_orang;
        this.tipe_pembayaran = tipe_pembayaran;
        this.no_kartu = no_kartu;
        this.tanggal_sewa = tanggal_sewa;
        this.harga = harga;
        this.catatan = catatan;
        this.status = status;
    }

    public RiwayatTransaksi(UserServer penyewa, Property properti, int durasi, int jumlah_orang, String tipe_pembayaran,
            String no_kartu, String tanggal_sewa, int harga, String catatan, int status) {
        this.penyewa = penyewa;
        this.properti = properti;
        this.durasi = durasi;
        this.jumlah_orang = jumlah_orang;
        this.tipe_pembayaran = tipe_pembayaran;
        this.no_kartu = no_kartu;
        this.tanggal_sewa = tanggal_sewa;
        this.harga = harga;
        this.catatan = catatan;
        this.status = status;
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

    public Property getProperti() {
        return properti;
    }

    public void setProperti(Property properti) {
        this.properti = properti;
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

    public String getTanggal_sewa() {
        return tanggal_sewa;
    }

    public void setTanggal_sewa(String tanggal_sewa) {
        this.tanggal_sewa = tanggal_sewa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void ProsesSewa() {
        getConnect();

        try {
            state = (Statement) connect.createStatement();

            if (!connect.isClosed()) {

                PreparedStatement sql1 = (PreparedStatement) connect.prepareStatement("insert into riwayat_transaksi (username, properti_id, harga, tanggal_penyewaan, durasi_sewa, jumlah_orang, tipe_pembayaran, nomor_kartu, catatan, status) values(?,?,?,?,?,?,?,?,?,?)");
                sql1.setString(1, penyewa.getUsernames());
                sql1.setInt(2, properti.getId());
                sql1.setInt(3, harga);
                sql1.setString(4, tanggal_sewa);
                sql1.setInt(5, durasi);
                sql1.setInt(6, jumlah_orang);
                sql1.setString(7, tipe_pembayaran);
                sql1.setString(8, no_kartu);
                sql1.setString(9, catatan);
                sql1.setInt(10, status);

                sql1.executeUpdate();
            }
            connect.close();
        } catch (SQLException ex) {
//            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<RiwayatTransaksi> RiwayatPesanan(String namaUser) {
        super.getConnect();
        ArrayList<RiwayatTransaksi> collection = new ArrayList<RiwayatTransaksi>();

        try {
            state = (Statement) connect.createStatement();
            if (namaUser == "") {
                result = state.executeQuery(" SELECT * FROM riwayat_transaksi rt inner join properti p"
                        + " on rt.properti_id = p.id inner join user s on s.username = rt.username ");
            } else {
                PreparedStatement sql1 = (PreparedStatement) connect.prepareStatement(" SELECT * FROM riwayat_transaksi rt inner join properti p"
                        + " on rt.properti_id = p.id inner join user s on s.username = rt.username where s.username = ?");
                sql1.setString(1, namaUser);
                result = sql1.executeQuery();
            }
            while (result.next()) {
                RiwayatTransaksi b = new RiwayatTransaksi(
                        result.getInt("rt.id"),
                        new UserServer(result.getString("rt.username")),
                        new Property(result.getString("p.nama"), result.getString("p.alamat"), result.getInt("p.harga"), result.getString("p.kota")),
                        result.getInt("rt.durasi_sewa"),
                        result.getInt("rt.jumlah_orang"),
                        result.getString("rt.tipe_pembayaran"),
                        result.getString("rt.nomor_kartu"),
                        result.getString("rt.tanggal_penyewaan"),
                        result.getInt("rt.harga"),
                        result.getString("rt.catatan"),
                        result.getInt("rt.status")
                );
                collection.add(b);
            }
            connect.close();
        } catch (Exception ex) {
//                 Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return collection;
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
            Logger.getLogger(RiwayatTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Gagal";
    }
    
    public String checkAvailability(String date, String nama, int durasi) {
        //Memasukkan transaksi
        LocalDate dateChkIn = LocalDate.parse(date);
        LocalDate dateChkOut = dateChkIn.plusDays(durasi);
        String result = "";
        for (RiwayatTransaksi t : RiwayatPesanan("")) {
            String namaProp = t.getProperti().getNama();
            LocalDate tglChkIn = LocalDate.parse(t.getTanggal_sewa());
            int durasiModel = t.getDurasi();
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
}
