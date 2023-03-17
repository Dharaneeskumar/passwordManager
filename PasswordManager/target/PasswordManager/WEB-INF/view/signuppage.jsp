<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>

<style>
div {
position: fixed;
top: 50%;
left: 50%;
transform: translate(-50%, -50%);
}	body {
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
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="B9F3E4">

<div>
<form:form  action="/PasswordManager/signup/signupprocess"  modelAttribute="signup">

User Name:<form:input path="userName"/>
<br>
Password <form:password path="userPassword"/>
<br>
<input type="submit"/>
<input type="reset"/>
 </form:form>

</div>
</body>
</html>