<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2019/1/7
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>pid</th>
        <th>username</th>
        <th>password</th>
        <th>ptele</th>
    </tr>
    </thead>


    <tbody>
    <thead>
<c:forEach items="${list}" var="user">
<tr>
    <td>${user.pid}</td>
    <td>${user.username}</td>
    <td>${user.password}</td>
    <td>${user.ptele}</td>
</tr>
</c:forEach>
</thead>
    </tbody>
</table>

${page}
</body>
</html>
