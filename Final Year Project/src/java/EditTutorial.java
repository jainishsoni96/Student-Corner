/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Corner.Corner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author jainish
 */
@MultipartConfig
public class EditTutorial extends HttpServlet {

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
            out.println("<title>Servlet EditGallery</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditGallery at " + request.getContextPath() + "</h1>");
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
        
            ResultSet rs = Corner.getdata("select * from tutorial where tid="+m);
            
            while(rs.next())
            {
                a = new ArrayList();                
                a.add(rs.getString("tid"));
                a.add(rs.getString("sid"));
                a.add(rs.getString("tut_title"));
                a.add(rs.getString("tut_path"));
                
                
                pid.add(a);
            }
            RequestDispatcher r= request.getRequestDispatcher("admin/edittutorial.jsp");
            request.setAttribute("tutorialdetail", pid);
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
        
       
        
        String id = request.getParameter("id");
        String sub = request.getParameter("subject");
        String tt = request.getParameter("tut_title");
        String file_path = request.getParameter("fpath");
        
          Part filePart = request.getPart("fpath");
            String fileName = Corner.getFileName(filePart);
            String m = "";
             m = fileName.substring(fileName.lastIndexOf("\\")+1);        
            InputStream inStream = null;
            OutputStream outStream = null;
    	    File afile =new File(fileName);
    	    File bfile =new File("G:\\Study\\Project\\Coding\\Practice\\DemoProject\\Tutorial\\"+m);

    	    inStream = new FileInputStream(fileName);
    	    outStream = new FileOutputStream(bfile);

    	    byte[] buffer = new byte[1024];

    	    int length;
    	    //copy the file content in bytes
    	    while ((length = inStream.read(buffer)) > 0){

    	    	outStream.write(buffer, 0, length);

    	    }

    	    inStream.close();
    	    outStream.close();
        
        String query = "update tutorial set sid='"+sub+"',tut_title='"+tt+"',tut_path='"+m+"' where tid="+id;     
        
            try
            {
               if (Corner.updateData(query))
               {
                   
                    RequestDispatcher r= request.getRequestDispatcher("tutServ");
                    request.setAttribute("editTutorial", r);
                    r.forward(request, response);
                    
                   
               }
               else
               {
                   try(PrintWriter out = response.getWriter())
                   {
                       out.println("Tutorial could not be updated");
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
