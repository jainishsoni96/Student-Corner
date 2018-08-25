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
public class SeniornewServ extends HttpServlet {

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
            out.println("<title>Servlet SeniornewServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SeniornewServ at " + request.getContextPath() + "</h1>");
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
        
        try
        {
        ArrayList a1 = null;
       
        ArrayList pid = new ArrayList();
        
        ResultSet rs = Corner.getdata("select * from news");
        
         while(rs.next())
         {
                a1 = new ArrayList();                
                a1.add(rs.getString("nid"));
                a1.add(rs.getString("news_title"));
                a1.add(rs.getString("s_description"));
                a1.add(rs.getString("description"));
                
                
                pid.add(a1);
         }
        RequestDispatcher r= request.getRequestDispatcher("Client/seniornews.jsp");
        request.setAttribute("varname", pid);
        r.forward(request, response);
        }
        catch(Exception ex)
        {
            try (PrintWriter out = response.getWriter()) {
            out.print(ex.getMessage());
        }     
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
            throws ServletException, IOException {
        
        String news = request.getParameter("title");
        String s_desc = request.getParameter("shortdes");
        String l_desc = request.getParameter("longdes");
        
        String query="insert into news(news_title,s_description,description) values('"+news+"','"+s_desc+"','"+l_desc+"')";
        
        if(Corner.insertData(query))
        {
        try
        {
        ArrayList a1 = null;
        ArrayList pid = new ArrayList();
        
        ResultSet rs = Corner.getdata("select * from news");
        
         while(rs.next())
         {
                a1 = new ArrayList();                
                a1.add(rs.getString("nid"));
                a1.add(rs.getString("news_title"));
                a1.add(rs.getString("s_description"));
                a1.add(rs.getString("description"));
                
                
                pid.add(a1);
         }
        RequestDispatcher r= request.getRequestDispatcher("Client/seniornews.jsp");
        request.setAttribute("varname", pid);
        r.forward(request, response);
        }
        catch(Exception ex)
        {
            try (PrintWriter out = response.getWriter())
            {
            out.print(ex.getMessage());
            }     
        }
        
        }
        else
        {
            try (PrintWriter out = response.getWriter())
            {
            
                out.println("News Not Added");
            
            
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
