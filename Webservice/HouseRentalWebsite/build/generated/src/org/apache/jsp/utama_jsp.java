package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class utama_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>myRental | Sewa Rumah </title> \n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/home.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div id=\"blur\">\n");
      out.write("        <header>\n");
      out.write("            <h2>MYRENTAL</h2>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"gambar\">\n");
      out.write("          <img src=\"assets/images/img4.png\" width=\"450px\" height=\"400px\">\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("        <div class=\"pengantar\">\n");
      out.write("          <h3>Tentang myRental</h3>\n");
      out.write("          <p>Aplikasi ini bergerak di bidang bisnis. Yang mana, menyediakan bisnis berupa sewa-menyewa property. \n");
      out.write("            Banyak kumpulan property yang akan ditampilkan ketika sudah login ke dalam sistem. Tidak lupa, kalian dapat menyewa rumah \n");
      out.write("            yang disukai melalui website ini ataupun aplikasi myRental kami. Untuk pembayaran dapat dilakukan secara debit/kredit. \n");
      out.write("            Jika merasa kurang yakin dengan property yang disajikan, kalian dapat menghubungi sang pemilik melalui aplikasi kami tersebut.\n");
      out.write("            Adapun, kami memberikan petunjuk kerja myRental agar kalian mudah mengerti dan memahaminya.</p>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("      \n");
      out.write("        <div class=\"slider\">\n");
      out.write("            <div class=\"slides\">    \n");
      out.write("              \n");
      out.write("                <input type=\"radio\" name=\"next-btn\" id=\"btn1\"> \n");
      out.write("                <input type=\"radio\" name=\"next-btn\" id=\"btn2\"> \n");
      out.write("                <input type=\"radio\" name=\"next-btn\" id=\"btn3\"> \n");
      out.write("                <input type=\"radio\" name=\"next-btn\" id=\"btn4\"> \n");
      out.write("                <h3 class=\"h3\">Cara Kerja myRental</h3>\n");
      out.write("                <div class=\"slide first\">\n");
      out.write("                 \n");
      out.write("                    <blockquote>              \n");
      out.write("                        <p>1. Melakukan Login</p>\n");
      out.write("                        <p>Jika belum memiliki akun, dapat melakukan pendaftaran. Setelah terbuat, tinggal klik login. Untuk login, ikutin tombol bulat di bawah ini.</p>\n");
      out.write("                        <img src=\"Gambar/img1.png\" width=\"200px\" height=\"150px\">\n");
      out.write("                    </blockquote>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <blockquote>              \n");
      out.write("                    <p>2. Terlihat daftar rumah</p>\n");
      out.write("                    <p>Pilih rumah yang ingin disewa. Dengan cara klik tampilan rumah tersebut.</p>\n");
      out.write("                    <img src=\"Gambar/img2.png\" width=\"200px\" height=\"150px\">\n");
      out.write("                    </blockquote>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                   \n");
      out.write("                    <blockquote>              \n");
      out.write("                    <p>3. Mengisi form penyewaan.</p>\n");
      out.write("                    <p>Lengkapi form tersebut. Setelah itu, klik checkout.</p>\n");
      out.write("                    <img src=\"Gambar/img5.png\" width=\"200px\" height=\"150px\">\n");
      out.write("                    </blockquote>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <blockquote>              \n");
      out.write("                    <p>4. Melakukan pembayaran.</p>\n");
      out.write("                    <p>Pilih jenis pembayaran Anda. Lalu, klik submit untuk mengkonfirmasi pembayaran tersebut.</p>\n");
      out.write("                    <img src=\"Gambar/img3.png\" width=\"200px\" height=\"150px\">\n");
      out.write("                    </blockquote>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                  <blockquote>              \n");
      out.write("                  <p>5. Selesai.</p>\n");
      out.write("                  <p>Jika proses berhasil, anda akan kembali ke halaman utama dan menerima info tentang rumah tersebut.</p>\n");
      out.write("                  <img src=\"Gambar/img6.png\" width=\"200px\" height=\"150px\">\n");
      out.write("                  </blockquote>\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <blockquote>              \n");
      out.write("                        <div class=\"log\">\n");
      out.write("                            <p>Silahkan masuk untuk mendapatkan penawaran yang menarik.</p>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-info\" id=\"openBox\">Login</button>     \n");
      out.write(" \n");
      out.write("                        </div>  \n");
      out.write("                    </blockquote>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"navigation-manual\">\n");
      out.write("                <label for=\"btn1\" class=\"manual-btn\"><span class=\"tooltiptext\">Halaman 1</span></label>\n");
      out.write("                <label for=\"btn2\" class=\"manual-btn\"><span class=\"tooltiptext\">Halaman 2</span></label>\n");
      out.write("                <label for=\"btn3\" class=\"manual-btn\"><span class=\"tooltiptext\">Halaman 3</span></label>\n");
      out.write("                <label for=\"btn4\" class=\"manual-btn\"><span class=\"tooltiptext\">Halaman 4</span></label>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      <div class=\"modal\" id=\"mymodal\">\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("          <h3>Login</h3>\n");
      out.write("          <span class=\"close\">&times;</span>\n");
      out.write("          <form method=\"post\" action=\"\">\n");
      out.write("           \n");
      out.write("            <input type=\"text\" id=\"user\" placeholder=\"Username\"><br>\n");
      out.write("            <input type=\"password\" id=\"pass\" placeholder=\"Password\"><br>\n");
      out.write("            \n");
      out.write("            <label><input type=\"checkbox\"> Remember me </label>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\">Sign in</button>\n");
      out.write("          </form> \n");
      out.write("          \n");
      out.write("          <div class=\"footer\">\n");
      out.write("            <h4>Belum memiliki akun</h4>\n");
      out.write("            <p>Ayo segera bergabung untuk melihat segala jenis property.</p>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-info\"  onclick=\"window.location.href='register.jsp'\">Register</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("      <p>&copy; 2021 myRental</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("      <script type=\"text/javascript\">\n");
      out.write("        var modal=document.getElementById(\"mymodal\");\n");
      out.write("        var btn = document.getElementById(\"openBox\");\n");
      out.write("        var spn = document.getElementsByClassName(\"close\")[0];\n");
      out.write("        var outofsight=document.getElementById(\"blur\");\n");
      out.write("       \n");
      out.write("        btn.onclick = function(){\n");
      out.write("          modal.style.display = \"block\";\n");
      out.write("          outofsight.classList.remove(\"pasif\");\n");
      out.write("          outofsight.classList.add(\"active\");\n");
      out.write("        }\n");
      out.write("        spn.onclick = function(){\n");
      out.write("          modal.style.display = \"none\";\n");
      out.write("          outofsight.classList.remove(\"active\");\n");
      out.write("          outofsight.classList.add(\"pasif\");\n");
      out.write("        }\n");
      out.write("\n");
      out.write("      </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
