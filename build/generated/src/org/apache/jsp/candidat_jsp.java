package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candidat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("  <title>CARRIERE</title>\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Bangers' rel='stylesheet'>\n");
      out.write("  <link rel=\"stylesheet\" href=\"navbar.css\">\n");
      out.write("  <link href=\"signIn.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"signUpEntreprise.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <nav>\n");
      out.write("    <ul>\n");
      out.write("      <div><a class=\"logo\" href=\"#\">Carriere</a>\n");
      out.write("        <p>Mettons-nous au travail</p>\n");
      out.write("      </div>\n");
      out.write("      <li><a href=\"#connexion\">Connexion</a></li>\n");
      out.write("      <li><a href=\"#offres\">Offres</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("  <div class=\"nav-margin\"></div>\n");
      out.write("  <div id=\"connexion\">\n");
      out.write("    <div class=\"button\">\n");
      out.write("      <button id=\"candidat\" class=\"button1\">Candidat</button>\n");
      out.write("      <button id=\"entreprise\" class=\"button1\">Entreprise</button>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <div id=\"sign-in-candidat\">\n");
      out.write("        <h2>TROUVEZ UNE MEILLEURE FAÇON DE TRAVAILLER</h2>\n");
      out.write("        <div class=\"container\" id=\"container\">\n");
      out.write("          <div class=\"form-container sign-up-container\">\n");
      out.write("            <form action=\"CandidatServlet\" method=\"post\">\n");
      out.write("              <h1>Inscription</h1>\n");
      out.write("              <div class=\"social-container\">\n");
      out.write("                <a href=\"#\" class=\"social\"><img src=\"images/facebook.png\"></a>\n");
      out.write("                <a href=\"#\" class=\"social\"><img src=\"images/google.png\"></a>\n");
      out.write("                <a href=\"#\" class=\"social\"><img src=\"images/linkedin.png\"></a>\n");
      out.write("              </div>\n");
      out.write("              <span>ou bien utiliser votre e-mail pour créer un compte</span>\n");
      out.write("              <input type=\"text\" placeholder=\"Name\" class=\"sign-in-input\" name=\"name\"/>\n");
      out.write("              <input type=\"email\" placeholder=\"Email\" class=\"sign-in-input\" name=\"email\"/>\n");
      out.write("              <input type=\"password\" placeholder=\"Password\" class=\"sign-in-input\" name=\"password\"/>\n");
      out.write("              <button type=\"submit\"  > S'inscrire  </button>   \n");
      out.write("              \n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-container sign-in-container\">\n");
      out.write("            <form action=\"#\">\n");
      out.write("              <h1>Connexion</h1>\n");
      out.write("              <div class=\"social-container\">\n");
      out.write("                <a href=\"#\" class=\"social\"><img src=\"images/facebook.png\"></a>\n");
      out.write("                <a href=\"#\" class=\"social\"><img src=\"images/google.png\"></a>\n");
      out.write("                <a href=\"#\" class=\"social\"><img src=\"images/linkedin.png\"></a>\n");
      out.write("              </div>\n");
      out.write("              <span>ou bien utiliser votre compte</span>\n");
      out.write("              <input type=\"email\" placeholder=\"Email\" class=\"sign-in-input\"/>\n");
      out.write("              <input type=\"password\" placeholder=\"Password\" class=\"sign-in-input\" />\n");
      out.write("              <a href=\"#\">Mot de passe oublié?</a>\n");
      out.write("              <button>Se connecter</button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"overlay-container\">\n");
      out.write("            <div class=\"overlay\">\n");
      out.write("              <div class=\"overlay-panel overlay-left\">\n");
      out.write("                <h1>Re-bonjour!</h1>\n");
      out.write("                <p>\n");
      out.write("                  Pour rester connecté avec nous, veuillez vous connecter avec vos informations personnelles</p>\n");
      out.write("                <button class=\"ghost\" id=\"signIn\">Se connecter</button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"overlay-panel overlay-right\">\n");
      out.write("                <h1>Bonjour, ami!</h1>\n");
      out.write("                <p>\n");
      out.write("                  Entrez vos données personnelles pour pouvoir héberger votre CV</p>\n");
      out.write("                <button class=\"ghost\" id=\"signUp\">S'inscrire</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("  <script src=\"signIn.js\"></script>\n");
      out.write("  <script src=\"signUpEntreprise.js\"></script>\n");
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
