/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Corner.Corner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
 * @author Kunj Tandel
 */
@MultipartConfig

public class EditEvent extends HttpServlet {

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
            out.println("<title>Servlet EditEvent</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditEvent at " + request.getContextPath() + "</h1>");
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
        
        try(PrintWriter out = response.getWriter())
        {
            
            ArrayList a = null;
            
            ArrayList pid = new ArrayList();
        
            ResultSet rs = Corner.getdata("select * from event where eid="+m);
            
            while(rs.next())
            {
                a = new ArrayList();                
                a.add(rs.getString("eid"));
                a.add(rs.getString("e_name"));
                a.add(rs.getString("description"));
                a.add(rs.getString("e_date"));
                a.add(rs.getString("venue"));
                
 
                Blob test=rs.getBlob("e_path");     //this will take a_path and will convert it into Blob
               
                int blobLength = (int) test.length(); //this will convert length of blob into integer
                byte[] blobAsBytes = test.getBytes(1, blobLength);  //this will convert int bloblength to byte array
                String encode = Base64.getEncoder().encodeToString(blobAsBytes);    //this will encode byteArray in base64
                a.add(encode);           //this will add a_path in encoded form to a1
                
                pid.add(a);
            }
            RequestDispatcher r= request.getRequestDispatcher("admin/editevent.jsp");
            request.setAttribute("eventdetail", pid);
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
        String  q="";
            String eid = request.getParameter("eid");
            String ename = request.getParameter("ename");
            String des = request.getParameter("des");
            String edate = request.getParameter("edate");
            String venue = request.getParameter("venue");
        
        
        Part filePart = request.getPart("efile");
        String fileName = Corner.getFileName(filePart);       
        
            if(fileName.equals(""))
            {
               if (Corner.updateBlobE(eid, ename, des, edate, venue))
               {
                   try(PrintWriter out = response.getWriter())
                   {
                    //   out.print("goes to update blob");
                    RequestDispatcher r= request.getRequestDispatcher("eventServ");
                    request.setAttribute("editevent", r);
                    r.forward(request, response);
                    }
                   catch(Exception e)
                   {
                     e.printStackTrace();
                   }
               }
           
            }
            else
            {          
               
                 InputStream is = new FileInputStream(new File(fileName));
 //                PrintWriter out = response.getWriter();
   //              out.print("goes to update Album Blob"+eid+"  "+ename+"  "+des+"  "+edate+"  "+venue+"  "+fileName+"  ");
                 if(Corner.updateAlbumBlobE1(eid, ename, des, edate, venue, is))
                 {
                     try(PrintWriter out = response.getWriter())
                     {
                    //     out.print("goes to update Album Blob");
                        RequestDispatcher r= request.getRequestDispatcher("eventServ");
                        request.setAttribute("editevent", r);
                        r.forward(request, response);

                     }
                     catch(Exception e)
                     {
                         e.printStackTrace();
                     }
                 }   
            }
            
         /*try(PrintWriter out = response.getWriter())
         {
             out.print(q);
         }*/
        
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
