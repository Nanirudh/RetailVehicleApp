        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Models for a make</title>
        </head>

        <body>
            <h1>Part Service</h1>
            <c:forEach var="vehicle" items="${vehicles}">
            <table>
            <tr>
            <th>Part</th>
            <th>Details</th>
            </tr>
                             <tr>
                                 <td>Make</td>
                                 <td><c:out value="${vehicle.make}"/></td>
                              </tr>
                             <tr>
                             <td>Model</td>
                                 <td><c:out value="${vehicle.model}"/></td>
                             </tr>
                             <tr>
                                 <td>EngineCapacity</td>
                                 <td><c:out value="${vehicle.enginecapacity}"/></td>
                             </tr>
                             <tr>
                                 <td>enginepower</td>
                                 <td><c:out value="${vehicle.enginepower}"/></td>
                             </tr>
                             <tr>
                                 <td>Fueltype</td>
                                 <td><c:out value="${vehicle.fueltype}"/></td>
                             </tr>
                             <tr>
                                 <td>Numgears</td>
                                 <td><c:out value="${vehicle.numgears}"/></td>
                             </tr>
                             <tr>
                                 <td>Numdoors</td>
                                 <td><c:out value="${vehicle.numdoors}"/></td>
                             </tr>
                             <tr>
                                 <td>Maxspeed</td>
                                 <td><c:out value="${vehicle.topspeed}"/></td>
                             </tr>
                             <tr>
                                  <td>Dimensions</td>
                                  <td><c:out value="${vehicle.dimensions}"/></td>
                             </tr>
                             </table>
                             </c:forEach>
        </body>
