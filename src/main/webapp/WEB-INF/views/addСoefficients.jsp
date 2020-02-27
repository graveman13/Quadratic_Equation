<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>QuadraticEquation</title>
<body>
<h2> ax^2 + bx + c = 0</h2>
<form action="/coefficients" method=post>
    <label><b>a:</b></label>
    <input type="number" required name="a" class="raz" id="dva"/>

    <label> <b>b:</b></label>
    <input type="number" required name="b" class="raz" id="dva"/>

    <label><b>c:</b></label>
    <input type="number" required name="c" class="raz" id="dva"/>
    <button type="submit" required class="text">Calculate</button>
</form>
</head>
</body>
</html>
<style>
    #dva {
        width: 6em;
    }

    .raz {
        -moz-appearance: textfield;
    }

    .raz::-webkit-inner-spin-button {
        display: none;
    }
</style>
