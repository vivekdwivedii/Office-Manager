

package emp;

import DB.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Attendance extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session=request.getSession();
            String user=session.getAttribute("user").toString();
            String atnd=request.getParameter("atnd");
 DBConnect db=new DBConnect();
 Calendar c=Calendar.getInstance();
 String time=c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);
 if(atnd.equals("1"))
 {
 db.pstmt=db.con.prepareStatement("INSERT INTO emp_attendance(ecode,date,time_in)values(?,curdate(),?)");
 db.pstmt.setString(1, user);
 db.pstmt.setString(2, time);
 int i=db.pstmt.executeUpdate();
 if(i>0)
 {
 response.sendRedirect("EmployeeHome.jsp?CheckIn");
 }
 }
 else
 {
 db.pstmt=db.con.prepareStatement("update emp_attendance set time_out=? where ecode=?");
 db.pstmt.setString(1, time);
 db.pstmt.setString(2, user);
 int i=db.pstmt.executeUpdate();
 if(i>0)
 {
 response.sendRedirect("index.html?msg=Checkout Successfully");
 
 }
 }

 
        
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

   
}
