package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pembayaran_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"generator\" content=\"\">\n");
      out.write("<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- HEADER =============================-->\n");
      out.write("<header class=\"item header margin-top-0\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\t<nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\n");
      out.write("\t\t\t<i class=\"fa fa-bars\"></i>\n");
      out.write("\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a href=\"index.html\" class=\"navbar-brand brand\"> myRental </a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"index.html\">Utama</a></li>\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"shop.html\">Produk</a></li>\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"product.html\">Reservasi Saya</a></li>\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"checkout.html\">Profil</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("\t\t\t\t<div class=\"text-pageheader\">\n");
      out.write("\t\t\t\t\t<div class=\"subtext-image\" data-scrollreveal=\"enter bottom over 1.7s after 0.0s\">\n");
      out.write("\t\t\t\t\t\t Checkout\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- CONTENT =============================-->\n");
      out.write("<section class=\"item content\">\n");
      out.write("<div class=\"container toparea\">\n");
      out.write("\t<div class=\"underlined-title\">\n");
      out.write("\t\t<div class=\"editContent\">\n");
      out.write("\t\t\t<h1 class=\"text-center latestitems\">Detail Transaksi</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"wow-hr type_short\">\n");
      out.write("\t\t\t<span class=\"wow-hr-h\">\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i>\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i>\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i>\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"edd_checkout_wrap\" class=\"col-md-8 col-md-offset-2\">\n");
      out.write("\t\t<form id=\"edd_checkout_cart_form\" method=\"post\">\n");
      out.write("\t\t\t<div id=\"edd_checkout_cart_wrap\">\n");
      out.write("\t\t\t\t<table id=\"edd_checkout_cart\" class=\"ajaxed\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr class=\"edd_cart_header_row\">\n");
      out.write("\t\t\t\t\t<th class=\"edd_cart_item_name\">\n");
      out.write("\t\t\t\t\t\t Nama Properti\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t<th class=\"edd_cart_item_price\">\n");
      out.write("\t\t\t\t\t\t Harga Properti\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("                                        <th class=\"edd_cart_item_price\">\n");
      out.write("\t\t\t\t\t\t Tanggal Check In\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("                                        <th class=\"edd_cart_item_price\">\n");
      out.write("\t\t\t\t\t\t Durasi\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("                                        <th class=\"edd_cart_item_price\">\n");
      out.write("\t\t\t\t\t\t Jumlah Orang\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t<th class=\"edd_cart_actions\">\n");
      out.write("\t\t\t\t\t\t Aksi\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t<tr class=\"edd_cart_item\" id=\"edd_cart_item_0_25\" data-download-id=\"25\">\n");
      out.write("\t\t\t\t\t<td class=\"edd_cart_item_name\">\n");
      out.write("                                            <span class=\"edd_checkout_cart_item_title\">Rumah Aman</span>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td class=\"edd_cart_item_price\">\n");
      out.write("\t\t\t\t\t\t Rp500.000/hari\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("                                        <td class=\"edd_cart_item_price\">\n");
      out.write("\t\t\t\t\t\t 10/09/2021\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("                                        <td class=\"edd_cart_item_price\">\n");
      out.write("\t\t\t\t\t\t 3\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("                                        <th class=\"edd_cart_item_price\">\n");
      out.write("\t\t\t\t\t\t 1 orang\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t<td class=\"edd_cart_actions\">\n");
      out.write("\t\t\t\t\t\t<a class=\"edd_cart_remove_item_btn\" href=\"#\">Hapus</a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t<tfoot>\n");
      out.write("\t\t\t\t<tr class=\"edd_cart_footer_row\">\n");
      out.write("\t\t\t\t\t<th colspan=\"6\" class=\"edd_cart_total\">\n");
      out.write("                                            Diskon: <span class=\"edd_cart_amount\" data-subtotal=\"11.99\" data-total=\"11.99\">0%</span><br>\n");
      out.write("\t\t\t\t\t\t Total yang harus dibayar: <span class=\"edd_cart_amount\" data-subtotal=\"11.99\" data-total=\"11.99\">Rp5.000.000</span>\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</tfoot>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<div id=\"edd_checkout_form_wrap\" class=\"edd_clearfix\">\n");
      out.write("\t\t\t<form id=\"edd_purchase_form\" class=\"edd_form\" action=\"#\" method=\"POST\">\n");
      out.write("\t\t\t\t<fieldset id=\"edd_checkout_user_info\">\n");
      out.write("\t\t\t\t\t<legend>Pembayaran</legend>\n");
      out.write("\t\t\t\t\t<p class=\"form-check\">\n");
      out.write("\t\t\t\t\t\t<label class=\"edd-label\" for=\"edd-email\">\n");
      out.write("\t\t\t\t\t\tPilih jenis Pembayaran <span class=\"edd-required-indicator\">*</span></label>\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"flexRadioDefault\" id=\"flexRadioDefault1\">\n");
      out.write("                                                <span for=\"flexRadioDefault1\">Debit</span>&nbsp\n");
      out.write("                                                <input type=\"radio\" name=\"flexRadioDefault\" id=\"flexRadioDefault2\">\n");
      out.write("                                                <span for=\"flexRadioDefault2\">Kredit</span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p id=\"edd-first-name-wrap\">\n");
      out.write("\t\t\t\t\t\t<label class=\"edd-label\" for=\"edd-first\">\n");
      out.write("\t\t\t\t\t\tNama Pemegang Kartu<span class=\"edd-required-indicator\">*</span>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t<input class=\"edd-input required\" type=\"text\" name=\"edd_first\" placeholder=\"Nama\" id=\"edd-first\" value=\"\" required=\"\">\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p id=\"edd-last-name-wrap\">\n");
      out.write("\t\t\t\t\t\t<label class=\"edd-label\" for=\"edd-last\">\n");
      out.write("\t\t\t\t\t\tNomor Kartu<span class=\"edd-required-indicator\">*</span>\n");
      out.write("                                                </label>\n");
      out.write("\t\t\t\t\t\t<input class=\"edd-input required\" type=\"text\" name=\"edd_last\" id=\"edd-last\" placeholder=\"Nomor kartu\" value=\"\">\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t<fieldset id=\"edd_purchase_submit\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"edd_action\" value=\"purchase\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"edd-gateway\" value=\"manual\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"edd-submit button\" id=\"edd-purchase-button\" name=\"edd-purchase\" value=\"Purchase\">\n");
      out.write("\t\t\t\t</fieldset>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- FOOTER =============================-->\n");
      out.write("<div class=\"footer text-center\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<p class=\"footernote\">\n");
      out.write("\t\t\t\t Connect with Scorilo\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<ul class=\"social-iconsfooter\">\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-phone\"></i></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t &copy; 2017 Your Website Name<br/>\n");
      out.write("\t\t\t\tScorilo - Free template by <a href=\"https://www.wowthemes.net/\">WowThemesNet</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- SCRIPTS =============================-->\n");
      out.write("<script src=\"assets/js/jquery-.js\"></script>\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"assets/js/anim.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
