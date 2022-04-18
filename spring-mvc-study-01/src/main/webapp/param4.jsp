<%--
  Created by IntelliJ IDEA.
  User: liulei
  Date: 2022/4/18
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>接收一组POJO类型的请求参数</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/param/param4" method="post">
    userName1:<input type="text" name="users[0].username"/> <br/>
    password1:<input type="text" name="users[0].password"/> <br/>
    age1:<input type="text" name="users[0].age"/> <br/>
    <hr/>
    userName2:<input type="text" name="users[1].username"/><br/>
    password2:<input type="text" name="users[1].password"/> <br/>
    age2:<input type="text" name="users[1].age"/> <br/>

    <input type="submit" value="submit"/>
</form>
</body>
</html>
