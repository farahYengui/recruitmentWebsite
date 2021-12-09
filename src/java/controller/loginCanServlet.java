/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RYZEN7
 */
public class loginCanServlet extends HttpServlet {

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
            out.println("<title>Servlet loginCanServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginCanServlet at " + request.getContextPath() + "</h1>");
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
        HttpSession session=request.getSession();
        try
{
	Class.forName("com.mysql.jdbc.Driver"); //load driver
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db?useUnicode=true &useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC","root",""); //create connection
	{
		
		
		
                String name = request.getParameter("name"); 
                String email = request.getParameter("email"); 
                String password = request.getParameter("password");
                
		
		PreparedStatement pstmt=null; //create statement
		
		pstmt=con.prepareStatement("select * from candidat where email=? "); //sql select query 
		pstmt.setString(1,email);
	
		
		ResultSet rs=pstmt.executeQuery(); //execute query and store in resultset object rs.
		out.print("0");
		while(rs.next())
		{
                    out.print("00");
		String	namedb =rs.getString("name");
                  String      emaildb=rs.getString("email");
		String	passworddb=rs.getString("password");
                        	out.print("1");
			if(password.equals(passworddb))
			{
				out.print("2");
                                session.setAttribute("name" ,name );
                                session.setAttribute("email" , email);
                                session.setAttribute("password" , passworddb);
                             //   response.sendRedirect("intranetCan.jsp");
				 // request.getRequestDispatcher( "intranetCan.jsp").forward( request, response );
			}
		}
                request.getRequestDispatcher( "intranetCan.jsp").forward( request, response );
		/*else
		{
                    out.print("3");
			request.setAttribute("errorMsg","invalid email or password"); //invalid error message for email or password wrong
		}
		out.print("4");*/
		con.close(); //close connection	
	}
	
}
catch(Exception e)
{
	out.println(e);
}
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
