
package admin;

//import DB.DBConnect;
import DB.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BlockAccount extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
 String user=request.getParameter("user");
 DBConnect db=new DBConnect();
 db.pstmt=db.con.prepareStatement("UPDATE login SET ac_status='0' WHERE user=?");
 db.pstmt.setString(1, user);
 int i1=db.pstmt.executeUpdate();
 db.pstmt=db.con.prepareStatement("UPDATE emp_status SET last_work_date=CURDATE(), emp_status='Stopped' WHERE ecode=?");
 db.pstmt.setString(1, user);
 int i2=db.pstmt.executeUpdate();
 if(i1>0 && i2>0)
 {
 response.sendRedirect("AdminHome.jsp?msg=Account has been Blocked");
 }
           }
        catch(Exception e){
            e.printStackTrace();
        }
    }

   

}
