<%-- 
    Document   : AdmAttendenceReport
    Created on : 9 Mar, 2024, 1:19:09 PM
    Author     : ASUS
--%>

<%@page import="DB.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHeader.jsp" %>
<center><h2>Attendance Report</h2>
 <form action="#">
 <br><b>Search Employee Attendance:
<input type="search" name="code"
placeholder="Enter Employee Code"></b>
<br><br>
 <table width="1000" cellspacing="0"
cellpadding="5" border="1"
bgcolor="lightpink">
     <tr
bgcolor="lightblue"><td>SNo.</td><td>Em
ployee Code</td><td>Employee
Name</td>
 <td>Employee Gender</td><td>E Mail
Address</td><td>Attendace Date</td>
 <td>Time IN</td><td>Time OUT</td></tr>
 <%
 try
 {


 if(request.getParameter("code")!=null)
 {
 String
user=request.getParameter("code");
 DBConnect db=new DBConnect();
db.pstmt=db.con.prepareStatement("SELECT emp_mstr.ecode,emp_mstr.ename,emp_mstr.egender,emp_mstr.email,emp_attendance.date,emp_attendance.time_in,emp_attendance.time_out FROM emp_mstr,emp_attendance WHERE emp_mstr.ecode=emp_attendance.ecode and emp_attendance.ecode=?");
db.pstmt.setString(1, user);
db.rst=db.pstmt.executeQuery();
int count=1;
while(db.rst.next()) 
{
    out.println("<tr><td bgcolor=dodgerblue style='color:white;'>"+ count+"</td><td>"+
db.rst.getString(1)+"</td>"
 + "<td>"+
db.rst.getString(2)+"</td><td>"+
db.rst.getString(3)+"</td>"
 + "<td>"+
db.rst.getString(4)+"</td><td>"+
db.rst.getString(5)+"</td>"
 + "<td>"+
db.rst.getString(6)+"</td><td>"+
db.rst.getString(7)+"</td></tr>");
count++;
}
 }
 else
 {
     
 DBConnect db=new DBConnect();
db.pstmt=db.con.prepareStatement("SELECT emp_mstr.ecode,emp_mstr.ename,emp_mstr.egender,emp_mstr.email,emp_attendance.date,emp_attendance.time_in,emp_attendance.time_out FROM emp_mstr,emp_attendance WHERE emp_mstr.ecode=emp_attendance.ecode")
;
db.rst=db.pstmt.executeQuery();
int count=1;
while(db.rst.next())
{
out.println("<tr><td bgcolor=dodgerbluestyle='color:white;'>"+ count+"</td><td>"+
db.rst.getString(1)+"</td>"
        + "<td>"+
db.rst.getString(2)+"</td><td>"+
db.rst.getString(3)+"</td>"
 + "<td>"+
db.rst.getString(4)+"</td><td>"+
db.rst.getString(5)+"</td>"
 + "<td>"+
db.rst.getString(6)+"</td><td>"+db.rst.getString(7)+"</td></tr>");
count++;
}

 }
 }
 catch(Exception e)
 {
     e.printStackTrace();
 }
 %>
 </table>
 </form>
</center>
 

    
