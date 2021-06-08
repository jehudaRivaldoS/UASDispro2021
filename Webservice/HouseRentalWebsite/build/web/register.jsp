<%-- 
    Document   : register
    Created on : Jun 4, 2021, 2:59:50 PM
    Author     : patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="style/register.css">
</head>
<body>
    <header>
        <h2>My Rental</h2>
    </header>
    <div class="kotak">
        <h3>Register</h3>
       
        <form method="post" action="">
                
            <input type="email" id="nama" placeholder="Nama"><br>
            <textarea cols="50" rows="10" id="alamat" placeholder="Alamat"></textarea><br>
            <input type="text" id="tmptLahir" placeholder="Tempat Lahir"><br>
            <input type="date" id="tglLahir"><br>
            <input type="text" id="tlp" placeholder="08125320865"><br>
            <input type="text" id="user" placeholder="Username"><br>
            <input type="password" id="pass" placeholder="Password"><br>                

            <button type="submit" class="btn btn-success">Register</button>
            <button type="button" class="btn back" onclick="window.location.href='utama.jsp'">Batal</button>
            </form> 
    </div>
      <footer>
        <p>&copy; 2021 myRental</p>
      </footer>
</body>
</html>
