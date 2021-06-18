<%-- 
    Document   : coba
    Created on : Jun 19, 2021, 2:41:55 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    com.myrental.TransaksiService_Service service = new com.myrental.TransaksiService_Service();
    com.myrental.TransaksiService port = service.getTransaksiServicePort();
    if (session.getAttribute("user") != null) {
        int id = Integer.parseInt(request.getParameter("id"));
        out.print(id);
    }
%>
