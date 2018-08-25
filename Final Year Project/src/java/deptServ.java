/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Corner.Corner;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jainish
 */
public class deptServ extends HttpServlet {

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
            out.println("<title>Servlet deptServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet deptServ at " + request.getContextPath() + "</h1>");
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
            
            ResultSet rs = Corner.getdata("select * from department");
            
            
            while(rs.next())
            {
                a1 = new ArrayList();                
                a1.add(rs.getString("Did"));
                a1.add(rs.getString("Dept_name"));
                
                
                pid.add(a1);
            }
            RequestDispatcher r= request.getRequestDispatcher("admin/department.jsp");
            request.setAttribute("varname", pid);
            r.forward(request, response);
        }
        catch(Exception e)
        {
            try(PrintWriter out = response.getWriter())
            {
                out.print(e.getMessage());
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
        
        if(request.getAttribute("news")!=null)
            {
                doGet(request, response);
            }
            else if(request.getAttribute("editDept")==null)
            {
                String dept = request.getParameter("dept");
        
                String query = "insert into department(Dept_name) values('"+dept+"')";
        
                if(Corner.insertData(query))
                    {
                        try
                            {
            
                            ArrayList a1 = null;
                            ArrayList pid = new ArrayList();
            
                            ResultSet rs=Corner.getdata("select * from department");
            
            
                            while(rs.next())
                                {
                                    a1 = new ArrayList();                
                                    a1.add(rs.getString("Did"));
                                    a1.add(rs.getString("Dept_name"));
                                    pid.add(a1);
                                }
                            RequestDispatcher r= request.getRequestDispatcher("admin/department.jsp");
                            request.setAttribute("varname", pid);
                            r.forward(request, response);
                            }
                        catch(Exception e)
                            {
                                try(PrintWriter out = response.getWriter())
                                    {
                                        out.print(e.getMessage());
                                    }
                            }
            
                        }
                        else
                            {
                                try(PrintWriter out = response.getWriter())
                                    {
                                        out.println("Department not added");
                                    }
                                catch(Exception e)
                                    {
                                        e.printStackTrace();
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
