<%-- 
    Document   : coba
    Created on : Jun 19, 2021, 2:41:55 AM
    Author     : Acer
--%>

<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    com.myrental.TransaksiService_Service service = new com.myrental.TransaksiService_Service();
    com.myrental.TransaksiService port = service.getTransaksiServicePort();
    if (session.getAttribute("user") != null) {
        int id = Integer.parseInt(request.getParameter("id"));
        java.util.List<com.myrental.Transaksi> result = port.showDataTrans();
        for (com.myrental.Transaksi t : result) {
            if (id == t.getId()) {
                int total = t.getHarga();
                int propHarga = t.getProperti().getHarga();
                String nama = t.getProperti().getNama();
                LocalDate tglChkIn = LocalDate.parse(t.getTanggalPenyewaan());
                int durasi = t.getDurasiSewa();
                LocalDate tglChkOut = tglChkIn.plusDays(durasi);
                int jumlahOrang = t.getJumlahOrang();
                int status = t.getStatus();
                String catatan = t.getCatatan();
                String stat = "";
                if (LocalDate.now().isAfter(tglChkOut)) {
                    if (status == 0) {
                        t.setStatus(1);
                        port.update(t.getStatus(), t.getId());
                        stat = "Finished";
                    }
                    else{
                         stat = "Finished";
                    }
                } else {
                    if (status == 0) {
                        stat = "Verified";
                    } else {
                         t.setStatus(0);
                        port.update(t.getStatus(), t.getId());
                        stat = "Verified";
                    }
                }
                out.print(status);
                out.print(tglChkOut);
                out.print(LocalDate.now().isAfter(tglChkOut));
                out.print(LocalDate.now());
                out.print(stat);
            }
        }
    }
%>
