<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Spittr</title>
	</head>
	<body>
		<h1>Recent Spittles 20</h1>
		<c:forEach items="${spittleList}" var="spittle">
			<li>
				<c:out value="${spittle.message}"/>
			</li>
		</c:forEach>
	</body>
</html>