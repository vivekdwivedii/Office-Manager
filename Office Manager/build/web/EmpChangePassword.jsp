<%-- 
    Document   : EmpChangePassword
    Created on : 6 Mar, 2024, 3:09:27 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@include file="EmployeeHeader.jsp" %>--%>
<%@include file="EmployeeHeader.jsp" %>
<center>
    <h1 style="color: red">Change Password</h1>

    <form action="EmpChangePassword">
        <table width="600" border="1" cellpadding="20">
            <tr><td>Enter Old Password</td><td><input type="password" name="opswd"</td></tr>
            <tr><td>Enter New Password</td><td><input type="password" name="npswd"</td></tr>
            <tr><td>Enter Confirm Password</td><td><input type="password" name="cpswd"</td></tr>
            <tr><td><input type="submit" value="Submit"></td><td><input type="reset" name="reset"</td></tr>




    </form>








</center>


