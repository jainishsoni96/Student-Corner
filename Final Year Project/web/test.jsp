<%-- 
    Document   : picDownload
    Created on : Mar 29, 2017, 10:11:37 AM
    Author     : Gaurang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" enctype="multipart/form-data" action="picServ">   
            <table>
                <tr>
                    <td colspan="2">
                        <a href="showServ">Show Data</a>
                    </td>
                </tr>
                  
                <tr>
                    <td>Image Name</td>
                    <td>
                        <input type="text" name="t1" size="20"/>
                    </td>
                    
                </tr>
                <tr>
                    <td>Image Pic</td>
                    <td>
                        <input type="file" name="t2" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" name="s1" value="Click"/>
                    </td>
                </tr>
            </table>            
        </form>
    </body>
</html>
