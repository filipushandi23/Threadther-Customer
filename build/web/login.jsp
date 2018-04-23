<%-- 
    Document   : login
    Created on : Apr 19, 2018, 12:35:57 AM
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
        <h1>Login</h1>
        <form action="loginServlet" method="post">
            <table>
                <tr><td>Email</td><td><input type="text" name="email" required></td></tr>
                <tr><td>Password</td><td><input type="password" name="password" required></td></tr>
                <tr><td colspan="2"><input type="submit" value="Login"></td></tr>
            </table>
        </form>
    </body>
</html>
