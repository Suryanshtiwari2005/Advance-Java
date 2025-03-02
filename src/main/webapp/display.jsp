<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/sys" user="root" password="1234"/>
	
	
	<sql:query var="rs" dataSource="${db}">select * from employee</sql:query>
	
	<c:forEach items="${rs.rows}" var="employee">
		<br> <c:out value="${employee.emp_id}" ></c:out> : <c:out value="${employee.first_name}" ></c:out> : <c:out value="${employee.last_name}" ></c:out>
	
	</c:forEach>
	
</body>
</html>