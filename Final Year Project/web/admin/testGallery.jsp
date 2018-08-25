<%-- 
    Document   : testGallery
    Created on : 10 May, 2017, 3:15:48 PM
    Author     : Kunj Tandel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    <form role="form" enctype="multipart/form-data" action="../../DemoProject/galleryServ" method="post">
            <input type="text" name="m1" size="20"/>
            <input type="file" name="m2" />
            <input type="submit" name="sub" value="Click"/>
            
        </form>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
