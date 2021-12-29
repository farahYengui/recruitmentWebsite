/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author HP
 */
@MultipartConfig
public class FileUpload extends HttpServlet {

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
            out.println("<title>Servlet FileUpload</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FileUpload at " + request.getContextPath() + "</h1>");
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
        
        final Part filePart = request.getPart("file");
        System.out.print(request.getParts());
        System.out.print(request.getPart("file"));
	    String poste = request.getParameter("poste");
            String email = request.getParameter("email");
	    String message="";
	    InputStream pdfFileBytes = null;

	    try {
	    	
	        
	      if (!filePart.getContentType().equals("application/pdf"))
     	    {
		    		   message =" Fichier invalide.";
		    		   return;
     	    }
		    
     	   else if (filePart.getSize()>1048576 ) { //2mb
     		   {
     		  message =" La taille du fichier est très grande.";
     		  return;
     		   }
     	   }

	        pdfFileBytes = filePart.getInputStream();  // to get the body of the request as binary data

	        final byte[] bytes = new byte[pdfFileBytes.available()];
	         pdfFileBytes.read(bytes);  //Storing the binary data in bytes array.
	        
	        Connection  con=null;

		       try {
		    	     Class.forName("com.mysql.jdbc.Driver");
                             con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db?useUnicode=true &useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC", "root", "");

		          } catch (Exception e) {
		    	  		System.out.println(e);
		                System.exit(0); 
		                      }

				int success=0;
		        PreparedStatement pstmt = con.prepareStatement("INSERT INTO cv (poste,file,email) VALUES(?,?,?)");
		        pstmt.setString(1, poste);
		        pstmt.setBytes(2,bytes);
                        pstmt.setString(3,email); 
		        success = pstmt.executeUpdate();
		        if(success>=1)  System.out.println("Book Stored");
		         con.close(); 
                         message =" CV envoyé.";
	    } catch (FileNotFoundException fnf) {
	        message =" Vous n'avez pas inséré un fichier. /n";
	        message += " ERROR: " + fnf.getMessage();

	    } catch (SQLException e) {
			e.printStackTrace();
		} finally {
	    
	        if (pdfFileBytes != null) {
	        	pdfFileBytes.close();
	        }
	    }
             request.setAttribute("email", email);
              request.setAttribute("poste", poste);
            request.setAttribute("message", message);
            System.out.print(poste);
            System.out.print(email);
            request.getRequestDispatcher( "intranetCan.jsp").forward( request, response );
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
