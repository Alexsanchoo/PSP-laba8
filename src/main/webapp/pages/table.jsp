<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<%@ page pageEncoding="UTF-8" %>

<html>
<head>
    <title>АВТОСАЛОН</title>
</head>
<body>
<header>
    <a href="../index.jsp">Добавить</a>
    <form method="post" action="/delete">
        <select name="id-car" id="id-car">
            <c:forEach var="car" items="${requestScope.list}">
                <option value="${car.id}">${car.id}</option>
            </c:forEach>
        </select>
        <button type="submit">Удалить</button>
    </form>
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
