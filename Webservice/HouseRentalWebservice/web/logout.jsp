<%-- 
    Document   : logout
    Created on : Jun 16, 2021, 4:02:51 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	session.removeAttribute("user");
        session.removeAttribute("properti");
        session.removeAttribute("transaksi");
        response.sendRedirect("index.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
