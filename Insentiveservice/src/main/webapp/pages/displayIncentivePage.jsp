<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head></head>
 <body>
  <h3>Make: ${make}</h3>
  <h3>Model: ${model}</h3>
  <table>
    <tr>
      <td><h4>Incentives</h4></td>
    </tr>

       <c:forEach var="obj" items="${incentiveObj}">
         <tr><td>${obj.dealerId}</td></tr>
         <c:forEach var="listVar" items="${obj.incentives}">
            <tr>
            <td><c:out value="${listVar}"/></td>
            </tr>
       </c:forEach>
     </c:forEach>

   </table>
 </body>
</html>