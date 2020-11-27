<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<%@ page pageEncoding="UTF-8" %>

<html>
<head>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
    <title>Title</title>
</head>
<body>
<header>
    <button id="to-index">На главную</button>
    <script language="JavaScript">
        let button = document.getElementById("to-index");
        button.addEventListener("click", function() {
            document.location.href= "/index.jsp";
        });
    </script>
</header>
<main>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Марка</th>
                <th>Модель</th>
                <th>Кузов</th>
                <th>Топливо</th>
                <th>Объём двигателя</th>
                <th>Коробка передач</th>
                <th>Кол-во ступеней</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="car" items="${requestScope.list}">
                <tr>
                    <td>${car.id}</td>
                    <td>${car.brand}</td>
                    <td>${car.model}</td>
                    <td>${car.bodyCar.value}</td>
                    <td>${car.engine.fuel.value}</td>
                    <td>${car.engine.volume}</td>
                    <td>${car.transmission.type.value}</td>
                    <td>${car.transmission.stageNumber}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</main>
</body>
</html>
