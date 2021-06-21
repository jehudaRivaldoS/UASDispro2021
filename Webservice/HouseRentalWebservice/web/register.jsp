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
        <link rel="stylesheet" type="text/css" href="assets/css/register.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    </head>
    <body style="height:100%">
        <div id="blur">
            <header class="item header margin-top-0">
                <div class="wrapper">
                    <nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
                        <div class="container">
                            <div class="navbar-header">
                                <button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
                                    <i class="fa fa-bars"></i>
                                    <span class="sr-only">Toggle navigation</span>
                                </button>
                                <a href="index.jsp" class="navbar-brand brand"> MyRental</a>    
                            </div>  

                            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                                <ul class="nav navbar-nav navbar-right">
                                    <li class="propClone"><a href="home.jsp">Properti</a></li>
                                </ul>
                            </div>
                        </div>
                    </nav>  
            </header>
            <div class="kotak">
                <h3>Register</h3><br>
                <form method="POST" action="cekRegister.jsp" class="form-register">     
                    <input type="text" name="nama" placeholder="Nama" required><br>
                    <textarea cols="50" rows="10" name="alamat" placeholder="Alamat" required></textarea><br>
                    <input type="text" name="tmptLahir" placeholder="Tempat Lahir"><br>
                    <input type="date" name="tglLahir"><br>
                    <input type="text" name="tlp" placeholder="08125320865" required><br>
                    <input type="text" name="user" placeholder="Username" required><br>
                    <input type="password" name="pass" placeholder="Password" required><br>                
                    <div class="button-content">
                        <button class="btn btn-primary" style="width:200px;">Register</button>
                        <button type="button" class="btn btn-danger" style="width:200px;" onclick="window.location.href = 'index.jsp'">Batal</button>
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
        </div>
    </body>
    <% if (session.getAttribute("Error") != null) {%>
    <script>alert("Ada beberapa data yang tidak tepat! Silahkan isi kembali.");</script>
    <%  session.removeAttribute("Error");
        }%>

    <script src="assets/js/jquery-.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/anim.js"></script>
    <script>
        //----HOVER CAPTION---//	  
        jQuery(document).ready(function ($) {
            $('.fadeshop').hover(
                    function () {
                        $(this).find('.captionshop').fadeIn(150);
                    },
                    function () {
                        $(this).find('.captionshop').fadeOut(150);
                    }
            );
        });
    </script>
</html>
