<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pantalla Empleado</title>
</head>
<body>
	<div align="center">
		<h1>Lista Empleado</h1>

		<table border="1">
			<th>Nombre</th>
			<th>Apellido Paterno</th>
			<th>Apellido Materno</th>
			<th>Direccion</th>
			<th>Telefono</th>
			<th>Accion</th>

			<c:forEach var="empleado" items="${listaEmpleado}">
				<tr>
					<td>${empleado.id}</td>
					<td>${empleado.nombre}</td>
					<td>${empleado.apellidoP}</td>
					<td>${empleado.apellidoM}</td>
					<td>${empleado.tel}</td>
					<td>${empleado.direccion}</td>
					<td><a href="actualizar?id=${empleado.id}">Editar</a> 
					<a href="borrar?id=${empleado.id}">Borrar</a></td>
				</tr>
			</c:forEach>
		</table>

		<h4>
			Nuevo Empleado <a href="agregar">Agregar</a>
		</h4>
	</div>
</body>
</html>