<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>

<style>
div {
position: fixed;
top: 50%;
left: 50%;
transform: translate(-50%, -50%);
}	table {
			border-collapse: collapse;
			width: 100%;
			margin:10px;
			padding: 10px;
		}
		th, td {
			text-align: left;
			padding: 8px;
			border-bottom: 1px solid #ddd;
		}
		tr:hover {
			background-color: #6096B4;
		}
		th {
			background-color: #4CAF50;
			color: white;
		}

.link{
background-color: #f44336;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}
td{
padding:10px;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="EEE9DA">
<h1>Welcome to Your Page</h1>
<div>
<table border="2">
<tr>
<thead>
       <th>Application Name</th>
       <th>Password</th></tr>
 </thead>
 <c:forEach items="${user}" var = "user">
        <tbody>
        <tr>
        <td padding="5px" >${user.applicationName}</td>
       <td padding="5px"> ${user.applicationPassword}</td>
        
       
       </tr>
        </c:forEach>
       </tbody>
        </table>
     
<a class="link" href="/PasswordManager/loginpage/dataform?username=${username}">click to add data</a>
</div>

</body>
</html>