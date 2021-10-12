<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 10/12/2021
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/caculator" method="post">
    <input type="number" name="numberA">
    <select name="cal" id="">
      <option value="+">+</option>
      <option value="-">-</option>
      <option value="*">*</option>
      <option value="/">/</option>
    </select>
    <input type="number" name="numberB">
    <button>submit</button>
  </form>
  <h2>${result}</h2>
  </body>
</html>
