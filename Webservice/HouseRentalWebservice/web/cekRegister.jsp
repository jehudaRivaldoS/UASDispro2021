<%-- 
    Document   : checkRegister
    Created on : Jun 11, 2021, 3:58:26 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.myrental.UserService_Service service = new com.myrental.UserService_Service();
	com.myrental.UserService port = service.getUserServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String username = request.getParameter("user");
	java.lang.String password = request.getParameter("pass");
	java.lang.String nama =request.getParameter("nama");
	java.lang.String alamat = request.getParameter("alamat");
	java.lang.String nomorTelepon = request.getParameter("tlp");
	java.lang.String tanggalLahir = request.getParameter("tmptLahir");
	java.lang.String tempatLahir = request.getParameter("tglLahir");
	// TODO process result here
	java.lang.String result = port.register(username, password, nama, alamat, nomorTelepon, tanggalLahir, tempatLahir);
        if(result.equals("Sukses")){
            response.sendRedirect("index.jsp");
        }        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
