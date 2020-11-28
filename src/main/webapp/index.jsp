<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<%@ page pageEncoding="UTF-8" %>

<html>
<head>
    <title>Автосалон</title>
    <link href="style/css.css" rel="stylesheet" type="text/css">
</head>
<body>
    <header>
        <div>
            <a href="/show"><div class="link">На главную</div></a>
        </div>
    </header>
    <main>
        <form method="post" action="/add">
            <h2>Заполните данные об автомобиле:</h2>
            <fieldset>
                <legend>Основные данные</legend>
                <div>
                    <label>Марка: <input type="text" name="brand" id="brand" required></label>
                </div>
                <div>
                    <label>Модель: <input type="text" name="model" id="model" required></label>
                </div>
                <div>
                    <label for="body-type">Выберите тип кузова: </label>
                    <select name="body-type" id="body-type">
                        <option value="SEDAN">седан</option>
                        <option value="ESTATE">универсал</option>
                        <option value="COUPE">купе</option>
                        <option value="PICKUP">пикап</option>
                        <option value="CABRIOLET">кабриолет</option>
                    </select>
                </div>
                <div>
                    <label>Цена: <input type="number" min="0" name="price" id="price" value="0.0" step="0.01" required></label>
                </div>
            </fieldset>
            <fieldset>
                <legend>Двигатель</legend>
                <div>
                    <label for="fuel">Выберите марку топлива: </label>
                    <select name="fuel" id="fuel">
                        <option value="PETROL">бензин</option>
                        <option value="DIESEL">дизельное</option>
                        <option value="GAS">газ</option>
                        <option value="HYBRID">гибрид</option>
                        <option value="ELECTRO">электро</option>
                    </select>
                </div>
                <div>
                    <label>Объём двигателя: <input type="number" min="0" name="engine-volume" id="engine-volume" value="0" required></label>
                </div>
            </fieldset>
            <fieldset>
                <legend>Коробка передач</legend>
                <div>
                    <span>Тип:</span>
                    <label><input type="radio" name="transmission" value="MANUAL" checked required>МКПП</label>
                    <label><input type="radio" name="transmission" value="AUTO">АКПП</label>
                </div>
                <div>
                    <label>Количество ступеней: <input type="number" min="1" name="trans-stages" id="trans-stages" value="1" required></label>
                </div>
            </fieldset>
            <div>
                <button type="submit">Отправить</button>
                <button type="reset">Сбросить</button>
            </div>
        </form>
    </main>
</body>
</html>
