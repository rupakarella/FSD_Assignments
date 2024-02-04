<%@page import="java.util.*, com.hexaware.springbootweb.entity.Employee"%>
<h1>DisplayAll</h1>
<%

List<Employee> list =(List<Employee>)session.getAttribute("empList");
out.println(list);

%>