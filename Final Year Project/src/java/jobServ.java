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
@WebServlet(urlPatterns = {"/jobServ"})
public class jobServ extends HttpServlet {

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
            out.println("<title>Servlet jobServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet jobServ at " + request.getContextPath() + "</h1>");
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
        
        ResultSet rs = Corner.getdata("select * from jobs");
        
         while(rs.next())
         {
                        a2 = new ArrayList();   
                        a2.add(rs.getString(1));
                        a2.add(rs.getString(2));
                        a2.add(rs.getString(3));
                        a2.add(rs.getString(4));
                        a2.add(rs.getString(5));
                        a2.add(rs.getString(6));
                        a2.add(rs.getString(7));
                        a2.add(rs.getString(8));    
                        pid.add(a2);
                             
         }
        
        RequestDispatcher r= request.getRequestDispatcher("admin/Jobs.jsp");
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
       
         String j_title = request.getParameter("j_title");
        String cmp_name = request.getParameter("cmp_name");
        
        String int_date = request.getParameter("int_date");
        
        String j_skill = request.getParameter("j_skill");
        
        String expr = request.getParameter("expr");
        String posted_by = request.getParameter("posted_by");
        String url = request.getParameter("url");
        String query="insert into jobs(job_title,company_name,interview_date,job_skills,experience,posted_by,url) values('"+j_title+"','"+cmp_name+"','"+int_date+"','"+j_skill+"','"+expr+"','"+posted_by+"','"+url+"')";
        
        if(Corner.insertData(query))
        {
            try
            { 
                ArrayList a1 = null;
                ArrayList pid = new ArrayList();

                ResultSet rs = Corner.getdata("select * from jobs");

                 while(rs.next())
                 {
                        a1 = new ArrayList();
                        a1.add(rs.getString(1));
                        a1.add(rs.getString(2));
                        a1.add(rs.getString(3));
                        a1.add(rs.getString(4));
                        a1.add(rs.getString(5));
                        a1.add(rs.getString(6));
                        a1.add(rs.getString(7));
                        a1.add(rs.getString(8));
                            
                        pid.add(a1);
                 }
                RequestDispatcher r= request.getRequestDispatcher("admin/Jobs.jsp");
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
            
                out.println("Job Not Added");
            
            
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
