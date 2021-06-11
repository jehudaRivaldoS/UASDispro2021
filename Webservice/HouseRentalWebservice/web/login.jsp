<%-- 
    Document   : login
    Created on : Jun 11, 2021, 1:09:24 PM
    Author     : Acer
--%>

    <%-- start web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.myrental.UserService_Service service = new com.myrental.UserService_Service();
	com.myrental.UserService port = service.getUserServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String username = request.getParameter("username");
	java.lang.String password = request.getParameter("password");
	// TODO process result here
	java.lang.String result = port.checkLogin(username, password);
	if(result.equals("Sukses")){
            response.sendRedirect("home.jsp");
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    <%-- end web service invocation --%><hr/>
