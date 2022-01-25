<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<body>

<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th></tr>  
  
   <tr>  
   <td>${empBean.id}</td>  
   <td>${empBean.name}</td>  
   <td>${empBean.salary}</td>  
   <td>${empBean.designation}</td>  
   </tr>  
  
</table> 
</body> 
</html>
