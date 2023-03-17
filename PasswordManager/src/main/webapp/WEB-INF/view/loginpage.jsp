<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<Style>
	body {
			background-color: #F2F2F2;
			font-family: Arial, sans-serif;
		}
		h1 {
			text-align: center;
			color: #333333;
			margin-top: 50px;
		}
		form {
			max-width: 500px;
			margin: 50px auto;
			padding: 20px;
			background-color: #FFFFFF;
			border-radius: 10px;
			box-shadow: 0 0 10px rgba(0,0,0,0.3);
		}
		input[type=text], input[type=password] {
			width: 100%;
			padding: 12px 20px;
			margin: 8px 0;
			display: inline-block;
			border: 1px solid #ccc;
			border-radius: 4px;
			box-sizing: border-box;
		}
		input {
			background-color: #4CAF50;
			color: white;
			padding: 14px 20px;
			margin: 8px 0;
			border: none;
			border-radius: 4px;
			cursor: pointer;
			width: 100%;
		}
		input :hover {
			background-color: #45a049;
		}
		.link {
			text-align: center;
			margin-top: 20px;
		}
		.link a {
			color: #666666;
			text-decoration: none;
		}
		.link a:hover {
			color: #333333;
			text-decoration: underline;
		}
	a {
    display: inline-block;
    padding: 10px 20px;
    background-color: #4CAF50;
    color: #FFFFFF;
    text-decoration: none;
    font-size: 16px;
    font-weight: bold;
    border-radius: 5px;
    transition: background-color 0.3s ease-in-out;
    display: block;
			text-align: center;
			margin: auto;
			width: 50%;
			font-size: 24px;
			color: #333333;
			text-decoration: none;
			border: 2px solid #333333;
			padding: 10px;
			border-radius: 10px;
			background-color: #F2F2F2;
}

a:hover {
    background-color: #45a049;
    cursor: pointer;
}		
</Style>
<title>Login Page</title>
</head>
<body bgcolor="BEF0CB">
 
 <div>
<form:form  action="/PasswordManager/loginpage/processlogin" modelAttribute="login" >
<table   align="center" >
<tr> <th>User Name</th>  <td><form:input path="userName"/></td></tr>
 
<tr> <th>Password </th> <td> <form:password path="userPassword"/></td></tr>
 
 <tr> <th> <input type="submit" ></intput></th> <td><input type="reset" ></input></td> </tr>
 
</table>
</form:form>

<a class="link" href="/PasswordManager/signup/showsignuppage">New User Click Here?..</a>
</div>
</body>
</html>