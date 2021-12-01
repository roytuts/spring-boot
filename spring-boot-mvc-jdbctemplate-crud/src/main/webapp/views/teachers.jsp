<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
       pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot MVC JdbcTemplate CRUD Example</title>
</head>
<body>
       <h2>Spring Boot MVC JdbcTemplate CRUD Example - List of Teachers</h2>
       <c:if test="${not empty msg}">
        ${msg}
    </c:if>
    <a href="<%=request.getContextPath()%>/addTeacher">Add New Teacher</a>
       <c:choose>
             <c:when test="${teachers != null}">
                    <h3>List of Teachers</h3>
                    <table cellpadding="5" cellspacing="5">
                          <thead>
                                 <tr>
                                       <th>ID</th>
                                       <th>Name</th>
                                       <th>Expertise</th>
                                        <th>Actions</th>
                                 </tr>
                          </thead>
                          <tbody>
                                 <c:forEach var="t" items="${teachers}">
                                       <tr>
                                              <td>${t.id}</td>
                                              <td>${t.name}</td>
                                              <td>${t.expertise}</td>
                                              <td><a
                                                    href="<%=request.getContextPath()%>/teacher/${t.id}">Details</a>
                                                    &nbsp; <a
                                                    href="<%=request.getContextPath()%>/update/teacher/${t.id}">Update</a>
                                                    &nbsp; <a
                                                    href="<%=request.getContextPath()%>/delete/teacher/${t.id}"
                                                     onclick="return confirm('Do you really want to delete?')">Delete</a></td>
                                       </tr>
                                 </c:forEach>
                          </tbody>
                    </table>
             </c:when>
             <c:otherwise>
             No User found in the database!
        </c:otherwise>
       </c:choose>
</body>
</html>
