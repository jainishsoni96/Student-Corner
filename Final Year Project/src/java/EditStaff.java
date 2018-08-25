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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kunj Tandel
 */
public class EditStaff extends HttpServlet {

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
            out.println("<title>Servlet EditCat</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditCat at " + request.getContextPath() + "</h1>");
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
        String m = request.getParameter("id");
        
        try
        {
          
            ArrayList a = null;
            
            ArrayList pid = new ArrayList();
        
            ResultSet rs = Corner.getdata("select * from faculty where id="+m);
            
            while(rs.next())
            {
                a = new ArrayList();                
                a.add(rs.getString(1));
                a.add(rs.getString(2)); 
                a.add(rs.getString(3));
                a.add(rs.getString(4));
                a.add(rs.getString(5));
                a.add(rs.getString(6));
                a.add(rs.getString(7));
                a.add(rs.getString(8));
                a.add(rs.getString(9));
                pid.add(a);
            }
            
            RequestDispatcher r= request.getRequestDispatcher("admin/editstaff.jsp");
            request.setAttribute("staffdetail", pid);
            r.forward(request, response);
     
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
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
        String id = request.getParameter("j_id");
        String fac_id = request.getParameter("fac_id");
        String fac_name = request.getParameter("fac_name");
        String department = request.getParameter("department");
        
        String email = request.getParameter("email");
        
        String contact_no = request.getParameter("contact_no");
        String exper = request.getParameter("expr");   
        String username = request.getParameter("uname");
        String pass = request.getParameter("password");
        
       
       String q = "update faculty set fid="+fac_id+",did="+department+",fac_name='"+fac_name+"',email='"+email+"',contactno='"+contact_no+"',experience='"+exper+"',username='"+username+"',password='"+pass+"' where id="+id;
       
       
       try
       {
       if(Corner.updateData(q))
       {
           RequestDispatcher r = request.getRequestDispatcher("staffServ");
           request.setAttribute("editStaff", r);
           r.forward(request, response);
       }
       else
       {
           try(PrintWriter out = response.getWriter())
           {
               out.println("Staff could not be updated");
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
