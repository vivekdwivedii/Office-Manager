package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBConnect;

public final class ViewProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/EmployeeHeader.jsp");
  }

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
      out.write(" ");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Virtual Office</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/droid_sans_400-droid_sans_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("    <body bgcolor=\"skyblue\">\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("     \n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"EmployeeHome.jsp\"><span>Employee Home</span></a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\" style=\"width: 1200px; height: 90px\">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"active\"><a href=\"ViewProfile.jsp\"><span>View Profile</span></a></li>\n");
      out.write("          <li><a href=\"AddAttendence.jsp\"><span>Add Attendence</span></a></li>\n");
      out.write("          <li><a href=\"AttendenceReport.jsp\"><span>Attendence Report</span></a></li>\n");
      out.write("          <li><a href=\"EmpChangePassword.jsp\"><span>Change Password</span></a></li>\n");
      out.write("          <li><a href=\"logout\"><span>Logout</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div> </div>\n");
      out.write("      </div>\n");
      out.write("      </div> \n");
      out.write("     ");
      out.write("\n");
      out.write(" <center><h2><u>Employee Profile</u></h2>\n");
      out.write(" ");

    // String user=session.getAttribute("user").toString();
     Object userObj = session.getAttribute("user");
String user = (userObj != null) ? userObj.toString() : null;

 DBConnect db=new DBConnect();
 db.pstmt=db.con.prepareStatement("select * from emp_mstr where ecode=?");
 db.pstmt.setString(1, user);
 db.rst=db.pstmt.executeQuery();
 if(db.rst.next())
 {
 out.println("<form action=EditProfile.jsp>");
 out.println("<table width='600' border='1' cellpadding='10' bgcolor=white>");
 out.println("<tr><td width='300'>Employee Code(User)</td><td>"+db.rst.getString(1)+"</td></tr>");
out.println("<tr><td width='300'>Employee Name</td><td>"+db.rst.getString(2)+"</td></tr>");
out.println(" <tr><td width='300'>Date of Birth</td><td>"+db.rst.getString(3)+"</td></tr>");
out.println("<tr><td width='300'>Gender</td><td>"+db.rst.getString(4)+" </td></tr>");
out.println("<tr><td width='300'>Post</td><td>"+db.rst.getString(5)+"</td></tr> ");
out.println("<tr><td width='300'>Address</td><td>"+db.rst.getString(6)+"</td></tr> ");
out.println("<tr><td width='300'>City</td><td>"+db.rst.getString(7)+"</td></tr> ");
out.println("<tr><td width='300'>Contact</td><td>"+db.rst.getString(8)+"</td></tr> ");
out.println("<tr><td width='300'>Email</td><td>"+db.rst.getString(9)+"</td></tr>");
out.println("<tr><td width='300'>Id Name</td><td>"+db.rst.getString(10)+"</td></tr>");
 out.println("<tr><td width='300'>Id Number</td><td>"+db.rst.getString(11)+"</td></tr>");
 out.println("<tr><td width='300'><input type='submit' value='Edit'></td><td><input type='reset'value='Reset'></td></tr>");

 out.println(" </table></form>");

 }
 else
 {
 out.println("<h1>Please Login First</h1>"); 
  }

 
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
