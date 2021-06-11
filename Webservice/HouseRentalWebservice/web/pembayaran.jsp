<%-- 
    Document   : pembayaran
    Created on : Jun 4, 2021, 6:12:56 PM
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
        <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700" rel="stylesheet">
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
                                <li class="propClone"><a href="index.html">Utama</a></li>
                                <li class="propClone"><a href="shop.html">Produk</a></li>
                                <li class="propClone"><a href="product.html">Reservasi Saya</a></li>
                                <li class="propClone"><a href="checkout.html">Profil</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <div class="text-pageheader">
                                <div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.0s">
                                    Checkout
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
                        <h1 class="text-center latestitems">Detail Transaksi</h1>
                    </div>
                    <div class="wow-hr type_short">
                        <span class="wow-hr-h">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                        </span>
                    </div>
                </div>
                <div id="edd_checkout_wrap" class="col-md-8 col-md-offset-2">
                    <form id="edd_checkout_cart_form" method="post">
                        <div id="edd_checkout_cart_wrap">
                            <table id="edd_checkout_cart" class="ajaxed">
                                <thead>
                                    <tr class="edd_cart_header_row">
                                        <th class="edd_cart_item_name">
                                            Nama Properti
                                        </th>
                                        <th class="edd_cart_item_price">
                                            Harga Properti
                                        </th>
                                        <th class="edd_cart_item_price">
                                            Tanggal Check In
                                        </th>
                                        <th class="edd_cart_item_price">
                                            Durasi
                                        </th>
                                        <th class="edd_cart_item_price">
                                            Jumlah Orang
                                        </th>
                                        <th class="edd_cart_actions">
                                            Aksi
                                        </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="edd_cart_item" id="edd_cart_item_0_25" data-download-id="25">
                                        <td class="edd_cart_item_name">
                                            <span class="edd_checkout_cart_item_title">Rumah Aman</span>
                                        </td>
                                        <td class="edd_cart_item_price">
                                            Rp500.000/hari
                                        </td>
                                        <td class="edd_cart_item_price">
                                            10/09/2021
                                        </td>
                                        <td class="edd_cart_item_price">
                                            3
                                        </td>
                                        <th class="edd_cart_item_price">
                                            1 orang
                                        </th>
                                        <td class="edd_cart_actions">
                                            <a class="edd_cart_remove_item_btn" href="#">Hapus</a>
                                        </td>
                                    </tr>
                                </tbody>
                                <tfoot>
                                    <tr class="edd_cart_footer_row">
                                        <th colspan="6" class="edd_cart_total">
                                            Diskon: <span class="edd_cart_amount" data-subtotal="11.99" data-total="11.99">0%</span><br>
                                            Total yang harus dibayar: <span class="edd_cart_amount" data-subtotal="11.99" data-total="11.99">Rp5.000.000</span>
                                        </th>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                    </form>
                    <div id="edd_checkout_form_wrap" class="edd_clearfix">
                        <form id="edd_purchase_form" class="edd_form" action="reservasi.jsp" method="POST">
                            <fieldset id="edd_checkout_user_info">
                                <legend>Pembayaran</legend>
                                <p class="form-check">
                                    <label class="edd-label" for="edd-email">
                                        Pilih jenis Pembayaran <span class="edd-required-indicator">*</span></label>
                                    <input type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                                    <span for="flexRadioDefault1">Debit</span>&nbsp
                                    <input type="radio" name="flexRadioDefault" id="flexRadioDefault2">
                                    <span for="flexRadioDefault2">Kredit</span>
                                </p>
                                <p id="edd-first-name-wrap">
                                    <label class="edd-label" for="edd-first">
                                        Nama Pemegang Kartu<span class="edd-required-indicator">*</span>
                                    </label>
                                    <input class="edd-input required" type="text" name="edd_first" placeholder="Nama" id="edd-first" value="" required="">
                                </p>
                                <p id="edd-last-name-wrap">
                                    <label class="edd-label" for="edd-last">
                                        Nomor Kartu<span class="edd-required-indicator">*</span>
                                    </label>
                                    <input class="edd-input required" type="text" name="edd_last" id="edd-last" placeholder="Nomor kartu" value="">
                                </p>
                            </fieldset>
                            <fieldset id="edd_purchase_submit">
                                <input type="hidden" name="edd_action" value="purchase">
                                <input type="hidden" name="edd-gateway" value="manual">
                                <input type="submit" class="edd-submit button" id="edd-purchase-button" name="edd-purchase" value="Purchase">
                            </fieldset>
                        </form>
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

        <!-- SCRIPTS =============================-->
        <script src="assets/js/jquery-.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/anim.js"></script>
    </body>
</html>