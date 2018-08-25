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
import java.io.FileOutputStream;
import java.io.OutputStream;
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
public class tutServ extends HttpServlet {

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
        
                        ResultSet rs = Corner.getdata("select t.tid,s.sub_name,t.tut_title,t.tut_path from subject s,tutorial t where s.sid=t.sid");
                        
                            while(rs.next())
                               {
                                a1 = new ArrayList();                
                                a1.add(rs.getString("tid"));
                                a1.add(rs.getString("sub_name"));
                                a1.add(rs.getString("tut_title"));                             
                                a1.add(rs.getString("tut_path")); 
                   
                                pid.add(a1);
                            }
                            RequestDispatcher r= request.getRequestDispatcher("admin/tutorial.jsp");
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
        try(PrintWriter out = response.getWriter())
        {
        
            if(request.getAttribute("editTutorial")!=null) //if editAlbum is not null then this will go to doGet method for displaying data of album
            {
                
               doGet(request, response);
            }
            else if(request.getAttribute("editTutorial")==null)    //if editAlbum is null then this will take input from user for updating and adding data to album
            {
            
            
            String m1 = request.getParameter("subject");
            String m2 = request.getParameter("t_name");
            Part filePart = request.getPart("t_path");
            
            String fileName = Corner.getFileName(filePart);       
            
                            String m = "";
             
                    m = fileName.substring(fileName.lastIndexOf("\\")+1);
                    InputStream inStream = null;
                    OutputStream outStream = null;
                    
                            File afile = new File(fileName);
                            File bfile = new File("G:\\Study\\Project\\Coding\\Practice\\DemoProject\\Tutorial\\"+m);

                            inStream = new FileInputStream(fileName);
                            outStream = new FileOutputStream(bfile);

                            byte[] buffer = new byte[1024];

                            int length;
                            //copy the file content in bytes
                            while((length = inStream.read(buffer)) > 0)
                            {
                                outStream.write(buffer, 0, length);
                            }

                            inStream.close();
                            outStream.close();
                           
                            
                           String query = "insert into tutorial(sid,tut_title,tut_path) values ("+m1+",'"+m2+"','"+m+"')";
                            
         
            if(Corner.insertData(query))
                {
                    try
                    {
                        ArrayList a1 = null;
                        ArrayList pid = new ArrayList();
                        ResultSet rs = Corner.getdata("select t.tid,s.sub_name,t.tut_title,t.tut_path from subject s,tutorial t where s.sid=t.sid");
                        
                            while(rs.next())
                               {
                                a1 = new ArrayList();                
                                a1.add(rs.getString("tid"));
                                a1.add(rs.getString("sub_name"));
                                a1.add(rs.getString("tut_title"));
                                a1.add(rs.getString("tut_path"));                 
                                pid.add(a1);
                            }
                            RequestDispatcher r= request.getRequestDispatcher("admin/tutorial.jsp");
                            request.setAttribute("varname", pid);
                            
                            r.forward(request, response);
                        } 
                        catch(Exception e)
                            {
                                out.print(e.getMessage());
                     
                            }
                    }
                else
                    {
                        out.println("Tutorial not added");
                    } 
                
            }
            
            }
            catch(Exception ex)
            {
                out.print("Exception : "+ex.toString());
                ex.printStackTrace();
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

