package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class intranetEnt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Bangers' rel='stylesheet'>\n");
      out.write("  <link rel=\"stylesheet\" href=\"navbar.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"intranetEnt.css\">\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap' rel='stylesheet'>\n");
      out.write("  <title>Compte de l'entreprise</title>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <nav>\n");
      out.write("    <ul>\n");
      out.write("      <div><a class=\"logo\" href=\"#\">Carriere</a>\n");
      out.write("        <p>Mettons-nous au travail</p>\n");
      out.write("      </div>\n");
      out.write("      <li><a href=\"javascript:disconnect();\">Déconnexion</a></li>\n");
      out.write("      <li><a href=\"entreprise.jsp\">Candidats</a></li>\n");
      out.write("      <li><a href=\"intranetEnt.jsp\">Compte</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("  <div class=\"nav-margin\"></div> \n");
      out.write("\n");
      out.write("  <div class=\"wrapper\">\n");
      out.write("    <div class=\"left\">\n");
      out.write("      <img src=\"images/account.png\" alt=\"user\" width=\"128\">\n");
      out.write("     \n");
      out.write("      <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("      <h4> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${domain}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("      <h4> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    <div class=\"right\">\n");
      out.write("      <div class=\"info\">\n");
      out.write("        <h3>Information</h3>\n");
      out.write("        <div class=\"info_data\">\n");
      out.write("          <div class=\"data\">\n");
      out.write("            <h4> &nbsp; &nbsp;Nom </h4>\n");
      out.write("            <form>\n");
      out.write("              <div class=\" input \">\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <input class=\"myInput\" type=\"text\" name=\"name\" placeholder=\"Nom\" disabled=\"disabled\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"modifier\" class=\"envoyer\">\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"data\">\n");
      out.write("            <h4> &nbsp; &nbsp;Local </h4>\n");
      out.write("            <form>\n");
      out.write("              <div class=\" input \">\n");
      out.write("\n");
      out.write("                <input class=\"myInput\" type=\"text\" name=\"adress\" placeholder=\"Local\" disabled=\"disabled\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"modifier\" class=\"envoyer\">\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"data\">\n");
      out.write("            <h4> &nbsp; &nbsp;Domaine </h4>\n");
      out.write("            <form>\n");
      out.write("              <div class=\" input \">\n");
      out.write("\n");
      out.write("                <input class=\"myInput\" type=\"text\" name=\"domain\" placeholder=\"Domaine\" disabled=\"disabled\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${domain}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"modifier\" class=\"envoyer\">\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"data\">\n");
      out.write("            <h4> &nbsp; &nbsp;Description </h4>\n");
      out.write("            <form>\n");
      out.write("              <div class=\" input \">\n");
      out.write("\n");
      out.write("                <input class=\"myInput\" type=\"text\" name=\"description\" placeholder=\"Description\" disabled=\"disabled\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"modifier\" class=\"envoyer\">\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"data\">\n");
      out.write("            <h4> &nbsp; &nbsp;Numéro </h4>\n");
      out.write("            <form>\n");
      out.write("              <div class=\" input \">\n");
      out.write("\n");
      out.write("                <input class=\"myInput\" type=\"text\" name=\"phone\" placeholder=\"numéro\" disabled=\"disabled\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"modifier\" class=\"envoyer\">\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"data\">\n");
      out.write("            <h4> &nbsp; &nbsp;Email </h4>\n");
      out.write("            <form>\n");
      out.write("              <div class=\" input \">\n");
      out.write("\n");
      out.write("                <input class=\"myInput\" type=\"email\" name=\"email\" placeholder=\"Email\" disabled=\"disabled\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"modifier\" class=\"envoyer\">\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"projects\">\n");
      out.write("        <h3>Postes disponibles</h3>\n");
      out.write("        <div class=\"projects_data\">\n");
      out.write("          <div class=\"dat\">\n");
      out.write("\n");
      out.write("            <h4> developpeur java</h4> <a href=\"#\"><img src=\"images/remove.png\"> </a>\n");
      out.write("            <h4> developpeur java</h4> <a href=\"#\"><img src=\"images/remove.png\"> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form action=\"PosteServlet\" method=\"post\" >\n");
      out.write("              <input class=\"ajouter\" type=\"text\" name=\"ajouter\" placeholder=\"Ajouter poste\">\n");
      out.write("            </form>\n");
      out.write("            <a href=\"\"> <img src=\"images/add.png\"></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("<script src=\"disconnect.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
