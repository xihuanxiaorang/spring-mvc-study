<%--
  Created by IntelliJ IDEA.
  User: liulei
  Date: 2022/4/19
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/register" method="post">
    用户名: <input type="text" name="username"/>
    密码: <input type="text" name="password"/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
