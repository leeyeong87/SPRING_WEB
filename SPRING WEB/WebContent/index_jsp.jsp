﻿<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>스프링 view 예제</title>
    </head>
    <body>
        <ul>
        	<li>
        		<a href="<c:url value='/jsp/login/login.do'/>">/jsp/login/login.do</a>
        		(viewjsp/loginForm.jsp, &lt;form:* /&gt; 태그 및 &lt;spring:message&gt; 태그 예제) 
        	</li>
        	<li>
        		<a href="<c:url value='member/regist.do'/>">/jsp/member/regist.do</a>
        		(viewjsp/registMemberForm.jsp, &lt;form:label/&gt; 태그 예제) 
        	</li>
        	<li>
        		<a href="<c:url value='/jsp/articleForm.do'/>">/jsp/articleForm.do</a>
        		(viewjsp/article/*.jsp, &lt;form:form&gt; 태그의 RESTful 지원 예제) 
           	</li>
			<li>
				<a href="<c:url value='/changeLanguage'/>?lang=ko">/jsp/changeLanguage?lang=ko</a>
				<a href="<c:url value='/changeLanguage'/>?lang=en">/jsp/changeLanguage?lang=en</a>
				(LocaleChangeController, LocaleResolver 직접 이용 Locale 변환 예제)
				<br/>
				링크 클릭 후, <a href="<c:url value='/jsp/login/login.do'/>">/jsp/login/login.do</a>에서 라벨 확인 
			</li>        	
			<li>
				<a href="<c:url value='/jsp/login/login.do'/>?language=ko">/jsp/login/login.do?language=ko</a>
				<a href="<c:url value='/jsp/login/login.do'/>?language=en">/jsp/login/login.do?language=en</a>
				(LocaleChangeInterceptor를 이용한 Locale 변환 예제)
			</li>        	
        	
        	<li>
        		<a href="<c:url value='/download/file'/>">/download/file</a>
        		(DownloadController 및 DownloadView 예제) 
        	</li>
        	<li>
        		<a href="<c:url value='/download/pageRanks'/>">/download/pageRanks</a>
        		(PageRanksController 및 PageRanksView 엑셀 예제)
        	</li>
        	<li>
        		<a href="<c:url value='/download/pageReport'/>">/download/pageReport</a>
        		(PageReportController 및 PageReportView PDF 예제)
        	</li>
        	<li>
        		<a href="<c:url value='/download/pageXmlReport'/>">/download/pageXmlReport</a>
        		(PageReportController 및 MarshallingView XML 응답 예제)
        	</li>
        	<li>
        		<a href="<c:url value='/download/pageJsonReport'/>">/download/pageJsonReport</a>
        		(PageReportController 및 MappingJacksonJsonView JSON 응답 예제)
        	</li>
        </ul>
    </body>
</html>
