<%--
  Created by IntelliJ IDEA.
  User: 8888
  Date: 2018/1/3
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>编号</td>
        <td>名字</td>
        <td>性别</td>
        <td>年龄</td>
        <td>密码</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${objects}" var="temp">
        <tr>
            <td>temp.id</td>
            <td>temp.name</td>
            <td>temp.sex</td>
            <td>temp.age</td>
            <td>temp.password</td>
            <td>
                <a href="http://localhost:80/studentAction!do_delete?object.id=${temp.id}">删除</a>
                <a href="http://localhost:80/studentAction!to_edit?object.id=${temp.id}">查看</a>
                <a href="http://localhost:80/studentAction!do_edit?object.id=${temp.id}">编辑</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
