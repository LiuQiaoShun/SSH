<%--
  Created by IntelliJ IDEA.
  User: 8888
  Date: 2018/1/3
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>密码</td>
    </tr>
    <tr>
        <td>${object.id}</td>
        <td>${object.name}</td>
        <td>${object.age}</td>
        <td>${object.sex}</td>
        <td>${object.password}</td>
    </tr>
</table>
</body>
</html>
