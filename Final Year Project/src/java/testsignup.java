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

/**
 *
 * @author Kunj Tandel
 */
@WebServlet(urlPatterns = {"/testsignup"})
public class testsignup extends HttpServlet {

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
            out.println("<title>Servlet testsignup</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet testsignup at " + request.getContextPath() + "</h1>");
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
        
        ResultSet rs = Corner.getdata("select s.EnrolmentNo,s.Email,s.Birthdate,s.Gender,s.role,d.Dept_name from student s,department d where d.Did=s.Did");
        
         while(rs.next())
         {
             
                a2 = new ArrayList();                
                a2.add(rs.getString("EnrolmentNo"));
                a2.add(rs.getString("Email"));
                
                a2.add(rs.getString("Birthdate"));
                
                a2.add(rs.getString("Gender"));
                a2.add(rs.getString("role"));
                a2.add(rs.getString("Dept_name"));
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
        String user = request.getParameter("uname");
        String email = request.getParameter("email");
        String pass = request.getParameter("pwd");
        String b_date = request.getParameter("bdate");
        String dept = request.getParameter("department");
        String gender = request.getParameter("gender");
        String role = request.getParameter("role");
        try
        {
            ResultSet rs = Corner.getdata("select * from student");
        
        while(rs.next())
        {  
        if(user.equalsIgnoreCase(rs.getString("EnrolmentNo")))
        {
            PrintWriter out=response.getWriter();
            out.println("You r in if");
            /*
        String query="insert into student(fname,sname,EnrolmentNo,Email,Password,Birthdate,Did,Gender,role,pic_path,address,status)values('"+fname+"','"+sname+"','"+user+"','"+email+"','"+pass+"','"+b_date+"',"+dept+",'"+gender+"','"+role+"','','',0)";
        
        if(Corner.insertData(query))
        {
            try (PrintWriter out = response.getWriter())
            {
            
            out.println("signup successfully!!!");
            
            
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
        
        }*/
        }
        else
        {
            PrintWriter out=response.getWriter();
            out.println("You r in else");
        }
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
