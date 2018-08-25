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
public class EditJobs extends HttpServlet {

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
            out.println("<title>Servlet EditJobs</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditJobs at " + request.getContextPath() + "</h1>");
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
        
        String m = request.getParameter("id");
        
        try(PrintWriter out = response.getWriter())
        {
            
            ArrayList a = null;
            
            ArrayList pid = new ArrayList();
        
            ResultSet rs = Corner.getdata("select * from jobs where jid="+m);
            
            while(rs.next())
            {
                a = new ArrayList();                
                a.add(rs.getString("jid"));
                a.add(rs.getString("job_title"));
                a.add(rs.getString("company_name"));
                a.add(rs.getString("interview_date"));
                a.add(rs.getString("job_skills"));
                a.add(rs.getString("experience"));
                a.add(rs.getString("posted_by"));
                a.add(rs.getString("url"));
                pid.add(a);
            }
            RequestDispatcher r= request.getRequestDispatcher("admin/editjobs.jsp");
            request.setAttribute("jobsdetail", pid);
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
            throws ServletException, IOException {
        
        String id = request.getParameter("jid");
        String jt = request.getParameter("j_title");
        String c_name = request.getParameter("cmp_name");
        String i_date = request.getParameter("int_date");
        String j_skill = request.getParameter("j_skill");
        String exp = request.getParameter("expr");
        String url = request.getParameter("url");
       String q = "update jobs set job_title='"+jt+"',company_name='"+c_name+"',interview_date='"+i_date+"',job_skills='"+j_skill+"',experience='"+exp+"',url='"+url+"' where jid="+id;
       
       if(Corner.updateData(q))
       {
           
           //RequestDispatcher r= request.getRequestDispatcher("admin/Jobs.jsp");
           RequestDispatcher r= request.getRequestDispatcher("jobServ");
           request.setAttribute("editJobs", r);
           r.forward(request, response);
       }
        
       else
       {
           try(PrintWriter out = response.getWriter())
            {
            out.print("else called");
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
