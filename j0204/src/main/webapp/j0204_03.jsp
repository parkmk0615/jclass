<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>해당 값 반복</title>
</head>
<body>
	<!-- 1~10까지반복 -->
	<div>시작 값: <%=request.getParameter("st") %></div>
	<div>종료 값: <%=request.getParameter("ed") %></div>
	
	<div>시작 값: ${param.st}</div>
	<div>종료 값: ${param.ed}</div>
	
	<c:forEach var="i" begin="${param.st}" end="${param.ed}" step="1">
		<div>i 값: ${i}</div>
	</c:forEach>

</body>
</html>