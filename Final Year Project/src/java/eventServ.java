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
public class eventServ extends HttpServlet {

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
        
            ResultSet rs = Corner.getdata("select * from event");   //To display data from table album
        
            while(rs.next())
            {
                a1 = new ArrayList();                
                a1.add(rs.getString("eid"));    //this will add aid to a1
                a1.add(rs.getString("e_name"));  //this will add aname to a1
                a1.add(rs.getString("description"));  //this will add ayear to a1
                a1.add(rs.getString("e_date"));
                a1.add(rs.getString("venue"));
                Blob test=rs.getBlob("e_path");     //this will take a_path and will convert it into Blob        
                int blobLength = (int) test.length(); //this will convert length of blob into integer
                byte[] blobAsBytes = test.getBytes(1, blobLength);  //this will convert int bloblength to byte array
                String encode = Base64.getEncoder().encodeToString(blobAsBytes);    //this will encode byteArray in base64
                a1.add(encode);           //this will add a_path in encoded form to a1
                
                pid.add(a1);        //this will add a1 to pid
            }
            RequestDispatcher r= request.getRequestDispatcher("admin/event.jsp");
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
        
            if(request.getAttribute("editevent")!=null) //if editAlbum is not null then this will go to doGet method for displaying data of album
            {
                
               doGet(request, response);
            }
            else if(request.getAttribute("editevent")==null)    //if editAlbum is null then this will take input from user for updating and adding data to album
            {
            
            
            String ename = request.getParameter("ename");
            String des = request.getParameter("des");
            String edate = request.getParameter("edate");
            String venue = request.getParameter("venue");
            
            Part filePart = request.getPart("efile");
            String fileName = Corner.getFileName(filePart);       
            
            
            InputStream is = new FileInputStream(new File(fileName));
               
               
                     
                //out.print("Goes to try"+m1+" and "+m2+"and "+fileName);
            
                //if(Corner.insertBlob(m1,m2,is))
                if(Corner.insertBlobE(ename,des,edate,venue,is))
                {
                    try
                    {
                        ArrayList a1 = null;
                        ArrayList pid = new ArrayList();
                        ResultSet rs = Corner.getdata("select * from event");
                        
                            while(rs.next())
                               {
                                a1 = new ArrayList();                
                                a1.add(rs.getString("eid"));
                                a1.add(rs.getString("e_name"));
                                a1.add(rs.getString("description"));
                                a1.add(rs.getString("e_date"));
                                a1.add(rs.getString("venue"));
                
                                Blob test=rs.getBlob("e_path"); 
               
                                int blobLength = (int) test.length(); 
                                byte[] blobAsBytes = test.getBytes(1, blobLength); 
                                String encode = Base64.getEncoder().encodeToString(blobAsBytes);
                                a1.add(encode);           
                
                                pid.add(a1);
                            }
                            RequestDispatcher r= request.getRequestDispatcher("admin/event.jsp");
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
                        out.println("Event not added");
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

