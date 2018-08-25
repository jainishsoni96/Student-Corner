/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Corner.Corner;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import javax.servlet.RequestDispatcher;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


/**
 *
 * @author Kunj Tandel
 */
public class activeStu extends HttpServlet {

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
            out.println("<title>Servlet activeStu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet activeStu at " + request.getContextPath() + "</h1>");
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
          
        String id = request.getParameter("id");
        try (PrintWriter out = response.getWriter()) {
        
            //out.print("The id is : "+id);
            
            String q = "update student set status=1 where id="+id;
            if(Corner.activeData(q))
            {
                
        //        String to = "abcd@gmail.com";
 
      // Sender's email ID needs to be mentioned
      //String from = "web@gmail.com";
 
      // Assuming you are sending email from localhost
      //String host = "localhost";
 
      // Get system properties
      //Properties properties = System.getProperties();
 
      // Setup mail server
      //properties.setProperty("mail.smtp.host", host);
 
      // Get the default Session object.
      //Session session = Session.getDefaultInstance(properties);
      
	  // Set response content type
      //response.setContentType("text/html");

                
                
                 try
                {
            
            
            // Create a default MimeMessage object.
         //MimeMessage message = new MimeMessage(session);
         // Set From: header field of the header.
         //message.setFrom(new InternetAddress(from));
         // Set To: header field of the header.
         //message.addRecipient(Message.RecipientType.TO,
           //                       new InternetAddress(to));
         // Set Subject: header field
         //message.setSubject("This is the Subject Line!");
         // Now set the actual message
         //message.setText("This is actual message");
         // Send message
         //Transport.send(message);

            
            
        ArrayList a2 = null;
        ArrayList pid = new ArrayList();
        
        ResultSet rs = Corner.getdata("select s.id,s.EnrolmentNo,s.Email,s.Birthdate,s.Gender,s.role,d.Dept_name from student s,department d where d.Did=s.Did and s.status=0");
        
         while(rs.next())
         {
             
                a2 = new ArrayList();      
                
                a2.add(rs.getString("EnrolmentNo"));
                a2.add(rs.getString("Email"));
                
                a2.add(rs.getString("Birthdate"));
                
                a2.add(rs.getString("Gender"));
                a2.add(rs.getString("role"));
                a2.add(rs.getString("Dept_name"));
                a2.add(rs.getString("id"));
                
                pid.add(a2);
             
         }
        
        RequestDispatcher r= request.getRequestDispatcher("admin/Student.jsp");
        request.setAttribute("varname", pid);
        r.forward(request, response);
        }
        catch(Exception ex)
        {
                    
        }
            }
            
        }
        //processRequest(request, response);
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

        processRequest(request, response);
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
