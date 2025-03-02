<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>String Split Example</title>
</head>
<body>

    <c:set var="str" value="Hello Folks,What are you Doing Tonight Amara"/>
    
	<c:if test="${fn:endsWith(str,'Amara')}">
	
		You are a Genius
	</c:if>
	
	<c:set var="replace" value="${fn:replace(str,'Folks','Amara')}" />
	<p>${replace}</p>
	
	${fn:toLowerCase(str)} <br>
	${fn:toUpperCase(str)}

</body>
</html>
