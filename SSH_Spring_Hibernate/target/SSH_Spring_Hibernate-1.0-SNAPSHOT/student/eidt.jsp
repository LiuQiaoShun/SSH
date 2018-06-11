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
    <form action="studentAction!do_edit" method="post">
        <label>id</label>
        <input type="text" readonly="readonly" name="object.id" value="${object.id}">
        <label>name</label>
        <input type="text"  name="object.name" value="${object.name}">
        <label>age</label>
        <input type="text" name="object.age" value="${object.age}">
        <label>password</label>
        <input type="password" name="object.password" value="${object.password}">
        <label>sex</label>
        <input type="radio" name="object.sex" value="${object.sex}">女
        <input type="radio" name="object.sex" value="${object.sex}">男
        <button type="submit" value="submit">保存</button>
        <button type="reset">重置</button>
    </form>
</body>
</html>
