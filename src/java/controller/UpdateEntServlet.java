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
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class UpdateEntServlet extends HttpServlet {

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
            out.println("<title>Servlet UpdateEntServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateEntServlet at " + request.getContextPath() + "</h1>");
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
       
         HttpSession session=request.getSession(true);
       String email = session.getAttribute("email").toString();
       System.out.print(email);
       Enumeration<String> parameterNames = request.getParameterNames();
       String paramName="";
        if (parameterNames.hasMoreElements()) {
 
            paramName = parameterNames.nextElement();
        }
        System.out.print(paramName);
        String input = request.getParameter(paramName);
        List <String> columnNames = new ArrayList<String>();
         columnNames.add("name");
         columnNames.add("adress");
         columnNames.add("domain");
         columnNames.add("description");
         columnNames.add("phone");
         columnNames.add("email");
         
               Connection  con=null;
               try {
		    Class.forName("com.mysql.jdbc.Driver");
                    con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db?useUnicode=true &useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC", "root", "");

		         
                    if (columnNames.contains(paramName)){
                    PreparedStatement pstmt = con.prepareStatement("UPDATE entreprise SET " + paramName + "= ? where email =?");
                    pstmt.setString(1,input);
                    pstmt.setString(2,email);
        int result = pstmt.executeUpdate();
         }
                     } catch (Exception e) {
		    	  		System.out.println(e.getMessage());
		                System.exit(0); 
		                      }
          request.getRequestDispatcher( "intranetEnt.jsp").forward( request, response );      
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
