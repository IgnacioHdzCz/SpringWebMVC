<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="salvar" method = "post" modelAttribute="empleado" >
	
	<form:input path="id"/>
	Nombre
	<form:input path="nombre"/>
	Apellido Paterno
	<form:input path="apellidoP"/>
	Apellido Materno
	<form:input path="apellidoM"/>
	Tel
	<form:input path="tel"/>
	Direccion
	<form:input path="direccion"/>
	<input type = "submit" value = "salvar" />
	</form:form>

</body>
</html>