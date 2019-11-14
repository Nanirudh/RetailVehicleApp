<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
 <head>
  <style>
  table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
  }

  td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
  }

  tr:nth-child(even) {
    background-color: #dddddd;
  }
  </style>
 </head>
 <body>

   <c:if test = "${Status=='Found'}">
      <table>
        <tr>
          <th>DealerId</th>
          <th>DealerName</th>
          <th>DealerCountry</th>
          <th>DealerCity</th>
           <th>DealerDetails</th>
         </tr>
        <c:forEach var="listVar" items="${DealerList}">
          <tr>
            <td>${listVar.dealer_id}</td>
            <td>${listVar.dealer_name}</td>
            <td>${listVar.country}</td>
            <td>${listVar.city}</td>
            <td>${listVar.details}</td>
          </tr>
        </c:forEach>
     </table>
   </c:if>

   <c:if test = "${Status=='NotFound'}">
     <h3>Please enter valid Country and City</h3>
   </c:if>

 </body>
</html>