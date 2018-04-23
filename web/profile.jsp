<%-- 
    Document   : profile
    Created on : Apr 23, 2018, 10:14:24 AM
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
    <body>
        <%
            boolean loggedin = false;
            if (!(session.getAttribute("userid") == null || session.getAttribute("userid").equals(""))) {
                loggedin = true;

                services.WSCustomer_Service service = new services.WSCustomer_Service();
                services.WSCustomer port = service.getWSCustomerPort();

                String email = session.getAttribute("userid").toString();
                User user = port.getUserByEmail(email);
                Customer cust = port.getCustomer(user.getUserId().toString());
                out.println("<h1>" + user.getFirstName() + "'s Profile</h1>");
                out.println("<h2>My Credit : IDR " + cust.getBalance() + "</h2>");

            } else {
                response.sendRedirect("login.jsp");
            }


        %>
        <ul>
            <li><a href="editProfile.jsp">Edit Profile</a></li>
            <li><a href="topUp.jsp">Top Up</a></li>
            <li><a href="logout.jsp">Log Out</a></li>
        </ul>

    </body>
</html>
