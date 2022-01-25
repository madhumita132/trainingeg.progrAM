<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Now control has come from 'EmpRequestHandlet' controller class as a returned response page of ModelAndView object
<p> Here, The 'path' attribute of 'form' tag is bound into 'employee' bean class property variables using java beans convention.
<p> When you hit on this submit button this page (EmpRegFrom.jsp) will raise another request tat is(AmpleEmployeeinfoHandeler) which will contact again the DispatcherServlet class to identify and map its respective controller class/servlet ('saveEmployeeinfoHandler')

<!-- Here, form is the spring 'prefix' tag to ma the jsp form values with Employee Bean class -->

<form:form method="POST" action="view_ret_data">

<table>
<tr> <td>Employee id:</td>
 <td><form:input path="id"/></td></tr>
 <tr> <td>Employee Name:</td>
 <td><form:input path="name"/></td></tr>
 <tr> <td>Employee Salary:</td>
 <td><form:input path="salary"/></td></tr>
 <tr> <td>Employee Designation:</td>
 <td><form:input path="designation"/></td></tr>
 <tr><td colspan="2"><input type="submit" value="Submit"/></td></tr>
</table>
</form:form>
</body>
</html>