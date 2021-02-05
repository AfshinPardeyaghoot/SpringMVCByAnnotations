<%@ page import="java.util.List" %>
<%@ page import="maktab.Entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2/5/2021
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Employee</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <% List<Employee> employees = (List<Employee>) request.getAttribute("employee");
        for (Employee employee:
             employees) {%>
        <tr>
            <td><%=employee.getId()%></td>
            <td><%=employee.getName()%></td>
        </tr>
    <%}%>
</table>
</body>
</html>
