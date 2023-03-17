<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>

<Style>

div {


    width: 50%;
    margin: auto;
    padding: 20px;
    background-color: #f2f2f2;
    border-radius: 10px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
  }
  
  /* Style for the input fields */
  input[type=text], input[type=email] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
  }
  
  /* Style for the submit button */
  input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
  }
  
  /* Style for the submit button on hover */
  input[type=submit]:hover {
    background-color: #45a049;
    color: red;
  }
</Style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
<h1>Save your Data Here :-)</h1>
<form:form  action="/PasswordManager/loginpage/dataprocess" modelAttribute="container"   >

Application Name:<form:input path="applicationName"/>
<br>
Application Password<form:input path="applicationPassword"/>
<br>


<input type="hidden" name="username"  value="${User}">
<input type="submit"/>


</form:form>
</div>

</body>
</html>