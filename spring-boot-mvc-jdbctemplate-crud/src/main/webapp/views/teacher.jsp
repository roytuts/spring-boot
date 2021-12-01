<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
       pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot MVC JdbcTemplate CRUD Example</title>
</head>
<body>
       <h2>Spring Boot MVC JdbcTemplate CRUD Example - Teacher Details</h2>
       <a href="<%=request.getContextPath()%>/teachers">List of Teachers</a>
       <p />
       Id : ${teacher.id}
       <br /> Name : ${teacher.name}
       <br /> Expertise : ${teacher.expertise}
</body>
</html>
