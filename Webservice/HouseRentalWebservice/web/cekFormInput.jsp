<%-- 
    Document   : cekFormInput
    Created on : Jun 15, 2021, 7:30:13 PM
    Author     : Acer
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- start web service invocation --%><hr/>
<%
    try {
        com.myrental.Properti p = (com.myrental.Properti) session.getAttribute("properti");
        com.myrental.TransaksiService_Service service = new com.myrental.TransaksiService_Service();
        com.myrental.TransaksiService port = service.getTransaksiServicePort();
        // TODO process result here
        if (session.getAttribute("user") != null) {
            //Untuk ambil parameter properti

            session.setAttribute("properti", p);

            //Untuk ambil parameter pemesanan
            String tanggal = request.getParameter("date");
            int durasi = Integer.parseInt(request.getParameter("durasi"));
            int tamu = Integer.valueOf(request.getParameter("tamu"));

            java.lang.String result = port.checkDays(tanggal, p.getNama(), durasi);
            if (result.equals("Invalid")) {
                session.setAttribute("id", p.getId());
                session.setAttribute("Error", "Tanggal penyewaan sudah terpakai! Silahkan pilih tanggal lain.");
                response.sendRedirect("tampilanRumah.jsp");
            } else {
                com.myrental.Transaksi t = new com.myrental.Transaksi();
                t.setDurasiSewa(durasi);
                t.setJumlahOrang(tamu);
                t.setTanggalPenyewaan(tanggal);
                out.print(t);
                session.setAttribute("transaksi", t);

                response.sendRedirect("pembayaran.jsp");
            }

        } else {
            session.setAttribute("id", p.getId());
            session.setAttribute("Error", "Session telah habis!");
            response.sendRedirect("tampilanRumah.jsp");
        }
    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }
%>

