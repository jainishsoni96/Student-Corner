/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import Corner.Corner;
import static java.lang.System.out;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.MultipartConfig;
/**
 *
 * @author jainish
 */
@MultipartConfig
public class showAlbam extends HttpServlet {

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
            out.println("<title>Servlet albumServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet albumServ at " + request.getContextPath() + "</h1>");
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
       
        try(PrintWriter out = response.getWriter())
            {
               
              ArrayList a1 = null;  //a null value is passed to arraylist a1
              ArrayList pid = new ArrayList();  //pid is initialized as new arraylist
        
            ResultSet rs = Corner.getdata("select * from album");   //To display data from table album
        
            while(rs.next())
            {
                a1 = new ArrayList();                
                a1.add(rs.getString("aid"));    //this will add aid to a1
                a1.add(rs.getString("aname"));  //this will add aname to a1
                a1.add(rs.getString("ayear"));  //this will add ayear to a1
                
                Blob test=rs.getBlob("a_path");     //this will take a_path and will convert it into Blob
               
                int blobLength = (int) test.length(); //this will convert length of blob into integer
                byte[] blobAsBytes = test.getBytes(1, blobLength);  //this will convert int bloblength to byte array
                String encode = Base64.getEncoder().encodeToString(blobAsBytes);    //this will encode byteArray in base64
                a1.add(encode);           //this will add a_path in encoded form to a1
                
                pid.add(a1);        //this will add a1 to pid
            }
            RequestDispatcher r= request.getRequestDispatcher("Client/albumPage.jsp");
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

