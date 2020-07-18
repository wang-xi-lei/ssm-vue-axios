<%--
  Created by IntelliJ IDEA.
  User: 50153
  Date: 2020/7/10
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<form action="/addStu">
    <div class="form-group">
        <label for="exampleInputEmail1">姓名</label>
        <input type="text" class="form-control" name="name" id="exampleInputEmail1" placeholder="姓名">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">年龄</label>
        <input type="text" class="form-control" name="age" id="exampleInputPassword1" placeholder="年龄">
    </div>
    <button type="submit" class="btn btn-default">添加</button>
</form>
</body>
</html>
