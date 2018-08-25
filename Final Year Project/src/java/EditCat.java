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
public class EditCat extends HttpServlet {

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
        
            ResultSet rs = Corner.getdata("select * from category where cid="+m);
            
            while(rs.next())
            {
                a = new ArrayList();                
                a.add(rs.getString(1));
                a.add(rs.getString(2)); 
                a.add(rs.getString(3));
                
                pid.add(a);
            }
            
            RequestDispatcher r= request.getRequestDispatcher("admin/editcat.jsp");
            request.setAttribute("catdetail", pid);
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
        String cat = request.getParameter("tech");
        String dn = request.getParameter("department");
        
       
       String q = "update category set Did='"+dn+"',cat_name='"+cat+"' where cid="+id;
       
       
       try
       {
       if(Corner.updateData(q))
       {
           RequestDispatcher r = request.getRequestDispatcher("categoryServ");
           request.setAttribute("cat", r);
           r.forward(request, response);
       }
       else
       {
           try(PrintWriter out = response.getWriter())
           {
               out.println("Category could not be updated");
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
