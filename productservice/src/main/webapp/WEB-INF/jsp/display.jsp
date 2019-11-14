        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Models for a make</title>
</head>

<body>
    <ul>
    <c:forEach var="vehicle" items="${lists}">
      <li><c:out value="${vehicle}"/></li>
            </c:forEach>
     </ul>
</body>
