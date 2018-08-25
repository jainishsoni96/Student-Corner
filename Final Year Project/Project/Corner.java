/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunj Tandal
 */
package Corner;
import java.io.InputStream;
import java.sql.*;
import javax.servlet.http.Part;

public class Corner {
    
    public static Connection con;
    
    public static Statement st;

     public static void connection()
    {
        
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_studentcorner", "root", "");
        }
        
        catch(Exception ex)
        {
            ex.printStackTrace();
        }           
    }
    
     public static boolean insertData(String q)
     {
         connection();
         try
         {
            st = con.createStatement();
         
            int i = st.executeUpdate(q);
         
            if(i>0)
            {
                 return true;
            }         
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
         return false;
     }
     
     public static boolean getLogin(String q)
     {
         try
         {
             connection();
             st = con.createStatement();
             ResultSet rs = st.executeQuery(q);
             
             int count = 0;
             while(rs.next())
             {
                 count++;
             }
             if(count>0)
             {
                 return true;
             }
         }
         catch(Exception ex)
         {
             
         }
         
         return false;
     }

    public static ResultSet getdata(String q) {
        
        ResultSet rs=null;
        try
        {
            connection();
            
            st = con.createStatement();
            
            rs = st.executeQuery(q);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        return rs;
    }
    
    public static boolean updateData(String q)
    {
        try
         {
             connection();
             st = con.createStatement();
             int i = st.executeUpdate(q);
             if(i>0)
             {
                 return  true;
             }
             
             
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
    return false;
    }
     
     public static boolean delData(String q)
     {
         
         try
         {
             connection();
             st = con.createStatement();
             int i = st.executeUpdate(q);
             if(i>0)
             {
                 return  true;
             }
             
             
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
         
         return false;
     }
     public static boolean updateAlbumBlob(String m1,String m2, InputStream is,String id)
     {
         try
         {
             connection();
             
             String query = "update album set aname=?,ayear=?,a_path=? where aid="+id;
             PreparedStatement stmt = con.prepareStatement(query);
             stmt.setString(1,m1);
             stmt.setString(2,m2);
             stmt.setBlob(3,is);

             int i = stmt.executeUpdate();
             if(i>0)
             {
                 return  true;
             }
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
         
         return false;
     }

     
     
     
     public static boolean insertBlob(String m1,String m2, InputStream is)
     {
         try
         {
             connection();
             
             String query = "insert into album(aname,ayear,a_path)values(?,?,?)";
             PreparedStatement stmt = con.prepareStatement(query);
             stmt.setString(1,m1);
             stmt.setString(2,m2);
             stmt.setBlob(3,is);

             int i = stmt.executeUpdate();
             if(i>0)
             {
                 return  true;
             }
             
             
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
         
         return false;
     }
     
     public static boolean updateBlob(String n, String y,String id)
     {
         try
         {
             connection();
             String query = "update album set aname='"+n+"',ayear='"+y+"' where aid="+id;
             PreparedStatement stmt = con.prepareStatement(query);
             int i = stmt.executeUpdate();
         
         if(i>0)
         {
             return true;
         }
         return false;
         }
     catch(Exception e)
     {
         e.printStackTrace();
     }
     return false;
     }
     /*public static boolean insertBlob1(String n,String y, InputStream is)
     {
         try
         {
             connection();
             
             String query = "insert into gallery(aname,ayear,a_path)values(?,?,?)";
             PreparedStatement stmt = con.prepareStatement(query);
             stmt.setString(2,n);
             stmt.setString(3,y);
             stmt.setBlob(4,is);


             int i = stmt.executeUpdate();
             if(i>0)
             {
                 return  true;
             }
             
             
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
         
         return false;
     }*/
     
     
     
     public static String getFileName(final Part part)
    {
            String v = part.toString();
      
            for(String content: part.getHeader("content-disposition").split(";"))
                {
                    //return content;
                    if(content.trim().startsWith("filename"))
                        {
                            return content.substring(content.indexOf('=')+1).trim().replace("\"", "");
                            //return content.substring(0);
                        }
                }
                return null;
    }
     
}
