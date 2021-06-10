<%-- 
    Document   : home
    Created on : Jun 2, 2021, 7:14:12 PM
    Author     : Acer
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
                                <li class="propClone"><a href="index.jsp">Reservasi Saya</a></li>
                                <li class="propClone"><a href="index.jsp">Profil</a></li>
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
                    <div class="col-md-4">
                        <div class="productbox">
                            <div class="fadeshop">
                                <div class="captionshop text-center" style="display: none;">
                                    <h3>Item Name</h3>
                                    <p>
                                        This is a short excerpt to generally describe what the item is about.
                                    </p>
                                    <p>
                                        <a href="#" class="learn-more detailslearn"><i class="fa fa-shopping-cart"></i> Purchase</a>
                                        <a href="#" class="learn-more detailslearn"><i class="fa fa-link"></i> Details</a>
                                    </p>
                                </div>
                                <span><img src="assets/images/rumah2.jpg" class="pic" alt=""></span>
                            </div>
                            <div class="product-details">
                                <a href="#">
                                    <h1>Rumah Aman</h1>
                                </a>
                                <span class="price">
                                    <span class="edd_price">Rp10.000.000/tahun</span>
                                </span>
                            </div>
                        </div>
                    </div>
                    <!-- /.productbox -->
                    <div class="col-md-4">
                        <div class="productbox">
                            <div class="fadeshop">
                                <div class="captionshop text-center" style="display: none;">
                                    <h3>Item Name</h3>
                                    <p>
                                        This is a short excerpt to generally describe what the item is about.
                                    </p>
                                    <p>
                                        <a href="#" class="learn-more detailslearn"><i class="fa fa-shopping-cart"></i> Sewa</a>
                                        <a href="#" class="learn-more detailslearn"><i class="fa fa-link"></i> Detail</a>
                                    </p>
                                </div>
                                <span><img src="assets/images/rumah.jpg" class="pic" alt=""></span>
                            </div>
                            <div class="product-details">
                                <a href="#">
                                    <h1>Rumah Kaya</h1>
                                </a>
                                <span class="price">
                                    <span class="edd_price">Rp5.000.000/tahun</span>
                                </span>
                            </div>
                        </div>
                    </div>
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
                    <div class="col-md-4">
                        <div class="productbox">
                            <div class="fadeshop">
                                <div class="captionshop text-center" style="display: none;">
                                    <h3>Item Name</h3>
                                    <p>
                                        This is a short excerpt to generally describe what the item is about.
                                    </p>
                                    <p>
                                        <a href="#" class="learn-more detailslearn"><i class="fa fa-shopping-cart"></i> Purchase</a>
                                        <a href="#" class="learn-more detailslearn"><i class="fa fa-link"></i> Details</a>
                                    </p>
                                </div>
                                <span><img src="assets/images/rumah.jpg" class="pic" alt=""></span>
                            </div>
                            <div class="product-details">
                                <a href="#">
                                    <h1>Rumah Kaya</h1>
                                </a>
                                <span class="price">
                                    <span class="edd_price">Rp5.000.000/tahun</span>
                                </span>
                            </div>
                        </div>
                    </div>
                    <!-- /.productbox -->
                    <div class="col-md-4">
                        <div class="productbox">
                            <div class="fadeshop">
                                <div class="captionshop text-center" style="display: none;">
                                    <h3>Item Name</h3>
                                    <p>
                                        This is a short excerpt to generally describe what the item is about.
                                    </p>
                                    <p>
                                        <a href="#" class="learn-more detailslearn"><i class="fa fa-shopping-cart"></i> Purchase</a>
                                        <a href="#" class="learn-more detailslearn"><i class="fa fa-link"></i> Details</a>
                                    </p>
                                </div>
                                <span><img src="assets/images/rumah2.jpg" class="pic" alt=""></span>
                            </div>
                            <div class="product-details">
                                <a href="#">
                                    <h1>Rumah Kaya</h1>
                                </a>
                                <span class="price">
                                    <span class="edd_price">Rp10.000.000/tahun</span>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- CALL TO ACTION =============================-->
        <section class="content-block" style="background-color:#00bba7;">
            <div class="container text-center">
                <div class="row">
                    <div class="col-sm-10 col-sm-offset-1">
                        <div class="item" data-scrollreveal="enter top over 0.4s after 0.1s">
                            <h1 class="callactiontitle"> Promote Items Area Give Discount to Buyers <span class="callactionbutton"><i class="fa fa-gift"></i> WOW24TH</span>
                            </h1>
                        </div>
                    </div>
                </div>
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

        <!-- Load JS here for greater good =============================-->
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
    </body>
</html>