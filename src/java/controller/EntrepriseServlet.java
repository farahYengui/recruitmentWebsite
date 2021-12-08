/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Entreprise;


/**
 *
 * @author RYZEN7
 */
public class EntrepriseServlet extends HttpServlet {

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
            out.println("<title>Servlet EntrepriseServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EntrepriseServlet at " + request.getContextPath() + "</h1>");
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
          String name = request.getParameter("name"); 
        String adress = request.getParameter("adress");
        String domain = request.getParameter("domain");
        String description = request.getParameter("description");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        request.setAttribute("name", name);
        request.setAttribute("adress", adress);
        request.setAttribute("domain", domain);
        request.setAttribute("description", description);
        request.setAttribute("phone", phone);
        request.setAttribute("email", email);
        request.setAttribute("password", password);
      /*  List myliste= new ArrayList();
        myliste.add("name");
        myliste.add("adress");
        myliste.add("domain");
        myliste.add("description");
        myliste.add("phone");
        myliste.add("email");
        myliste.add("password");
      
       
        tab[0]=name;
        tab[1]=adress;
        tab[2]=domain;
        tab[3]=description;
        tab[4]=phone;
        tab[5]=email;
        tab[6]=password;*/
         
         // 2- Envoyer les données à un EJB
    Entreprise instance = new Entreprise();
    String res= instance.inscrireEnt(name,adress,domain,description,phone,email,password);
   // request.setAttribute("enveloppe", myliste);
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
