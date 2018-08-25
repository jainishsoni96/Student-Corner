/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Corner.Corner;
import static Corner.Corner.getFileName;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig

/**
 *
 * @author Kunj Tandel
 */
public class EditProject extends HttpServlet {

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
            out.println("<title>Servlet EditProject</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditProject at " + request.getContextPath() + "</h1>");
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
        
            ResultSet rs = Corner.getdata("select * from project where pid="+m);
            
            while(rs.next())
            {
                a = new ArrayList();                
                a.add(rs.getString(1));
                a.add(rs.getString(2)); 
                a.add(rs.getString(3));
                a.add(rs.getString(4));
                a.add(rs.getString(5));
                a.add(rs.getString(6));
                pid.add(a);
            }
            
            RequestDispatcher r= request.getRequestDispatcher("admin/editproject.jsp");
            request.setAttribute("projectdetail", pid);
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
        String id=request.getParameter("j_id");
        String cid = request.getParameter("cat_name");
        String Did = request.getParameter("department");
        String title = request.getParameter("p_title");
        String desc = request.getParameter("p_desc");
        String file_path = request.getParameter("u_file");
        
        Part filePart = request.getPart("u_file");
        String fileName = getFileName(filePart);
        String m = "";
        
            //out.print("File Name is : "+fileName);
            
             m = fileName.substring(fileName.lastIndexOf("\\")+1);
            
            //out.print("<br/>The Original Name is "+m);
            
            
        
        
        
        InputStream inStream = null;
	OutputStream outStream = null;

    	

    	    File afile =new File(fileName);
    	    File bfile =new File("G:\\Study\\Project\\Coding\\Practice\\DemoProject\\Project\\"+m);

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

    	    //delete the original file
    	    //afile.delete();

        
        String q = "update project set cid='"+cid+"',Did='"+Did+"',pro_title='"+title+"',pro_decription='"+desc+"',pro_file_path='"+m+"' where pid="+id;
        
        try
       {
       if(Corner.updateData(q))
       {
           RequestDispatcher r = request.getRequestDispatcher("projectServ");
           request.setAttribute("project", r);
           r.forward(request, response);
       }
       else
       {
           try(PrintWriter out = response.getWriter())
           {
               out.println("Project could not be updated");
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
