<%-- 
    Document   : tampilanRumah
    Created on : Jun 4, 2021, 3:38:17 PM
    Author     : MyAcer
--%>

<%@page import="com.myrental.Blob"%>
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
        <link href="assets/css/tampilanrumah.css" rel="stylesheet">
        <link href="assets/css/modal.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700" rel="stylesheet">
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
    </head>
    <body>  
        <div id="blur">
            <%-- start web service invocation --%><hr/>
            <%
                com.myrental.PropertiService_Service service = new com.myrental.PropertiService_Service();
                com.myrental.PropertiService port = service.getPropertiServicePort();
                // TODO process result here
                java.util.List<com.myrental.Properti> result = port.showDataProp();
                int idUrl = 0;
                if (session.getAttribute("id") == null) {
                    idUrl = Integer.parseInt((String)request.getParameter("id"));
                } else {
                    idUrl = Integer.parseInt(session.getAttribute("id").toString());
                }
                com.myrental.Properti prop = new com.myrental.Properti();
                for (com.myrental.Properti p : result) {
                    int id = p.getId();
                    if (idUrl == id) {
                        prop = p;
                        break;
                    }
                }
                session.setAttribute("properti", prop);
                int id = prop.getId();
                String nama = prop.getNama();
                String alamat = prop.getAlamat();
                String deskripsi = prop.getDeskripsi();
                String kota = prop.getKota();
                String tipe = prop.getTipeProperti();
                String harga = String.format("%,d\n", prop.getHarga());
                String rating = String.valueOf(prop.getRating());
            %>
            <%-- end web service invocation --%><hr/>

            <!-- HEADER =============================-->
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
                                    <li class="propClone"><a href="home.jsp">Properti</a></li>

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
                                    <div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.0s">
                                        <%=nama%>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>


            <section class="item content">
                <div class="container toparea">
                    <div class="underlined-title">
                        <div class="editContent">

                            <div align="center">
                                <img src="assets/images/<%=nama%>1.jpeg" height = "200px" width="300px">	
                                <img src="assets/images/<%=nama%>2.jpeg" height = "200px" width="300px">
                                <img src="assets/images/<%=nama%>3.jpeg" height = "200px" width="300px">
                            </div>

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
                        <div class="col-md-8">
                            <div class="productbox">
                                <div class="harga">
                                    <p>Rp<%=harga%>/malam</p>
                                </div>
                                <hr>
                                <div class="product-details text-left">
                                    <ul class="unstyle ">
                                        <li><b class="propertyname">Tipe Properti: </b> <%=tipe%></li>
                                        <li><b class="propertyname">Alamat Rumah : </b> <%=alamat%></li>
                                        <li><b class="propertyname">Kota: </b> <%=kota%></li>
                                        <li><b class="propertyname">Rating: </b> <%=rating%>/5</li>
                                    </ul>
                                </div>
                                <hr>
                                <div class="deskripsi">
                                    <h4>Deskripsi Properti</h4>
                                    <p><%=deskripsi%></p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4 form-pesan">
                            <form method="POST" action="cekFormInput.jsp" style="padding-bottom: 0px;">
                                <p>Ingin menyewa properti ini?</p>
                                <div class="form-group"> <!-- Date input -->
                                    <label class="control-label" for="date">Tanggal Check-In</label>
                                    <input class="form-control" id="date" name="date" placeholder="YYYY-MM-DD" type="text" required/>
                                </div>
                                <div class="form-group">
                                    <label for="durasi">Durasi Sewa (hari)</label>
                                    <input type="number" class="form-control" min=1 id="durasi" name="durasi" required>
                                </div>
                                <div class="form-group">
                                    <label for="tamu">Jumlah Tamu (orang)</label>
                                    <input type="number" class="form-control" min=1 name="tamu" id="tamu" required>
                                </div>
                                <button type="submit" class="btn btn-buynow" style="width:100%;">Pesan</button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="footer text-center">
                    <div class="container">
                        <div class="row">
                            <p class="footernote">
                                Connect with MyRental
                            </p>
                            <ul class="social-iconsfooter">
                                <li><a href="#"><i class="fa fa-phone"></i></a></li>
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                            </ul>
                            <p>
                                MyRental 
                            </p>
                            <br>
                        </div>
                    </div>
                </div>
            </section>
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
        <% if (session.getAttribute("Error") != null) {%>
        <script>alert("<%=session.getAttribute("Error")%>");</script>
        <%  session.removeAttribute("Error");
                session.removeAttribute("id");
            }%>
        <script src="assets/js/anim.js"></script>
        <script>
            $(document).ready(function () {
                var date_input = $('input[name="date"]'); //our date input has the name "date"
                var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
                date_input.datepicker({
                    format: 'yyyy-mm-dd',
                    container: container,
                    startDate: new Date(),
                    todayHighlight: true,
                    autoclose: true,
                })
            })
        </script>
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
    </body>
</html>
