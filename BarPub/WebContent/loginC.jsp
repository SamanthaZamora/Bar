<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
		<title>Login</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!--===============================================================================================-->
    	<link href="images/favicon.ico" rel="icon">
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css"
			href="vendor/bootstrap/css/bootstrap.min.css">
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css"
			href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css"
			href="vendor/css-hamburgers/hamburgers.min.css">
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css"
			href="vendor/select2/select2.min.css">
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css" href="css/login.css">
		<!--===============================================================================================-->
		<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="images/about-image.jpg" alt="IMG">
				</div>

				<form class="login100-form validate-form"
					action="${pageContext.request.contextPath}/ClienteServlet?action=/login"
					method="post">
					<span class="login100-form-title"> LOGIN </span>

					<div class="wrap-input100 validate-input"
						data-validate="Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="email" value="<c:out value='${Cliente.email}' />"
							placeholder="Email"> <span class="focus-input100"></span>
						<span class="symbol-input100"> </span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="clave" value="<c:out value='${Cliente.clave}' />"
							placeholder="Password"> <span class="focus-input100"></span>
						<span class="symbol-input100"> </span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">Login</button>
						 </div>

					<br>
					
					<br>
					<div class="text-center p-t-136">
						<center>
							<p class="parrafos"><a href="registroC.jsp">Create your Account</a></p>
							<!-- <a class="txt2" href="registroC.jsp"> Create your Account</a> -->
							
							<p class="parrafos"><a href="opciones.jsp">Regresar</a></p>
						</center>
					</div>
				</form>
			</div>
		</div>
	</div>




	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/tilt/tilt.jquery.min.js"></script>
	<script>
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>
	<!--===============================================================================================-->
	<script src="js/main.js"></script>
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>