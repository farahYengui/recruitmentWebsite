package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intranetCan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Candidat</title>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <link href=\"navbar.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"intranetCan.css\" rel=\"stylesheet\">\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Bangers' rel='stylesheet'>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <nav>\n");
      out.write("    <ul>\n");
      out.write("      <div><a class=\"logo\" href=\"#\">Carriere</a>\n");
      out.write("        <p>Mettons-nous au travail</p>\n");
      out.write("      </div>\n");
      out.write("      <li><a href=\"javascript:disconnect();\">Déconnexion</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("  <div class=\"nav-margin\"></div>\n");
      out.write("  <div class=\"grid\">\n");
      out.write("    <div class=\"recher\">\n");
      out.write("      <div> <img src=\"images/portfolio.png\" id=\"emploi\"> Emploi recherché </div>\n");
      out.write("      <br>\n");
      out.write("      <!--Make sure the form has the autocomplete function switched off:-->\n");
      out.write("      <form class=\"in-form\">\n");
      out.write("        <div>\n");
      out.write("          <input id=\"inputCountry\" type=\"text\" name=\"regions\" placeholder=\"Région\">\n");
      out.write("        </div>\n");
      out.write("        <input type=\"submit\" value=\"\" class=\"envoyer\">\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"entrepriseContainer\">\n");
      out.write("      <h1 style=\"text-align: center;\">Bonjour ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("! Vous pouvez maintenant postuler votre CV pour n'importe quel\n");
      out.write("        emploi.</h1>\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <div class=\"right\">\n");
      out.write("          <div class=\"info\">\n");
      out.write("            <h3>Nom de l'entreprise</h3>\n");
      out.write("            <div class=\"info_data\">\n");
      out.write("              <div>\n");
      out.write("                <h4>Description</h4>\n");
      out.write("                <p>nhfnthnfthhhhhhhfdtj nkslpjjjjjjjjjjjjjjjjjjj jjjjjjjjjjjjjjjjjd</p>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <h4>Domaine</h4>\n");
      out.write("                <p>inforthhhhhhhhhhhhhhhhhhhhhhhhh</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div> <img src=\"images/location.png\" alt=\"\" class=\"local\"> localisation &nbsp; &nbsp;\n");
      out.write("                <img src=\"images/user.png\" alt=\"\" class=\"local\"> nombre de poste\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <button class=\"postuler\">Postuler maintenant </button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <div class=\"right\">\n");
      out.write("          <div class=\"info\">\n");
      out.write("            <h3>Nom de l'entreprise</h3>\n");
      out.write("            <div class=\"info_data\">\n");
      out.write("              <div>\n");
      out.write("                <h4>Description</h4>\n");
      out.write("                <p>nhfnthnfthhhhhhhfdtj nkslpjjjjjjjjjjjjjjjjjjj jjjjjjjjjjjjjjjjjd</p>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <h4>Domaine</h4>\n");
      out.write("                <p>inforthhhhhhhhhhhhhhhhhhhhhhhhh</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div> <img src=\"images/location.png\" alt=\"\" class=\"local\"> localisation &nbsp; &nbsp;\n");
      out.write("                <img src=\"images/user.png\" alt=\"\" class=\"local\"> nombre de poste\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <button class=\"postuler\">Postuler maintenant </button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"search.js\"></script>\n");
      out.write("  <script src=\"script.js\"></script>\n");
      out.write("  <script src=\"disconnect.js\"></script>\n");
      out.write("\n");
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
