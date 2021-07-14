<%--
  Created by IntelliJ IDEA.
  User: THANH
  Date: 7/14/2021
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/hello" method="post">
    <input type="text" name="num" placeholder="num">
    <select name="type">
      <option value="toUSD">VND - USD</option>
      <option value="toVND">USD - VND</option>
    </select>

    <button type="submit">Submit</button>
  </form>
  $END$
  </body>
</html>
