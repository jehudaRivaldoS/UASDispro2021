<%-- 
    Document   : cekTransaksi.jsp
    Created on : Jun 17, 2021, 11:27:55 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    com.myrental.User u = (com.myrental.User) session.getAttribute("user");
    com.myrental.Properti p = (com.myrental.Properti) session.getAttribute("properti");
    com.myrental.Transaksi t = (com.myrental.Transaksi) session.getAttribute("transaksi");
    if (u != null && p != null && t != null) {
        com.myrental.TransaksiService_Service service = new com.myrental.TransaksiService_Service();
        com.myrental.TransaksiService port = service.getTransaksiServicePort();
        int harga = p.getHarga();
        String tanggal = t.getTanggalPenyewaan();
        int jumlah_orang = t.getJumlahOrang();
        int durasi = t.getDurasiSewa();
        int total = harga * durasi;
        String tipeBayar = request.getParameter("kartu");
        String nomorKartu = request.getParameter("noKartu");
        String catatan = request.getParameter("catatan");
        int status = 0;
        String result = port.add(u.getUsername(), p.getId(), total, tanggal, durasi, jumlah_orang, tipeBayar, nomorKartu, catatan, status);
        session.removeAttribute("properti");
        session.removeAttribute("transaksi");
        response.sendRedirect("reservasi.jsp");
    } else {
        session.setAttribute("Error", "Session Anda telah habis!");
        response.sendRedirect("index.jsp");
    }
%>
<%-- start web service invocation --%><hr/>
