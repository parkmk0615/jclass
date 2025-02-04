<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키삭제</title>
</head>
<body>
	<%
		String cookN = request.getParameter("cookN");
		
		Cookie[] cookies = request.getCookies();//모든 쿠키 가져오기 - 배열
		if(cookies !=null){
			for(Cookie cookie : cookies){ //cook_id,cook_pw, cook_name...
				if(cookie.getName().equals(cookN)){
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					
				}
			}
		}
	%>
	<div><%=cookN %>가 삭제되었습니다.</div>
	<button onclick="javascript:location.href='./j0203_10.jsp'">페이지 이동하기</button>
</body>
</html>