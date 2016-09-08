<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>로그인</title>
</head>
<body>
	<form:form commandName="loginCommand">
		<form:errors element="div" /><!-- 글로벌 에러 -->
		아이디: <form:input path="userId" />
		<form:errors path="userId" element="div" /> <!-- userId에 대한 에러 -->
		<br />
		암호: <form:password path="password" showPassword="false" />
		<form:errors path="password" element="div" />
		<br />
		<input type="submit" />
	</form:form>
</body>
</html>