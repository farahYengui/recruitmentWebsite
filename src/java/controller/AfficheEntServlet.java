/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class AfficheEntServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AfficheEntServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AfficheEntServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = "";
        String adress = "";
        String domain = "";
        String description = "";
        String phone = "";
        String email = "";
        String job = request.getParameter("post");
      
        List <String> listPost = new ArrayList<String>();
           try
      {  /**CONNEXION BDD**/
          
         Class.forName("com.mysql.jdbc.Driver");// charger le driver ODBC

         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db?useUnicode=true &useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC", "root", "");

         PreparedStatement pstmt1 = con.prepareStatement("select * from entreprise where email=?");

         pstmt1.setString(1,"f@g.com"); 
         
            ResultSet rs = pstmt1.executeQuery();
       if (rs.next()){
        name = rs.getString("name"); 
        adress = rs.getString("adress");
        domain = rs.getString("domain");
        description = rs.getString("description");
        phone = rs.getString("phone");
        email = rs.getString("email");
        System.out.print(email);
 } 
        
PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("SELECT post from poste");
ResultSet rslt= pstmt.executeQuery(); // retourne une table rs

while(rslt.next()){
    listPost.add(rslt.getString("post"));
    System.out.print(rslt.getString("post"));
      }

 }catch( Exception exp)
       {
System.out.println (exp.getMessage());
       }
        request.setAttribute("name", name);
        request.setAttribute("adress", adress);
        request.setAttribute("domain", domain);
        request.setAttribute("description", description);
        request.setAttribute("phone", phone);
        request.setAttribute("phone", email);
        request.setAttribute("listPost", listPost);
        request.getRequestDispatcher( "intranetEnt").forward( request, response );  
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
