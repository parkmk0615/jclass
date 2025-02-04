<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력</title>
</head>
<body>
	<h2>데이터 값 출력</h2>
	<div>count값: ${param.count }</div>
	<hr>
	<c:forEach items="${list}" var="member">
		<div>데이터 : ${member.id},${member.name}</div>
	</c:forEach>
</body>
</html>