<%-- 
    Document   : home
    Created on : Jun 2, 2021, 7:14:12 PM
    Author     : Acer
--%>

<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="generator" content="">
        <link href="assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/modal.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700" rel="stylesheet">
        <style>
            .pic{
                height:300px;
                weight:300px;
            }
        </style>
    </head>
    <body>
        <div id="blur">
            <%-- start web service invocation --%><hr/>
            <%
                com.myrental.PropertiService_Service service = new com.myrental.PropertiService_Service();
                com.myrental.PropertiService port = service.getPropertiServicePort();
                // TODO process result here
                java.util.List<com.myrental.Properti> result = port.showDataProp();
            %>
            <%-- end web service invocation --%><hr/>


            <!-- HEADER -->
            <header class="item header margin-top-0">
                <div class="wrapper">
                    <nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
                        <div class="container">
                            <div class="navbar-header">
                                <button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
                                    <i class="fa fa-bars"></i>
                                    <span class="sr-only">Toggle navigation</span>
                                </button>
                                <a href="index.jsp" class="navbar-brand brand"> myRental </a>
                            </div>
                            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                                <ul class="nav navbar-nav navbar-right">
                                    <li class="propClone"><a href="index.jsp">Utama</a></li>

                                    <% if (session.getAttribute("user") != null) {%>
                                    <li class="propClone"><a href="reservasi.jsp">Reservasi Saya</a></li>

                                    <li class="propClone"><a href="logout.jsp">Logout</a></li>
                                        <%}%>

                                    <% if (session.getAttribute("user") == null) {%>
                                    <li id="openBox"><a>Login</a></li>
                                        <%}%>
                                </ul>
                            </div>
                        </div>
                    </nav>
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12 text-center">
                                <div class="text-pageheader">
                                    <div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.1s">
                                        Properti Rental Kami
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>

            <!-- CONTENT =============================-->
            <section class="item content">
                <div class="container toparea">
                    <div class="underlined-title">
                        <div class="editContent">
                            <h1 class="text-center latestitems">Properti Rental Terbaru</h1>
                        </div>
                        <div class="wow-hr type_short">
                            <span class="wow-hr-h">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </span>
                        </div>
                    </div>
                    <div class="row">
                        <%
                            for (int i = 0; i < result.size(); i += 1) {
                                int id = result.get(i).getId();
                                String nama = result.get(i).getNama();
                                String deskripsi = result.get(i).getDeskripsi();
                                String harga = String.format("%,d\n", result.get(i).getHarga());
                        %>
                        <div class="col-md-4">
                            <div class="productbox">
                                <div class="fadeshop">
                                    <div class="captionshop text-center" style="display: none;">
                                        <h3><%=nama%></h3>
                                        <p style="font-size:13px;">
                                            <%=deskripsi%>
                                        </p>
                                        <p>
                                        <form method="POST" action="tampilanRumah.jsp">
                                            <input type="hidden" name="id" value=<%=id%>>
                                            <button type="submit" class="btn btn-primary btn-group-lg">Details</button>
                                        </form>  
                                        </p>
                                    </div>
                                    <span><img src=<%=result.get(i).getFoto().getFoto1()%> class="pic" name=<%=id%>></span>
                                </div>
                                <div class="product-details">
                                    <form method="POST" action="tampilanRumah.jsp"  style="padding-bottom:0px;">
                                        <input type="hidden" name="id" value=<%=id%>>
                                        <button type="submit" class="btn btn-link" style="margin:0px;"><h4><%=nama%></h4></button>
                                    </form>
                                    <span class="price">
                                        <span class="edd_price">Rp<%= harga%>/malam</span>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <%}%>
                    </div>

                    <div class="underlined-title">
                        <div class="editContent">
                            <h1 class="text-center latestitems">Properti Rental Termurah</h1>
                        </div>
                        <div class="wow-hr type_short">
                            <span class="wow-hr-h">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </span>
                        </div>
                    </div>
                    <div class="row">
                        <%
                            for (int i = 0; i < result.size(); i += 1) {
                                int id = result.get(i).getId();
                                String nama = result.get(i).getNama();
                                String deskripsi = result.get(i).getDeskripsi();
                                String harga = String.format("%,d\n", result.get(i).getHarga());
                        %>
                        <div class="col-md-4">
                            <div class="productbox">
                                <div class="fadeshop">
                                    <div class="captionshop text-center" style="display: none;">
                                        <h3><%=nama%></h3>
                                        <p style="font-size:13px;">
                                            <%=deskripsi%>
                                        </p>
                                        <form method="POST" action="tampilanRumah.jsp">
                                            <input type="hidden" name="id" value=<%=id%>>
                                            <button type="submit" class="btn btn-primary">Details</button>
                                        </form>  
                                    </div>
                                    <span><img src="" class="pic" name="<%=nama%>"></span>
                                </div>
                                <div class="product-details">
                                    <form method="POST" action="tampilanRumah.jsp" style="padding-bottom:0px;">
                                        <input type="hidden" name="id" value=<%=id%>>
                                        <button type="submit" class="btn btn-link" style="margin:0px;"><h4><%=nama%></h4></button>
                                    </form>
                                    <span class="price">
                                        <span class="edd_price">Rp<%= harga%>/malam</span>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <%}%>
                    </div>
            </section>
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

        <!--Untuk modal login-->
        <div class="modal" id="mymodal">
            <div class="content-modal">
                <div class="content-header">
                    <h3>Login</h3>
                    <span class="close">&times;</span>
                </div>

                <form method="POST" action="cekLogin.jsp">

                    <input type="text" id="user" name="username" placeholder="Username"><br>
                    <input type="password" id="pass" name="password" placeholder="Password"><br>

                    <button class="btn btn-success btn-primary" style="text-align: center; border-radius: 10px; font-size:16px;" name="sign">Sign in</button>
                </form> 

                <div class="footer-home">
                    <h4>Belum memiliki akun?</h4>
                    <p>Ayo segera bergabung untuk melihat segala jenis properti!</p>
                    <button type="submit" class="btn btn-info" onclick="window.location.href = 'register.jsp'" style="text-align: center; border-radius: 10px; font-size:16px;">Register</button>
                </div>
            </div>
        </div>
    </body>
    <!-- Load JS here for greater good =============================-->
    <script src="assets/js/jquery-.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/anim.js"></script>
    <script>
                        var modal = document.getElementById("mymodal");
                        var btn = document.getElementById("openBox");
                        var spn = document.getElementsByClassName("close")[0];
                        var outofsight = document.getElementById("blur");

                        btn.onclick = function () {
                            modal.style.display = "block";
                            outofsight.classList.remove("pasif");
                            outofsight.classList.add("active");
                        }
                        spn.onclick = function () {
                            modal.style.display = "none";
                            outofsight.classList.remove("active");
                            outofsight.classList.add("pasif");
                        }
    </script>
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
