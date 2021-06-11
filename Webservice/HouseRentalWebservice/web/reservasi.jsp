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
        <link href="https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700" rel="stylesheet">
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
                                <li class="propClone"><a href="produk.jsp">Utama</a></li>
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
                        <h1 class="text-center latestitems">Reservasi Saya</h1>
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
                                            Kode Reservasi
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
                                            <a class="edd_cart_remove_item_btn" href="#">1456372</a>
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
                </div>
            </div>
        </section>

        <!-- SCRIPTS =============================-->
        <script src="assets/js/jquery-.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/anim.js"></script>

    </body>
</html>