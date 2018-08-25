/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Corner.Corner;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kunj Tandel
 */
@WebServlet(urlPatterns = {"/signupServ"})
public class signupServ extends HttpServlet {

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
            out.println("<title>Servlet signupServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signupServ at " + request.getContextPath() + "</h1>");
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
            throws ServletException, IOException 
    {
        try
        {
        ArrayList a2 = null;
        ArrayList pid = new ArrayList();
        
        ResultSet rs = Corner.getdata("select s.id,s.EnrolmentNo,s.Email,s.Birthdate,s.Gender,s.role,d.Dept_name from student s,department d where d.Did=s.Did and s.status=0");
        
         while(rs.next())
         {
             
                a2 = new ArrayList();      
                
                a2.add(rs.getString("EnrolmentNo"));
                a2.add(rs.getString("Email"));
                
                a2.add(rs.getString("Birthdate"));
                
                a2.add(rs.getString("Gender"));
                a2.add(rs.getString("role"));
                a2.add(rs.getString("Dept_name"));
                a2.add(rs.getString("id"));
                
                pid.add(a2);
             
         }
        
        RequestDispatcher r= request.getRequestDispatcher("admin/Student.jsp");
        request.setAttribute("varname", pid);
        r.forward(request, response);
        }
        catch(Exception ex)
        {
               PrintWriter out = response.getWriter();
               
               out.print(ex.getMessage());
                    
        }
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
            throws ServletException, IOException 
    {
        String fname = request.getParameter("fname");
        String sname = request.getParameter("sname");
        String user = request.getParameter("en_no");
        String email = request.getParameter("email");
        String pass = request.getParameter("pwd");
        String b_date = request.getParameter("bdate");
        String dept = request.getParameter("department");
        String gender = request.getParameter("gender");
        String role = request.getParameter("role");
        
        String query="insert into student(fname,sname,EnrolmentNo,Email,Password,Birthdate,Did,Gender,role,pic_path,address,status)values('"+fname+"','"+sname+"','"+user+"','"+email+"','"+pass+"','"+b_date+"',"+dept+",'"+gender+"','"+role+"','','',0)";
        
        if(Corner.insertData(query))
        {
            try (PrintWriter out = response.getWriter())
            {
                HttpSession sessionPage = request.getSession();
                 
                sessionPage.setAttribute("pageCall","register");
                
                response.sendRedirect("Client/StudentCorner.jsp");
                
                /*RequestDispatcher r= request.getRequestDispatcher("Client/StudentCorner.jsp");
                request.setAttribute("regsucc","Registration Successfully");
                r.forward(request, response);*/

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        
        }
        else
        {
            try (PrintWriter out = response.getWriter())
            {
            
            out.println("signup not done.");
            
            
            }
            catch(Exception e)
            {
                e.printStackTrace();
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
