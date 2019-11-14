        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>compare service</title>
        </head>

        <body>
            <h1>Compare Service</h1>
            <table>
            <tr>
            <th>Part</th>
            <th>Vehilce1</th>
            <th>Vehicle2</th>
            </tr>
                <tr>
                    <td>Make</td>
                    <td><c:out value="${vehicleone.make}"/></td>
                    <td><c:out value="${vehicletwo.make}"/></td>
                </tr>
                <tr>
                    <td>EngineCapacity</td>
                    <td><c:out value="${vehicleone.enginecapacity}"/></td>
                    <td><c:out value="${vehicletwo.enginecapacity}"/></td>
                </tr>
                <tr>
                    <td>enginepower</td>
                    <td><c:out value="${vehicleone.enginepower}"/></td>
                    <td><c:out value="${vehicletwo.enginepower}"/></td>
                </tr>
                <tr>
                    <td>Fueltype</td>
                    <td><c:out value="${vehicleone.fueltype}"/></td>
                    <td><c:out value="${vehicletwo.fueltype}"/></td>
                </tr>
                <tr>
                    <td>Numgears</td>
                    <td><c:out value="${vehicleone.numgears}"/></td>
                    <td><c:out value="${vehicletwo.numgears}"/></td>
                </tr>
                <tr>
                    <td>Numdoors</td>
                    <td><c:out value="${vehicleone.numdoors}"/></td>
                     <td><c:out value="${vehicletwo.numdoors}"/></td>
                </tr>
                <tr>
                    <td>Maxspeed</td>
                    <td><c:out value="${vehicleone.topspeed}"/></td>
                     <td><c:out value="${vehicletwo.topspeed}"/></td>
                </tr>
                <tr>
                     <td>Dimensions</td>
                     <td><c:out value="${vehicleone.dimensions}"/></td>
                     <td><c:out value="${vehicletwo.dimensions}"/></td>
                </tr>
            </body>
