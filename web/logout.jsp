<%-- 
    Document   : logout
    Created on : Apr 23, 2018, 12:21:13 PM
    Author     : Filipus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.setAttribute("userid", null);
            session.invalidate();
            response.sendRedirect("home.jsp");
        %>
    </body>
</html>
