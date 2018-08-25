
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
 * @author jainish
 */
public class subjServ extends HttpServlet {

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
            out.println("<title>Servlet subjServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet subjServ at " + request.getContextPath() + "</h1>");
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
        
        ResultSet rs = Corner.getdata("select * from subject");
        
       while(rs.next())
         {
                a1 = new ArrayList();                
                a1.add(rs.getString("sid"));
                a1.add(rs.getString("sub_name"));
                
                pid.add(a1);
         }
        RequestDispatcher r= request.getRequestDispatcher("admin/subject.jsp");
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
        
        if(request.getAttribute("subject")!=null)
            {
                doGet(request, response);
            }
            else if(request.getAttribute("editSubj")==null)
            {
        
                String sub = request.getParameter("subj");       
                String query="insert into subject(sub_name) values('"+sub+"')";
        
                if(Corner.insertData(query))
                    {
                        try (PrintWriter out = response.getWriter())
                        {
                            ArrayList a1 = null;
                            ArrayList pid = new ArrayList();
        
                            ResultSet rs = Corner.getdata("select * from subject");
        
                    while(rs.next())
                        {
                            a1 = new ArrayList();                
                            a1.add(rs.getString("sid"));
                            a1.add(rs.getString("sub_name"));                
                            pid.add(a1);
                        }
                    RequestDispatcher r= request.getRequestDispatcher("admin/subject.jsp");
                    request.setAttribute("varname", pid);
                    r.forward(request, response);
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
            
                out.println("Subject Not Added");
            
            
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
