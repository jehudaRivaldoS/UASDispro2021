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
<!--        <link rel="stylesheet" type="text/css" href="assets/css/style.css">-->
        <link rel="stylesheet" type="text/css" href="assets/css/home.css">
    </head>
    <body>
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
                                <a href="index.html" class="navbar-brand brand"> MyRental</a>    
                          </div>  
                          <div id="navbar-collapse-02" class="collapse navbar-collapse">
                                <ul class="nav navbar-nav navbar-right">
                                      <li class="propClone"><a href="index.html">Home</a></li>				
                                      <li class="propClone"><a href="contact.html">Contact</a></li>
                                </ul>
                          </div>
                    </div>
                </nav>
        </header>
        
        <div class="gambar">
          <img src="assets/images/img4.png" width="450px" height="400px">
        </div>
      
        <div class="pengantar">
          <h3>Tentang myRental</h3>
          <p>Aplikasi ini bergerak di bidang bisnis. Yang mana, menyediakan bisnis berupa sewa-menyewa property. 
            Banyak kumpulan property yang akan ditampilkan ketika sudah login ke dalam sistem. Tidak lupa, kalian dapat menyewa rumah 
            yang disukai melalui website ini ataupun aplikasi myRental kami. Untuk pembayaran dapat dilakukan secara debit/kredit. 
            Jika merasa kurang yakin dengan property yang disajikan, kalian dapat menghubungi sang pemilik melalui aplikasi kami tersebut.
            Adapun, kami memberikan petunjuk kerja myRental agar kalian mudah mengerti dan memahaminya.</p>
        </div>
       
      
        <div class="slider">
            <div class="slides">    
                <input type="radio" name="next-btn" id="btn1"> 
                <input type="radio" name="next-btn" id="btn2"> 
                <input type="radio" name="next-btn" id="btn3"> 
                <input type="radio" name="next-btn" id="btn4"> 
                <h3 class="h3">Cara Kerja myRental</h3>
                <div class="slide first">
                    <blockquote>              
                        <p>1. Melakukan Login</p>
                        <p>Jika belum memiliki akun, dapat melakukan pendaftaran. Setelah terbuat, tinggal klik login. Untuk login, ikutin tombol bulat di bawah ini.</p>
                        <img src="assets/images/img1.png" width="200px" height="150px">
                    </blockquote>
                </div>

                <div class="slide">
                    <blockquote>              
                    <p>2. Terlihat daftar rumah</p>
                    <p>Pilih rumah yang ingin disewa. Dengan cara klik tampilan rumah tersebut.</p>
                    <img src="assets/images/img2.png" width="200px" height="150px">
                    </blockquote>     
                </div>

                <div class="slide">
                    <blockquote>              
                    <p>3. Mengisi form penyewaan.</p>
                    <p>Lengkapi form tersebut. Setelah itu, klik checkout.</p>
                    <img src="assets/images/img5.png" width="200px" height="150px">
                    </blockquote>
                </div>

                <div class="slide">
                    <blockquote>              
                    <p>4. Melakukan pembayaran.</p>
                    <p>Pilih jenis pembayaran Anda. Lalu, klik submit untuk mengkonfirmasi pembayaran tersebut.</p>
                    <img src="assets/images/img3.png" width="200px" height="150px">
                    </blockquote>    
                </div>

                <div class="slide">
                  <blockquote>              
                  <p>5. Selesai.</p>
                  <p>Jika proses berhasil, anda akan kembali ke halaman utama dan menerima info tentang rumah tersebut.</p>
                  <img src="assets/images/img6.png" width="200px" height="150px">
                  </blockquote>
              </div>

                <div class="slide">
                    <blockquote>              
                        <div class="log">
                            <p>Silahkan masuk untuk mendapatkan penawaran yang menarik.</p>
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

      <div class="modal" id="mymodal">

        <div class="content">
          <h3>Login</h3>
          <span class="close">&times;</span>
          <form method="post" action="">
           
            <input type="text" id="user" placeholder="Username"><br>
            <input type="password" id="pass" placeholder="Password"><br>
            
            <label><input type="checkbox"> Remember me </label>

            <button type="submit" class="btn btn-success">Sign in</button>
          </form> 
          
          <div class="footer">
            <h4>Belum memiliki akun</h4>
            <p>Ayo segera bergabung untuk melihat segala jenis property.</p>
            <button type="submit" class="btn btn-info"  onclick="window.location.href='register.jsp'">Register</button>
          </div>
        </div>
        
    </div>

    <footer>
      <p>&copy; 2021 myRental</p>
    </footer>

      <script type="text/javascript">
        var modal=document.getElementById("mymodal");
        var btn = document.getElementById("openBox");
        var spn = document.getElementsByClassName("close")[0];
        var outofsight=document.getElementById("blur");
       
        btn.onclick = function(){
          modal.style.display = "block";
          outofsight.classList.remove("pasif");
          outofsight.classList.add("active");
        }
        spn.onclick = function(){
          modal.style.display = "none";
          outofsight.classList.remove("active");
          outofsight.classList.add("pasif");
        }

      </script>
    </body>
</html>