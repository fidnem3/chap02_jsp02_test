<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	// 삭제할 쿠키의 이름
    	String cookieName = "userName";
    
    	// 쿠키 값을 빈 문자열로 세팅하여 쿠키 객체 생성 
    	// 그렇게 생성된 쿠리를 클라이언트에게 전송하면 기존 쿠기가 만료됨.
    	Cookie userCookie = new Cookie(cookieName, "");
    	//유효 기간을 0으로 하여 새로운 쿠키 생성
    	userCookie.setMaxAge(0);
    	
    	// 응답에 쿠키 추가
    	response.addCookie(userCookie);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>쿠키가 만료되었습니다.</h3>
</body>
</html>