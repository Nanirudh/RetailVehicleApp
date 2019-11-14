<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Part Service</title>
</head>
<body>

    <form method="GET" action="${contextPath}/getprice">

                <input type="text" name="make" placeholder="Enter Make" autofocus="true"></input>

                <input type="text" name="model" placeholder="Enter Model"></input>
                 <button type="submit">Search</button>


    </form:form>


</body>
</html>
