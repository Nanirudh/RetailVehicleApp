<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Part Service</title>
</head>
<body>

    <form method="GET" action="${contextPath}/compare">

                <input type="text" name="makeone" placeholder="Enter Make" autofocus="true"></input>

                <input type="text" name="modelone" placeholder="Enter Model"></input>

                   <br/>

                   <input type="text" name="maketwo" placeholder="Enter Make" autofocus="true"></input>

                    <input type="text" name="modeltwo" placeholder="Enter Model"></input>

                 <button type="submit">Search</button>


    </form:form>


</body>
</html>
