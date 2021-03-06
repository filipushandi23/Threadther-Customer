package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import services.Movie;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        ");

            String name = "Guest";
            if (request.getParameter("name") == null || request.getParameter("name").equals("")) {
                out.println("<h1>Welcome to Threadther, " + name + "</h1>");
            } else {
                name = request.getParameter("name");
                out.println("<h1>Welcome to Threadther, " + name + "</h1><a href='logout.jsp'>Log Out</a>");
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("            <li><a href=\"showMovieSchedule.jsp\">Show Movie Schedule</a></li>\n");
      out.write("            <li><a href=\"profile.jsp\">My Profile</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <h2>Playing Now Movies</h2>\n");
      out.write("        ");
            try {
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
        
      out.write("\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
