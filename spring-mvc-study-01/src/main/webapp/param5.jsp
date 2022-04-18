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
    <title></title>
</head>
<body>
<form action="${pageContext.request.contextPath}/param/param5" method="post">
    username:<input type="text" name="username"/> <br/>
    birthday:<input type="text" name="birthday"/> <br/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
