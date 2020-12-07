<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="images/favicon.ico" rel="icon">
	<title>Registro Cliente</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/registro.css">
</head>
<body>
	<form class="form-register" action="${pageContext.request.contextPath}/ClienteServlet?action=/insert" method="post">
		    <h4>FORMULARIO DE REGISTRO</h4>
		    
		    <input class="controls" type="text" name="nombre" id="nombre" placeholder=" Nombre" value="<c:out value='${Cliente.nombre}' />">
		    <input class="controls" type="text" name="apellido" id="apellido" placeholder=" Apellido" value="<c:out value='${Cliente.apellido}' />"> 
		    <input class="controls" type="text" name="cedula" id="cedula" placeholder="Cédula" value="<c:out value='${Cliente.cedula}' />">
		    <input class="controls" type="text" name="direccion" id="direccion" placeholder="Dirección" value="<c:out value='${Cliente.direccion}' />">
		    <input class="controls" type="text" name="telefono" id="telefono" placeholder="Telefono" value="<c:out value='${Cliente.telefono}' />">
		    <input class="controls" type="email" name="email" id="email" placeholder="Email" value="<c:out value='${Cliente.email}' />">
		    <input class="controls" type="password" name="clave" id="clave" placeholder="Password" value="<c:out value='${Cliente.clave}' />">
		    <p> <b>Estoy de acuerdo con</b> <a href="#">Terminos y Condiciones</a></p>
		    <input class="botons" type="submit" value="Registrar">
		    <p><a href="loginC.jsp">¿Ya tengo Cuenta?</a></p> 
		    <p><a href="opciones.jsp">Regresar</a></p>
	  </form>
	  
	  <br><br>
		<script src="js/jquery.js"></script>
		<script src="js/main.js"></script>
		<script src="sjs/bootstrap.min.js"></script>
</body>
</html>