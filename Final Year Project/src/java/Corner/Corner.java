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

public class Corner 
{
    
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
     
     // start active student
     public static boolean activeData(String q)
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

      public static boolean updateBlob1(String x,String y, String id)
     {
         try
         {
             connection();
             String query = "update gallery set aid='"+x+"',pic_name='"+y+"' where id="+id;
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
     
    // end active student 
     
    
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
     
     public static boolean insertBlob1(int x,String y,InputStream is)
     {
         //String m = "";
         try
         {
             connection();
             String query = "insert into gallery(aid,pic_name,pic_path)values(?,?,?)";
             PreparedStatement stmt = con.prepareStatement(query);
             stmt.setInt(1, x);
             stmt.setString(2,y);
             stmt.setBlob(3,is);
             int i = stmt.executeUpdate();
             if(i>0)
             {
                 return true;
             }
         }
         catch(Exception ex)
         {
             //m = ex.toString();
             ex.printStackTrace();
         }
         //return m;
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
     
     public static boolean insertBlobE(String m1,String m2,String m3,String m4, InputStream is)
     {
         try
         {
             connection();
             
             String query = "insert into event(e_name,description,e_date,e_path,venue)values(?,?,?,?,?)";
             PreparedStatement stmt = con.prepareStatement(query);
             stmt.setString(1,m1);
             stmt.setString(2,m2);
             stmt.setString(3,m3);
             stmt.setBlob(4,is);
             stmt.setString(5, m4);

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
     
     public static boolean updateGalleryBlob(String x,String y,InputStream is,String id)
     {
         try
         {
             connection();
             
             String query = "update gallery set aid=?,pic_name=?,pic_path=? where id="+id;
             PreparedStatement stmt = con.prepareStatement(query);
             stmt.setString(1, x);
             stmt.setString(2,y);
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
     public static boolean updateBlobE(String eid,String ename,String des,String edate,String venue)
     {
         try
         {
             connection();
             String query = "update event set e_name='"+ename+"',description='"+des+"',e_date='"+edate+"',venue='"+venue+"' where eid="+eid;
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
     
     public static boolean updateAlbumBlobE1(String eid,String ename,String des,String edate,String venue, InputStream is)
     {
         try
         {
             connection();
             
             String query = "update event set e_name=?,description=?,e_date=?,e_path=?,venue=? where eid="+eid;
             PreparedStatement stmt = con.prepareStatement(query);
             stmt.setString(1,ename);
             stmt.setString(2,des);
             stmt.setString(3, edate);
             stmt.setBlob(4,is);
             stmt.setString(5, venue);

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
