<%-- 
    Document   : topUp
    Created on : Apr 23, 2018, 10:27:37 AM
    Author     : Filipus
--%>

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
        int id = user.getUserId();
    %>
    <body>
        <h1>Top Up</h1>
        <form action="topupServlet" method="post">
            <table>
                <tr><td>Amount IDR</td><td><input type="text" name="balance" required></td></tr>
                <tr><td>Bank Account</td><td><input type="text" required></td></tr>
                <input type="hidden" name="userId" value="<%=id%>">
                <tr><td colspan="2"><input type="submit" value="Top Up"></td></tr>
            </table>
        </form>
    </body>
</html>
