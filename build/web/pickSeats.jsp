<%-- 
    Document   : pickSeats
    Created on : Apr 17, 2018, 8:48:46 PM
    Author     : Filipus
--%>


<%@page import="services.Seat"%>
<%@page import="java.util.List"%>
<%@page import="services.Studio"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        .col-seat{
            background-color: #4CAF50; /* Green */
            color: white;
            width: 50px;
            height: 50px;
            text-align: center;
            border-radius: 10px;
        }
        .button:hover {
            background-color: #f44336;
            color: white;
        }
    </style>
    <body>
    <center>
        <h1>Pick Seats</h1>
        <%
            try {
                services.WSCustomer_Service service = new services.WSCustomer_Service();
                services.WSCustomer port = service.getWSCustomerPort();
                
                String m_id = request.getParameter("m_id");
                String sch = request.getParameter("sch");
                String studioNumber = request.getParameter("studioNumber");
                Studio studio = port.getStudioByStudioNumber(studioNumber);

                out.println("Movie " + port.getMovieById(m_id).getTitle() + "<br>");
                out.println("Schedule: " + sch);
                out.println("Studio  : " + studio.getStudioName() + " at " + studio.getCinema().getCinemaName());
                List<Seat> seats = port.getSeatByStudioNumber(Integer.parseInt(studioNumber));
                for (int idx = 0; idx < seats.size(); idx++) {
                    if (idx % 7 == 0) {
                        out.println("<br>");
                    }
                    out.println("<button class='button col-seat'>"
                            + seats.get(idx).getId().getSeatPosition() + "</button>");
                }
                out.println("<br><br><br><button>Book Now</button");
            } catch (Exception e) {
                e.printStackTrace();
            }

        %>
    </center>
</body>
</html>
