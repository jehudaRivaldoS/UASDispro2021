<%-- 
    Document   : utama
    Created on : Jun 3, 2021, 12:55:18 PM
    Author     : patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>myRental | Sewa Rumah </title> 
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="generator" content="">
        <link href="assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="assets/css/home.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    </style>
</head>
<body style="height:100%">
    <div id="blur">
        <!--HEADER-->
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
                                <li class="propClone"><a href="index.jsp">Home</a></li>
                                <li class="propClone"><a href="home.jsp">Properti</a></li>
                                <li class="propClone aktif"><a href="profil.jsp">Profil</a></li>	
                                <li id="openBox"><a>Login</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <div class="text-homeimage">
                                <div class="maintext-image" data-scrollreveal="enter top over 1.5s after 0.1s">
                                    Anda Senang, Kami Senang
                                </div>
                                <div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.3s">
                                    Mari pesan bersama myRental
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <!--END HEADER-->
        <!-- STEPS =============================-->
        <div class="item content">
            <div class="container toparea">
                <div class="row text-center">
                    <div class="underlined-title">
                        <div class="editContent">
                            <h1 class="text-center latestitems">APA ITU MYRENTAL?</h1>
                        </div>
                        <div class="wow-hr type_short">
                            <span class="wow-hr-h">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </span>
                        </div>
                    </div>
                    <div class="pengantar">
                        myRental adalah sebuah aplikasi yang bergerak di bidang bisnis. Yang mana, menyediakan bisnis berupa sewa-menyewa property. 
                        Banyak kumpulan property yang akan ditampilkan ketika sudah login ke dalam sistem. Tidak lupa, kalian dapat menyewa rumah 
                        yang disukai melalui website ini ataupun aplikasi myRental kami. Untuk pembayaran dapat dilakukan secara debit/kredit. 
                        Jika merasa kurang yakin dengan property yang disajikan, kalian dapat menghubungi sang pemilik melalui aplikasi kami tersebut.
                        Adapun, kami memberikan petunjuk kerja myRental agar kalian mudah mengerti dan memahaminya.
                    </div>
                </div>
            </div>
        </div>

        <section class="item content">
            <div class="container">
                <div class="underlined-title">
                    <div class="editContent">
                        <h1 class="text-center latestitems">BAGAIMANA CARA KERJA MYRENTAL?</h1>
                    </div>
                    <div class="wow-hr type_short">
                        <span class="wow-hr-h">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                        </span>
                    </div>
                </div>
                <div class="row slider">
                    <div class="slides">    
                        <input type="radio" name="next-btn" id="btn1"> 
                        <input type="radio" name="next-btn" id="btn2"> 
                        <input type="radio" name="next-btn" id="btn3"> 
                        <input type="radio" name="next-btn" id="btn4"> 
                        <div class="slide first">

                            <blockquote>              
                                <p style="text-align: center;">1. Melakukan Login</p>
                                <p class="content">Jika belum memiliki akun, dapat melakukan pendaftaran. Setelah terbuat, tinggal klik login. Untuk login, ikutin tombol bulat di bawah ini.</p>
                                <img src="assets/images/img1.png" width="200px" height="150px">
                            </blockquote>
                        </div>

                        <div class="slide">
                            <blockquote>              
                                <p style="text-align: center;">2. Terlihat daftar rumah</p>
                                <p class="content">Pilih rumah yang ingin disewa. Dengan cara klik tampilan rumah tersebut.</p>
                                <img src="assets/images/img2.png" width="200px" height="150px">
                            </blockquote>

                        </div>

                        <div class="slide">

                            <blockquote>              
                                <p style="text-align: center;">3. Mengisi form penyewaan.</p>
                                <p class="content">Lengkapi form tersebut. Setelah itu, klik checkout.</p>
                                <img src="assets/images/img5.png" width="200px" height="150px">
                            </blockquote>

                        </div>

                        <div class="slide">
                            <blockquote>              
                                <p style="text-align: center;">4. Melakukan pembayaran.</p>
                                <p class="content">Pilih jenis pembayaran Anda. Lalu, klik submit untuk mengkonfirmasi pembayaran tersebut.</p>
                                <img src="assets/images/img3.png" width="200px" height="150px">
                            </blockquote>

                        </div>

                        <div class="slide">
                            <blockquote>              
                                <p style="text-align: center;">5. Selesai.</p>
                                <p class="content">Jika proses berhasil, anda akan kembali ke halaman utama dan menerima info tentang rumah tersebut.</p>
                                <img src="assets/images/img6.png" width="200px" height="150px">
                            </blockquote>

                        </div>

                        <div class="slide">
                            <blockquote>              
                                <div class="log" style="text-align:center">
                                    <p style="font-weight: bold; font-size:25px;">Segera masuk untuk mendapatkan penawaran yang menarik!</p>
                                    <button type="button" class="btn btn-info" id="openBox">Login</button>     
                                </div>  
                            </blockquote>

                        </div>
                    </div>

                    <div class="navigation-manual">
                        <label for="btn1" class="manual-btn"><span class="tooltiptext">Halaman 1</span></label>
                        <label for="btn2" class="manual-btn"><span class="tooltiptext">Halaman 2</span></label>
                        <label for="btn3" class="manual-btn"><span class="tooltiptext">Halaman 3</span></label>
                        <label for="btn4" class="manual-btn"><span class="tooltiptext">Halaman 4</span></label>
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

                <label><input type="checkbox">Remember me</label><br>

                <button class="btn btn-success btn-primary" style="text-align: center;" name="sign">Sign in</button>
            </form> 

            <div class="footer-home">
                <h4>Belum memiliki akun?</h4>
                <p>Ayo segera bergabung untuk melihat segala jenis properti!</p>
                <button type="submit" class="btn btn-info" onclick="window.location.href = 'register.jsp'">Register</button>
            </div>
        </div>

    </div>

    <!-- FOOTER =============================-->
    <div class="footer text-center" id="blur">
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

    <script src="assets/js/jquery-.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/anim.js"></script>
    <script type="text/javascript">
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