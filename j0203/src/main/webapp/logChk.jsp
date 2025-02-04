<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- html 주석: 소스보기에 나타남. -->
<%--jsp주석. html 소스보기에 나타나지 않음--%>
	
<%
	String id = request.getParameter("id");
	out.println(id);
	String pw = request.getParameter("pw");
	String[] save = request.getParameterValues("save");
	if(save != null){
		Cookie cookie = new Cookie("cook_id",id);
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
%>
<div><%=save[0] %>이 저장 되었습니다.</div><%
	}else{
		Cookie[] cookies =request.getCookies();
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("cook_id")){
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}%>
<div>cook_id 가 삭제되었습니다.</div>
	<%}%>
</body>
</html>