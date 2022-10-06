<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>student List</title>

<link type="text/css"
	  rel = "stylesheet"
	  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Student manager</h2>
		</div>
	</div>
		   
	<div id="container">
		<div id="content">
			<input type="button" value="Add new Student"
			   class = "add-button"
			   onclick="" />
			<table>
			
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Last Name</th>
				</tr>
				
				<c:forEach var="tempStudent" items="${studentList}">
				<tr>
					<td> ${tempStudent.firstName} </td>
					<td> ${tempStudent.lastName} </td>
					<td> ${tempStudent.email} </td>
				</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>
</body>
</html>