<%-- 
    Document   : userRegister
    Created on : Apr 12, 2018, 4:07:09 PM
    Author     : Filipus
--%>

<%@page import="services.Customer"%>
<%@page import="services.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        boolean loggedin = false;
        if (!(session.getAttribute("userid") == null || session.getAttribute("userid").equals(""))) {
            loggedin = true;
        } else {
            response.sendRedirect("login.jsp");
        }

        services.WSCustomer_Service service = new services.WSCustomer_Service();
        services.WSCustomer port = service.getWSCustomerPort();
        
        String email = session.getAttribute("userid").toString();
        User user = port.getUserByEmail(email);
    %>
    <body>
        <h1>Edit Profile</h1>
        <table>
            <form action="updateServlet" method="post">
                <tr><td>First Name</td><td><input type="text" name="firstName" value="<%out.println(user.getFirstName());%>"></td></tr>
                <tr><td>Last Name</td><td><input type="text" name="lastName" value="<%out.println(user.getLastName());%>"></td></tr>
                <tr><td>Email</td><td><input type="text" name="email" value="<%out.println(user.getEmail());%>"></td></tr>
                <tr><td>Password</td><td><input type="password" name="password" value="<%out.println(user.getPassword());%>"></td></tr>
                <tr><td>Confirm Password</td><td><input type="password" name="confirm" value="<%out.println(user.getPassword());%>"></td></tr>
                <tr><td>Profile Picture</td><td><input type="file" name="profile_picture" accept="image/*"></tr>
                <tr><td><input type="submit" value="Update"></td></tr>
            </form>
        </table>
    </body>
</html>
