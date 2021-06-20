<%-- 
    Document   : viewImage
    Created on : Jun 18, 2021, 8:43:38 PM
    Author     : Acer
--%>

<%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Blob img = (Blob)request.getAttribute("blob");
    OutputStream o = response.getOutputStream();
    byte[] imgData = img.getBytes(1, (int) img.length());
    response.setContentType("image/gif");
    o.write(imgData);
    o.flush();
    o.close();
%>
