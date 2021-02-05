<%@ page import="maktab.Entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2/5/2021
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>
</head>
<body>
<%Employee employee = (Employee) request.getAttribute("employee");%>
ID : <%=employee.getId()%><br>
Name : <%=employee.getName()%>
</body>
</html>
