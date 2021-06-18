<%-- 
    Document   : login
    Created on : Jun 11, 2021, 1:09:24 PM
    Author     : Acer
--%>


    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.myrental.UserService_Service service = new com.myrental.UserService_Service();
	com.myrental.UserService port = service.getUserServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String username = request.getParameter("username");
	java.lang.String password = request.getParameter("password");
	// TODO process result here
	com.myrental.User result = port.checkLogin(username, password);
	if(result != null){
            session.setAttribute("user", result);
            response.sendRedirect("index.jsp");
        }
        else{
            session.setAttribute("Error", "Username/password Anda salah!");
            response.sendRedirect("index.jsp");
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

