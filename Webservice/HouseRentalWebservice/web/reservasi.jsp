<%-- 
    Document   : pembayaran
    Created on : Jun 4, 2021, 6:12:56 PM
    Author     : Acer
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
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
        <%
            com.myrental.TransaksiService_Service service = new com.myrental.TransaksiService_Service();
            com.myrental.TransaksiService port = service.getTransaksiServicePort();
            if (session.getAttribute("user") != null) {
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
                                    Reservasi
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

                <div id="edd_checkout_wrap" class="col-md-8 col-md-offset-2" style="width:80%; margin-left:10%">
                    <%
                        // TODO process result here
                        com.myrental.User u = (com.myrental.User) session.getAttribute("user");
                        String username = u.getUsername();
                        java.util.List<com.myrental.Transaksi> result = port.show(username);
                        if (!result.isEmpty()) {
                            for (com.myrental.Transaksi t : result) {
                                String nama = t.getProperti().getNama();
                                String total = String.format("%,d\n", t.getHarga());
                                LocalDate tglChkIn = LocalDate.parse(t.getTanggalPenyewaan());
                                int durasi = t.getDurasiSewa();
                                LocalDate tglChkOut = tglChkIn.plusDays(durasi);
                                int jumlahOrang = t.getJumlahOrang();
                                int status = t.getStatus();
                                String stat = "";
                                if (tglChkOut.isAfter(LocalDate.now())) {
                                    if (status == 0) {
                                        t.setStatus(1);
                                        port.update(t.getStatus(), t.getId());
                                        stat = "Finished";
                                    }
                                } else {
                                    if (status == 0) {
                                        stat = "Verified";
                                    } else {
                                        stat = "Finished";
                                    }
                                }
                    %>
                    <form id="edd_checkout_cart_form" method="post">
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
                                    <tr class="edd_cart_item" id="edd_cart_item_0_25" data-download-id="25">
                                        <td class="edd_cart_item_name">
                                            <span class="edd_checkout_cart_item_title"><%=nama%></span>
                                        </td>
                                        <td class="edd_cart_item_price">
                                            Rp<%=total%>/malam
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
                                        <% if (stat.equals("Finished")) {%>
                                        <td class="edd_cart_actions">
                                            Rating
                                        </td>
                                        <%} else {%>
                                        <td class="edd_cart_actions">
                                            <%=stat%>
                                        </td>
                                        <%}%>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </form>
                    <%}
                    } else {%>
                    <p style="text-align:center;font-size:20px;font-weight:bold;">Anda belum melakukan transaksi sama sekali!</p>
                    <%}%>
                </div>
            </div>
            <%} else { %>
            <script>alert("Session Anda telah habis!");</script>
            <%
                    response.sendRedirect("index.jsp");
                    session.removeAttribute("Error");
                }%>
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