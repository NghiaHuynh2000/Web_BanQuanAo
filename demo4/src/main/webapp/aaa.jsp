<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/14/2020
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ffff</title>
</head>
<body>
    <%

        String abc = request.getParameter("abc");
        System.out.println(abc);
        String abcd = (String)request.getAttribute("abcd");
    %>
    <h1><%=abc%></h1>
    <h1><%=abcd%></h1>
    <form method="get" action="ListUser">
        <input type = "text" name = "abc" value = "<%= abc%>">
        <input type = "submit" value="submit">
    </form>

</body>
</html>
