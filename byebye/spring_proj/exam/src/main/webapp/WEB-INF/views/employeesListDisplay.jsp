<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스프링 mvc</title>
</head>
<body>
	<h2>all empl in syst</h2>

	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>fName</th>
			<th>lName</th>
		</tr>
		<c:forEach items="${employrrs}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.fName}</td>
				<td>${employee.lName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>