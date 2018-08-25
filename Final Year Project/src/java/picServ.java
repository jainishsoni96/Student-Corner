/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Gaurang
 */
import java.sql.*;

@MultipartConfig
public class picServ extends HttpServlet {

    String name;
    
    public static Connection con;
    public static Statement st;

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
            out.println("<title>Servlet picServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet picServ at " + request.getContextPath() + "</h1>");
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
        
        String m1 = request.getParameter("t1");
        Part filePart = request.getPart("t2");
        String fileName = getFileName(filePart);
        
        try (PrintWriter out = response.getWriter()) {
          
           InputStream is = new FileInputStream(new File(fileName));
            
            out.println("The value is "+m1);
            out.println("The FileName is "+fileName);
    
            /*try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_studentcorner", "root", "");
             
                String q="insert into test_gallery(gname,gpath)values(?,?)";
                
                PreparedStatement stmt=con.prepareStatement(q);
                
                stmt.setString(1,m1);
                stmt.setBlob(2,is);
                
                int i=stmt.executeUpdate();  

                if(i>0)
                {
                    out.println("Record Added");
                            
                }
            }
            catch(Exception ex)
            {
              //ex.printStackTrace();
              out.println(ex.toString());
            }*/
         }
       }
        
        //processRequest(request, response);
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public String getFileName(final Part part)
    {
        //final String partHeader = part.getHeader("content-disposition");
        /*for(String content : part.getHeader("content-disposition").split(";")){
            if(content.trim().startsWith("filename"))
            {
                //return content.substring(content.indexOf('=')+1).trim().replace("\"","");
                
            }
        }
        return null;*/
        String j = part.toString();
        return j;
    }
    
}
