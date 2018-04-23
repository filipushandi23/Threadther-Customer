<%-- 
    Document   : showTest
    Created on : Mar 17, 2018, 12:49:25 PM
    Author     : Filipus
--%>


<%@page import="services.Movie"%>
<%@page import="services.Schedule"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1" cellpadding="10">
            <tr><td>Title</td><td>Poster</td><td>Duration</td><td>Schedule</td></tr>
            <%
                try {
                    services.WSCustomer_Service service = new services.WSCustomer_Service();
                    services.WSCustomer port = service.getWSCustomerPort();

                    List<Movie> movies = port.getShowingMovies();
                    List<Schedule> schedules = new ArrayList();

                    for (Movie movie : movies) {
                        out.println("<tr>");
                        out.println("<td>" + movie.getTitle() + "</td>");
                        out.println("<td><img src='" + movie.getPoster() + "' width='182px' height='268px'></td>");
                        out.println("<td> " + movie.getDuration() + "minutes </td>");
                        out.println("<td><ul>");
                        schedules = port.getAllScheduleByMovieId(movie.getMovieId());
                        for (Schedule s : schedules) {
                            out.println("<li><a href='pickSeats.jsp?m_id=" + movie.getMovieId() + "&sch=" + s.getId().getMovieStart() + ""
                                    + "&studioNumber=" + s.getStudio().getStudioNumber() + "'>"
                                    + s.getId().getMovieStart().getHour() + ":" + s.getId().getMovieStart().getMinute() + "0</a>"
                                            + "at "+s.getStudio().getCinema().getCinemaName()+"</li>");
                        }
                        out.println("</ul></td>");
                        out.println("</tr>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            %>
        </table>
    </body>
</html>
