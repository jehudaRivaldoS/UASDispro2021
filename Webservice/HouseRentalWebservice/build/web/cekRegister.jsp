<%-- 
    Document   : checkRegister
    Created on : Jun 11, 2021, 3:58:26 PM
    Author     : Acer
--%>

<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- start web service invocation --%><hr/>
<%
    try {
        com.myrental.UserService_Service service = new com.myrental.UserService_Service();
        com.myrental.UserService port = service.getUserServicePort();
        // TODO initialize WS operation arguments here
        java.lang.String username = request.getParameter("user");
        java.lang.String password = request.getParameter("pass");
        java.lang.String nama = request.getParameter("nama");
        java.lang.String alamat = request.getParameter("alamat");
        java.lang.String nomorTelepon = request.getParameter("tlp");
        String tanggalLahir = LocalDate.parse(request.getParameter("tglLahir")).toString();
        java.lang.String tempatLahir = request.getParameter("tmptLahir");
        // TODO process result here
        java.lang.String result = port.register(username, password, nama, alamat, nomorTelepon, tanggalLahir, tempatLahir);
        if (result.equals("Success")) {
            com.myrental.User user = new com.myrental.User();
            user.setUsername(username);
            user.setPassword(password);
            user.setNama(nama);
            user.setAlamat(alamat);
            user.setNomorTelepon(nomorTelepon);
            user.setTanggalLahir(tanggalLahir);
            user.setTempatLahir(tempatLahir);
            session.setAttribute("Error", "Silahkan melakukan login kembali.");
            response.sendRedirect("index.jsp");
        } else {
            session.setAttribute("Error", "Data yang diisi masih belum tepat!");
            response.sendRedirect("register.jsp");
        }
    } catch (Exception ex) {
        out.print(ex);
    }
%>
