<%-- 
    Document   : tampilanRumah
    Created on : Jun 4, 2021, 3:38:17 PM
    Author     : MyAcer
--%>

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
        <link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700" rel="stylesheet">
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
    </head>
    <body>
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
                            <a href="index.html" class="navbar-brand brand"> myRental </a>
                        </div>
                        <div id="navbar-collapse-02" class="collapse navbar-collapse">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="propClone"><a href="index.jsp">Utama</a></li>
                                <li class="propClone"><a href="home.jsp">Properti</a></li>
                                <li class="propClone"><a href="reservasi.jsp">Reservasi Saya</a></li>
                                <li class="propClone"><a href="profil.jsp">Profil</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <div class="text-pageheader">
                                <div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.0s">
                                    Rumah Aman
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
                            <img src="assets/images/rumah.jpg" height = "200px" width="300px">	
                            <img src="assets/images/mandi.jpg" height = "200px" width="300px">
                            <img src="assets/images/tdr.jpeg" height = "200px" width="300px">
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
                            <div class="clearfix">
                            </div>
                            <br/>
                            <div class="product-details text-left">
                                <ul class="unstyle">
                                    <li><b class="propertyname">Alamat Rumah : </b> Jalan Sukaduka nomor 12, Surabaya</li>
                                    <li><b class="propertyname">Harga per malam : </b> Rp 150.000</li>
                                    <li><b class="propertyname">Fasilitas Rumah : </b> AC di setiap kamar, 2 kamar tidur, 1 kamar mandi, 1 garasi mobil, dan 1 taman</li>
                                    <li><b class="propertyname">Deskripsi Rumah : </b> 200 m2, lantai 2, listrik memakai token, lokasi dekat kota</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 form-pesan">
                        <form method="POST" action="pembayaran.jsp">
                            <p>Ingin menyewa properti ini?</p>
                            <div class="form-group">
                                <label for="nama">Nama</label>
                                <input type="text" class="form-control" id="nama">
                            </div>
                            <div class="form-group">
                                <label for="almt">Alamat</label>
                                <input type="text" class="form-control" id="almt">
                            </div>
                            <div class="form-group">
                                <label for="tlpn">Nomor Telepon:</label>
                                <input type="text" class="form-control" id="tlpn">
                            </div>
                            <div class="form-group"> <!-- Date input -->
                                <label class="control-label" for="date">Date</label>
                                <input class="form-control" id="date" name="date" placeholder="MM/DD/YYY" type="text"/>
                            </div>
                            <div class="form-group">
                                <label for="durasi">Durasi Sewa (hari)</label>
                                <input type="number" class="form-control" min=1 id="durasi" name="durasi" value=1>
                            </div>
                            <div class="form-group">
                                <label for="tamu">Jumlah Tamu (orang)</label>
                                <input type="number" class="form-control" min=1 name="tamu" id="tamu" value=1>
                            </div>
                            <a href="cekFormInput.jsp" class="btn btn-buynow">Pesan</a>
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

        <script>
            $(document).ready(function () {
                var date_input = $('input[name="date"]'); //our date input has the name "date"
                var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
                date_input.datepicker({
                    format: 'mm/dd/yyyy',
                    container: container,
                    todayHighlight: true,
                    autoclose: true,
                })
            })
        </script>
    </body>
</html>
