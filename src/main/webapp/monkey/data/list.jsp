<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료실</title>
</head>
<body>
<h1>자료실</h1>
<br>
<ul>
	<c:forEach items="${results}" var="vo">
		<li>${vo.boTitle }, ${vo.boWriter }
	 </c:forEach>
</ul>
</body>
</html>