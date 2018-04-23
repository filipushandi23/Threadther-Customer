<%-- 
    Document   : home
    Created on : Apr 19, 2018, 12:35:46 AM
    Author     : Filipus
--%>

<%@page import="java.util.List"%>
<%@page import="services.Movie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
            String name = "Guest";
            if (request.getParameter("name") == null || request.getParameter("name").equals("")) {
                out.println("<h1>Welcome to Threadther, " + name + "</h1>");
            } else {
                name = request.getParameter("name");
                out.println("<h1>Welcome to Threadther, " + name + "</h1><a href='logout.jsp'>Log Out</a>");
            }

        %>

        <ul>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="register.jsp">Register</a></li>
            <li><a href="showMovieSchedule.jsp">Show Movie Schedule</a></li>
            <li><a href="profile.jsp">My Profile</a></li>
        </ul>
        <h2>Playing Now Movies</h2>
        <%            try {
                services.WSCustomer_Service service = new services.WSCustomer_Service();
                services.WSCustomer port = service.getWSCustomerPort();

                List<Movie> listPlayingMovies = port.getShowingMovies();
                List<Movie> listComingSoonMovies = port.getComingSoonMovies();
                out.println("<table border='1' cellpadding='2'>");
                for (Movie pm : listPlayingMovies) {
                    out.println("<tr>");
                    out.println("<td><img src='" + pm.getPoster() + "' width='182px' height='268px'></td>");
                    out.println("<td>" + pm.getSynopsis() + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
                out.println("<br><hr><br>");
                out.println("<h2>Coming Soon Movies</h2>");
                out.println("<table border='1' cellpadding='2'>");
                for (Movie cm : listComingSoonMovies) {
                    out.println("<tr>");
                    out.println("<td><img src='" + cm.getPoster() + "' width='182px' height='268px'></td>");
                    out.println("<td>" + cm.getSynopsis() + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        %>
        <%-- end web service invocation --%><hr/>

    </center>

</body>
</html>
