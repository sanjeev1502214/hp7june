<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Travel Right</title>
<link rel="icon" type="image/jpg" href="image/logo.jpg">
<link rel="stylesheet" href="./css/external.css" type = "Text/css"/>
<style>
input[type=password], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}
</style>
</head>
<body>
<center>
       <div style= "width:90% ">
       <%@ include file="headerAdmin.jsp" %>
       
       <form action="Changepassword" method="post">
                           <fieldset style="padding-left:10px">
                                         <legend><h2>Sign-In</h2></legend>
                                  <table>
                                  <tr><td><input type="password" name="password" required="required" placeholder="Current Password *"></td></tr>
                                  <tr><td><input type="password" name="newpassword" required="required" placeholder="New Password *"></td></tr>
                                  <tr><td><input type="submit" value="Update"></td></tr>
                                  </table>
                                  </fieldset>
                           </form>
                           <br><br>
                           <h2 align="left">Instructions</h2><br>
                           <ul>
                           <li align="justify">The fields with * are mandatory.</li><br>
                           <li align="justify">Please provide the valid information in the field(s).</li><br>
                           <li align="justify">Password must be atleast 8-15 characters.</li><br>
                           </ul>
       </div>
</center>    
</body>
</html>
