<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<%@ page pageEncoding="UTF-8" %>

<html>
<head>
    <title>АВТОСАЛОН</title>
    <link href="../style/css.css" rel="stylesheet" type="text/css">
</head>
<body>
<header>
    <div>
        <a href="../index.jsp"><div class="link">Добавить</div></a>
    </div>
    <div>
        <a href="/edit"><div class="link">Изменить</div></a>
    </div>
    <div>
        <form method="post" action="/delete">
            <select name="id-car">
                <c:forEach var="car" items="${requestScope.list}">
                    <option value="${car.id}">${car.brand} ${car.model} ${car.engine.volume}л.с.</option>
                </c:forEach>
            </select>
            <button type="submit">Удалить</button>
        </form>
    </div>
    <div>
        <form method="post" action="/sort">
            <span>Сортировать по:</span>
            <label><input type="radio" name="sort" value="increase" checked>возрастанию</label>
            <label><input type="radio" name="sort" value="decrease">убыванию</label>
            <button type="submit">По цене</button>
        </form>
    </div>
</header>
<main>
    <table>
        <thead>
            <tr>
                <th>Марка</th>
                <th>Модель</th>
                <th>Кузов</th>
                <th>Топливо</th>
                <th>Объём двигателя</th>
                <th>Коробка передач</th>
                <th>Кол-во ступеней</th>
                <th>Цена, $</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="car" items="${requestScope.list}">
                <tr>
                    <td>${car.brand}</td>
                    <td>${car.model}</td>
                    <td>${car.bodyCar.value}</td>
                    <td>${car.engine.fuel.value}</td>
                    <td>${car.engine.volume}</td>
                    <td>${car.transmission.type.value}</td>
                    <td>${car.transmission.stageNumber}</td>
                    <td>${car.price / 100.0}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</main>
</body>
</html>
