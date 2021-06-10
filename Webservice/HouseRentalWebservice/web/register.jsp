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
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="generator" content="">
        <link href="assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/register.css">
        <style>
            html,
            body {
                height: 100%;
            }
        </style>
    </head>
    <body>
        <header class="item header margin-top-0">
            <div class="wrapper">
                <nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
                    <div class="container">
                        <div class="navbar-header">
                            <button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
                                <i class="fa fa-bars"></i>
                                <span class="sr-only">Toggle navigation</span>
                            </button>
                            <a href="index.html" class="navbar-brand brand"> MyRental</a>    
                        </div>  

                        <div id="navbar-collapse-02" class="collapse navbar-collapse">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="propClone"><a href="index.jsp">Home</a></li>
                                <li class="propClone"><a href="index.jsp">Properties</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </header>                          
        <div class="kotak">
            <h3>Register</h3><br>
            <form method="post" action="">     
                <input type="email" id="nama" placeholder="Nama"><br>
                <textarea cols="50" rows="10" id="alamat" placeholder="Alamat"></textarea><br>
                <input type="text" id="tmptLahir" placeholder="Tempat Lahir"><br>
                <input type="date" id="tglLahir"><br>
                <input type="text" id="tlp" placeholder="08125320865"><br>
                <input type="text" id="user" placeholder="Username"><br>
                <input type="password" id="pass" placeholder="Password"><br>                
                <div class="button-content">
                    <button type="submit" class="btn back">Register</button>
                    <button type="button" class="btn back" onclick="window.location.href = 'index.jsp'">Batal</button>
                </div>
            </form> 
        </div>
        <!-- FOOTER =============================-->
        <div class="footer text-center">
            <div class="container">
                <div class="row">
                    <p class="footernote">
                        Connect with myRental
                    </p>
                    <ul class="social-iconsfooter">
                        <li><a href="#"><i class="fa fa-phone"></i></a></li>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                    </ul>
                    <p>
                        &copy; 2021 myRental<br/>
                        Scorilo - Free template by <a href="https://www.wowthemes.net/">WowThemesNet</a>
                    </p>
                </div>
            </div>
        </div>
    </body>
</html>
