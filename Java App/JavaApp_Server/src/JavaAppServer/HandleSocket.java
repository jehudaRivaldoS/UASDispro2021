/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppServer;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class HandleSocket extends Thread {

    FormHome parent;
    Socket client;
    DataOutputStream out;
    BufferedReader inp;

    String pembeli = "";
    String pemilik = "";
    String waktuIn = "";
    String waktuOut = "";
    int biaya = 0;
    int durasi = 0;
    String jenis_pembayaran = "";
    String no_rek = "";
    int jumOrg = 0;
    int pid = 0;
    String pengingat = "";
    int status = 0;
    String namaRumah = "";

    property p;
    UserServer s;

    public HandleSocket(FormHome _parent, Socket _client) {
        this.parent = _parent;
        this.client = _client;
        try {
            out = new DataOutputStream(client.getOutputStream());
            inp = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("33");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void sendChat(String tmp) {
        try {
            out.writeBytes(tmp + "\n");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                //Ambil pesan dari client
                System.out.println("74");
                String tmp = inp.readLine();
                String kiriman = "";
                System.out.println(tmp);
                //Pisahkan pesan client
                String[] msg = tmp.split("/");

                //Jika pesan dari client adalah "reservasi"
                if (msg[0].equalsIgnoreCase("reservasi")) {
                    kiriman = "Selamat Datang!Apa yang bisa kami bantu?\n"
                            + "Silahkan masukkan perintah di bawah ini:\n"
                            + "1.tampilkan rumah\n"
                            + "2.cek pemesanan\n"
                            + "3.sewa [nama rumah]\n"
                            + "4.myrental\n"
                            + "5.exit\n";
                    //Jika pesan dari client adalah "tampilkan rumah"
                } else if (msg[0].equalsIgnoreCase("tampilkan rumah")) {
                    //Tampilkan rumah dari metode DaftarRumah dari class Properti
                    p = new property();
                    int no = 1;
                    for (property data : p.DaftarRumah("")) {
                        kiriman += no + "." + data.getNama() + "\nAlamat: " + data.getAlamat() + "\nInformasi Tambahan: *" + data.getDeskripsi() + "\nKota: "
                                + data.getKota() + "\nTipe: " + data.getTipe_properti()
                                + "\n-----------------------------------------------------------------------------------------------------------\n";
                        no++;
                    }
                    //Jika pesan dari client adalah "daftar rumah"
                } else if (msg[0].equalsIgnoreCase("daftar rumah")) {
                    System.out.println("100");
                    //Tampilkan rumah dari metode DaftarRumah dari class Properti
                    property p = new property();

                    for (property data : p.DaftarRumah("")) {
                        kiriman += data.getNama() + "/" + data.getAlamat() + "/Rp" + data.getHarga() + "/malam/";
                    }
                    //Jika client mau menyewa
                } else if (msg[0].equalsIgnoreCase("sewa")) {
                    //Mengambil pilihan rumah Client
                    if (msg[2].contains("1")) {
                        namaRumah = msg[1].replaceAll("sewa", "");
                        System.out.println(namaRumah);
                        kiriman = "Masukkan tanggal check-in (YYYY-MM-DD):";

                    } else if (msg[2].contains("2")) {
                        waktuIn = msg[1];
                        kiriman = "Masukkan durasi sewa Anda (hari):";

                    } else if (msg[2].contains("3")) {
                        durasi = Integer.parseInt(msg[1]);
                        kiriman = "Masukkan jumlah orang:";

                    } else if (msg[2].contains("4")) {
                        jumOrg = Integer.valueOf(msg[1]);
                        kiriman = "Pilih jenis pembayaran dan masukkan nomor rekening"
                                + "\n(debit[no rekening]/kredit[no rekekning]):";

                    } else if (msg[2].contains("5")) {
                        //Memisahkan kembali isi msg[2]
                        String[] bayar = msg[1].split(" ");
                        if (bayar[0].contains("debit")) {
                            jenis_pembayaran = "Debit";
                            no_rek = bayar[1];

                        } else {
                            jenis_pembayaran = "Kredit";
                            no_rek = bayar[1];
                        }
                        kiriman = "Apa Anda ingin menambahkan catatan (Kosongkan jika tidak ada tambahan):";
                    } else if (msg[2].contains("6")) {
                        if (msg[1].contains("")) {
                            pengingat = "";

                        } else {
                            pengingat = msg[1];

                        }
                        kiriman = "Apakah anda yakin?(ya/tidak)";
                    } else if (msg[2].contains("7")) {
                        if (msg[1].equalsIgnoreCase("ya")) {
                            try {
                                LocalDate tglAwal = LocalDate.parse(waktuIn);

                                s = new UserServer(pembeli);
                                HitungTotalBiaya(namaRumah);
                                property py = new property(pid);
                                System.out.println(pid);
                                riwayatTransaksi rt = new riwayatTransaksi(
                                        s, py, durasi, jumOrg, jenis_pembayaran,
                                        no_rek, tglAwal.toString(), biaya, pengingat, 0);
                                rt.ProsesSewa();

                                kiriman = "Proses pembayaran telah berhasil!*Terima kasih telah melakukan pembayaran*di myRental";
                            } catch (Exception o) {
                                System.out.println(o.getMessage());
                            }
                            //Jika tidak yakin
                        } else {
                            kiriman = "Selamat Datang!Apa yang bisa kami bantu?\n"
                                    + "Silahkan masukkan perintah di bawah ini:\n"
                                    + "1.tampilkan rumah\n"
                                    + "2.cek pemesanan\n"
                                    + "3.sewa [nama rumah]\n"
                                    + "4.myrental\n"
                                    + "5.exit\n";
                        }
                    }
                    //Jika Client mau mengecek Pesanan
                } else if (msg[0].equalsIgnoreCase("CEK PEMESANAN")) {

                    riwayatTransaksi p = new riwayatTransaksi();
                    int no = 1;

                    for (riwayatTransaksi data : p.RiwayatPesanan(pembeli)) {
                        kiriman += data.getId() + "." + data.getProperti().getNama() + "\nAlamat: " + data.getProperti().getAlamat() + "\nKota: " + data.getProperti().getKota()
                                + "\nTotal Biaya: Rp" + data.getHarga() + "/malam\n"
                                + "\n-----------------------------------------------------------------------------------------------------------\n";
                        no++;
                    }
                    //Jika Client mau mengecek apa itu myRental
                } else if (msg[0].equalsIgnoreCase("myRental")) {

                    kiriman = "myRental bergerak di bidang penyewaan property. Kalian dapat menyewa rumah\n"
                            + "yang disukai melalui website ataupun\naplikasi myRental kami. Untuk pembayaran, kami menyediakan secara debit maupun kredit.\n"
                            + "Jika merasa kurang yakin dengan property yang disajikan, silahkan menghubungi sang pemilik melalui aplikasi kami ini.";
                    //Jika mau keluar
                } else if (msg[0].equalsIgnoreCase("error")) {
                    kiriman = "Perintah tidak sesuai";
                    //Kalau mau chat
                } else if (msg[0].equalsIgnoreCase("chat")) {
                    //Ambil username Client
                    pemilik = msg[1];

                    //Mencari nama Client yang login
                    UserServer p = new UserServer();
                    String npemb = "";

                    for (UserServer data : p.DaftarPenyewa(pembeli)) {
                        npemb = data.getNama();
                        System.out.println(npemb);
                    }

                    //Pindah ke FormChatUser beserta dengan parameter socket, nama Client, nama admin
                    FormChatUser k = new FormChatUser(npemb, "Admin myRental");

                    k.setVisible(true);

                } else if (msg[0].contains("LOGIN")) {
                    UserServer u = new UserServer();
                    boolean cek = u.checkLogin(msg[1], msg[2]);
                    if (cek == true) {
                        kiriman = "TRUE";
                        pembeli = msg[1];
                    } else if (cek == false) {
                        kiriman = "FALSE";
                    } else {
                        kiriman = "SALAH";
                    }
                    System.out.println(cek);
                } else if (msg[0].contains("REGISTER")) {
                    UserServer u = new UserServer();
                    boolean cek = u.checkData(msg[1], msg[3]);;

                    if (cek == true) {
                        kiriman = "TRUE";

                    } else if (cek == false) {
                        kiriman = "FALSE";
                        u.Register(msg[1], msg[2], msg[3], msg[4], msg[5], msg[6], msg[7]);
                    } else {
                        kiriman = "ERROR";
                    }
                    System.out.println(cek);
                } else if (msg[0].equals("Bye")) {
                    kiriman = "Bye";
                }
                System.out.println(kiriman);
                out.writeBytes(kiriman + "\n");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HitungTotalBiaya()">
    private void HitungTotalBiaya(String n) {
        p = new property();
        System.out.println(n);
        for (property data : p.DaftarRumah(n)) {
            System.out.println(data.getNama());
            biaya = durasi * data.getHarga();
            pid = data.getId();
        }
    }
    // </editor-fold>
}
