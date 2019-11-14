        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Models for a make</title>
        </head>

        <body>
            <h1>Pricing Service</h1>
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
                                 <td>Engine</td>
                                 <td><c:out value="${vehicle.engine}"/></td>
                             </tr>
                             <tr>
                                 <td>Steering</td>
                                 <td><c:out value="${vehicle.steering}"/></td>
                             </tr>
                             <tr>
                                 <td>Seats</td>
                                 <td><c:out value="${vehicle.seats}"/></td>
                             </tr>
                             <tr>
                                 <td>Battery</td>
                                 <td><c:out value="${vehicle.battery}"/></td>
                             </tr>
                             <tr>
                                 <td>Headlights</td>
                                 <td><c:out value="${vehicle.headlights}"/></td>
                             </tr>
                             <tr>
                                 <td>Tyres</td>
                                 <td><c:out value="${vehicle.tyres}"/></td>
                             </tr>
                             <tr>
                                  <td>Fueltank</td>
                                  <td><c:out value="${vehicle.fueltank}"/></td>
                             </tr>
                             <tr>
                                  <td>Body</td>
                                  <td><c:out value="${vehicle.body}"/></td>
                             </tr>
                             <tr>
                                  <td>Gearbox</td>
                                  <td><c:out value="${vehicle.gearbox}"/></td>
                             </tr>
                             <tr>
                                  <td>Total</td>
                                  <td><c:out value="${vehicle.total}"/></td>
                             </tr>
        </body>
