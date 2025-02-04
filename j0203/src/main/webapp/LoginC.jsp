<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키저장하기</title>
</head>
<body>
<!--  아이디를 쿠키에 저장하기 변수명: cook_id 변수값: 입력한 데이터 -->
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String[] saveId = request.getParameterValues("saveId");
		if(saveId != null){
			Cookie cookie = new Cookie("cook_id",id); //쿠키 객체 생성
			cookie.setMaxAge(60*60*24);//60초*60분*24시간
			response.addCookie(cookie);
		}else{
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("cook_id")){
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					
				}
			}
		}
		

	%>
	<button onclick="javascript:location.href='./loginOK.jsp'">이동하기</button>
</body>
</html>