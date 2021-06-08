package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t<a href=\"index.html\" class=\"navbar-brand brand\"> SCORILO </a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"shop.html\">Shop</a></li>\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"product.html\">Product</a></li>\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"checkout.html\">Checkout</a></li>\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("\t\t\t\t<div class=\"text-pageheader\">\n");
      out.write("\t\t\t\t\t<div class=\"subtext-image\" data-scrollreveal=\"enter bottom over 1.7s after 0.0s\">\n");
      out.write("\t\t\t\t\t\t Product Name\n");
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
      out.write("\t\t\t<h1 class=\"text-center latestitems\">Awesome Product</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"wow-hr type_short\">\n");
      out.write("\t\t\t<span class=\"wow-hr-h\">\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i>\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i>\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i>\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t<div class=\"productbox\">\n");
      out.write("\t\t\t\t<img src=\"images/product2-2.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<div class=\"product-details text-left\">\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\tYour description here. Serenity is a highly-professional & modern website theme crafted with you, the user, in mind. This light-weight theme is generous, built with custom types and enough shortcodes to customize each page according to your project. You will notice some examples of pages in demo, but this theme can do much more.\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"btn btn-buynow\">$49.00 - Purchase</a>\n");
      out.write("\t\t\t<div class=\"properties-box\">\n");
      out.write("\t\t\t\t<ul class=\"unstyle\">\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">Version:</b> 1.0</li>\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">Image Size:</b> 2340x1200</li>\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">Files Included:</b> mp3, audio, jpeg, png</li>\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">Documentation:</b> Well Documented</li>\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">License:</b> GNU</li>\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">Requires:</b> Easy Digital Downloads</li>\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">Environment:</b> Wordpress</li>\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">Any Field Etc:</b> Any Detail</li>\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">Number:</b> Up to 20 specifications in this box</li>\n");
      out.write("\t\t\t\t\t<li><b class=\"propertyname\">Live Demo:</b><a target=\"_blank\" href=\"http://www.wowthemes.net/\">http://www.wowthemes.net/</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- CALL TO ACTION =============================-->\n");
      out.write("<section class=\"content-block\" style=\"background-color:#00bba7;\">\n");
      out.write("<div class=\"container text-center\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-sm-10 col-sm-offset-1\">\n");
      out.write("\t\t\t<div class=\"item\" data-scrollreveal=\"enter top over 0.4s after 0.1s\">\n");
      out.write("\t\t\t\t<h1 class=\"callactiontitle\"> Promote Items Area Give Discount to Buyers <span class=\"callactionbutton\"><i class=\"fa fa-gift\"></i> WOW24TH</span>\n");
      out.write("\t\t\t\t</h1>\n");
      out.write("\t\t\t</div>\n");
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
      out.write("<!-- Load JS here for greater good =============================-->\n");
      out.write("<script src=\"js/jquery-.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/anim.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
