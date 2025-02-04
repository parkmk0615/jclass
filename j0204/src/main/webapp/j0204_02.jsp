<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 변수,흐름제어(for,if,switch),변수출력 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
	<%String sid = "aaa"; %>
	<div>스크립트릿 사용id: <%= sid %></div>
	<hr>
	<c:set var="id" value="bbb"/>
	<div>jstl태그:${id}</div>
	
	<!-- if문 -->
	<c:if test="${id == 'bbb'}">
		<div>id의 값은 bbb입니다.</div>
	</c:if>	 
	<c:if test="${id != 'bbb'}">
		<div>id의 값은 bbb가 아닙니다. 정답: ${id}</div>
	</c:if>	 
	
	<!-- for문 -->
	<c:forEach begin="1" end="10" step="1" var="i">
		<div>i의 변수 값: ${i}</div>
	</c:forEach>
	
	
	<c:set var="score" value="89"></c:set>
	<c:choose>
		<c:when test="${score>=90}">
			<div>성적: A</div>
		</c:when>
		<c:when test="${score>=80}">
			<div>성적: B</div>
		</c:when>
		<c:when test="${score>=70}">
			<div>성적: C</div>
		</c:when>
		<c:when test="${score>=60}">
			<div>성적: D</div>
		</c:when>
		
		<c:otherwise>
			<div>성적 : F</div>
		</c:otherwise>
	</c:choose>
</body>
</html>