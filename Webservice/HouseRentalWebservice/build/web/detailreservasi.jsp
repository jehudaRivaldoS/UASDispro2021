<%-- 
    Document   : detailreservasi
    Created on : Jun 19, 2021, 2:12:42 AM
    Author     : Acer
--%>

<%@page import="java.time.LocalDate"%>
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
        <link href="assets/css/pembayaran.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700" rel="stylesheet">
    </head>
    <body>
        <%
            com.myrental.TransaksiService_Service service = new com.myrental.TransaksiService_Service();
            com.myrental.TransaksiService port = service.getTransaksiServicePort();
            if (session.getAttribute("user") != null) {
                int id = Integer.parseInt(request.getParameter("id"));
                java.util.List<com.myrental.Transaksi> result = port.showDataTrans();
                for (com.myrental.Transaksi t : result) {
                    if (id == t.getId()) {
                        int total = t.getHarga();
                        int propHarga = t.getProperti().getHarga();
                        String nama = t.getProperti().getNama();
                        LocalDate tglChkIn = LocalDate.parse(t.getTanggalPenyewaan());
                        int durasi = t.getDurasiSewa();
                        LocalDate tglChkOut = tglChkIn.plusDays(durasi);
                        int jumlahOrang = t.getJumlahOrang();
                        int status = t.getStatus();
                        String catatan = t.getCatatan();
                        String stat = "";
                        if (LocalDate.now().isAfter(tglChkOut)) {
                            if (status == 0) {
                                t.setStatus(1);
                                port.update(t.getStatus(), t.getId());
                                stat = "Finished";
                            } else {
                                stat = "Finished";
                            }
                        } else {
                            if (status == 0) {
                                stat = "Verified";
                            } else {
                                t.setStatus(0);
                                port.update(t.getStatus(), t.getId());
                                stat = "Verified";
                            }
                        }
        %>
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
                                <li class="propClone"><a href="reservasi.jsp">Reservasi Saya</a></li>
                                <li class="propClone"><a href="logout.jsp">Logout</a></li>
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
                        <h1 class="text-center latestitems">Detail Reservasi</h1>
                    </div>
                    <div class="wow-hr type_short">
                        <span class="wow-hr-h">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                        </span>
                    </div>
                </div>
                <div id="edd_checkout_wrap" class="col-md-8 col-md-offset-2" style="width:80%; margin-left:11%;">
                    <div id="edd_checkout_cart_wrap">
                        <table id="edd_checkout_cart" class="ajaxed">
                            <thead>
                                <tr class="edd_cart_header_row">
                                    <th class="edd_cart_item_name">
                                        Nama Properti
                                    </th>
                                    <th class="edd_cart_item_price">
                                        Harga
                                    </th>
                                    <th class="edd_cart_item_price">
                                        Tanggal Check In
                                    </th>
                                    <th class="edd_cart_item_price">
                                        Durasi (malam)
                                    </th>
                                    <th class="edd_cart_item_price">
                                        Tanggal Check Out
                                    </th>
                                    <th class="edd_cart_item_price">
                                        Jumlah Orang
                                    </th>
                                    <th class="edd_cart_actions">
                                        Status
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                            <input type="hidden" name="id" value=<%=id%>>
                            <tr class="edd_cart_item" id="edd_cart_item_0_25" data-download-id="25">
                                <td class="edd_cart_item_name">
                                    <span><%=nama%></span>
                                </td>
                                <td class="edd_cart_item_price">
                                    Rp<%=String.format("%,d\n", propHarga)%>/malam
                                </td>
                                <td class="edd_cart_item_price">
                                    <%=tglChkIn%>
                                </td>
                                <td class="edd_cart_item_price">
                                    <%=durasi%>
                                </td>
                                <td class="edd_cart_item_price">
                                    <%=tglChkOut%>
                                </td>
                                <td class="edd_cart_item_price">
                                    <%=jumlahOrang%>
                                </td>
                                <td class="edd_cart_actions">
                                    <%=stat%>
                                </td>
                            </tr>
                            </tbody>
                            <tfoot>
                                <tr class="edd_cart_footer_row">
                                    <th colspan="7" class="edd_cart_total" style="font-size:20px;">
                                        <p>Total yang harus dibayar: Rp<span class="edd_cart_amount"><%=String.format("%,d\n", total)%></p>
                                        <p>Catatan: <%=catatan%></p>
                                    </th>
                                </tr>
                            </tfoot>
                        </table>
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
        <%}
                }
            } else {
                session.setAttribute("Error", "Session telah habis!");
                response.sendRedirect("index.jsp");
            }%>
        <!-- SCRIPTS =============================-->
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
