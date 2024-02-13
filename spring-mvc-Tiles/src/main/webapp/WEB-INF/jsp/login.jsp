<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<body>
<head>  
<style>  
.error{color:red}  
</style>  
</head>   
 
<form:form action="loginagain" modelAttribute="student">  
Name: <form:input path="name"/> <br><br>
<p>Password must be contains any special char</p>  
Password: <form:input path="password"/>    
RollNum: <form:input path="rollNum"/>    
Place: <form:input path="place"/>    
Age: <form:input path="age"/>
<form:errors path="age" cssClass="error"/><br><br>
 
<input type="submit" value="submit">  
</form:form>  

</body>
</html>