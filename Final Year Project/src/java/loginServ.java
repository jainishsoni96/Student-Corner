/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Corner.Corner;
import java.awt.Cursor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kunj Tandal
 */
public class loginServ extends HttpServlet {

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
            out.println("<title>Servlet loginServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServ at " + request.getContextPath() + "</h1>");
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
        String query;
        int flag = 0;
        String user = request.getParameter("uname");
        
        String pass = request.getParameter("pwd");
        
        query = "select * from student where EnrolmentNo='"+user+"' and Password='"+pass+"' and role='admin' and status=1";
        
        if(flag == 1)
        {
            response.sendRedirect("Client/StudentCorner.jsp");
            flag = 0;
        }
        
        if(Corner.getLogin(query))
        {
            HttpSession session = request.getSession();
            session.setAttribute("admin", user);
            response.sendRedirect("admin/inner.jsp");
            
        }
        else
        {
            query = "select * from student where EnrolmentNo='"+user+"' and Password='"+pass+"' and role='senior' and status=1";
            if(Corner.getLogin(query))
            {
                //response.sendRedirect("Client/SeniorLogin.jsp");  
                ResultSet c = Corner.getdata("select * from student where EnrolmentNo='"+user+"' and Password='"+pass+"' and role='senior' and status=1");
                try
                {
                    String name = "";
                    while(c.next())
                    {
                         name = c.getString(5);
                    }        
                HttpSession session1 = request.getSession();
                session1.setAttribute("s_student", user);
                session1.setAttribute("s_email", name);
                
                response.sendRedirect("Client/SeniorLogin.jsp");  
                }
                catch(Exception ex)
                {
                    try (PrintWriter out = response.getWriter()) {
                        out.print(ex.toString());
                    }
                }
            }   
            else
            {
              query = "select * from student where EnrolmentNo='"+user+"' and Password='"+pass+"' and role='junior' and status=1";
              if(Corner.getLogin(query))
              {
                HttpSession session2 = request.getSession();
                session2.setAttribute("j_student", user);
                response.sendRedirect("Client/JuniorLogin.jsp");            
              }
              else
              {
                  //String msg = "Invalid User or Pwd";                  
                  
                  /*try (PrintWriter out = response.getWriter()) {
                      
                    response.setContentType("text/html");  
                    out.println("<script type=\"text/javascript\">");  
                    out.println("alert('invalid user or pwd');");               
                    out.println("</script>");
                      
                  }*/
                  
                  
                  /*RequestDispatcher rd = request.getRequestDispatcher("Client/StudentCorner.jsp");
        
                  request.setAttribute("error", msg);
                  request.setAttribute("kunj","data0/images/aavishkar4.jpg");
                  
                  rd.forward(request, response);                  */
                  
                 HttpSession sessionPage = request.getSession();
                 
                 sessionPage.setAttribute("pageCall","hello");
                
                  
                 response.sendRedirect("Client/StudentCorner.jsp");
              }
            }
          
        }
        
        
        
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
