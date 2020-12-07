<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>

     <title>Lista Clientes</title>
     <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="images/favicon.ico" rel="icon">
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="description" content="">
	<meta name="keywords" content="">
	<meta name="author" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
	<link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="css/index.css">
     

</head>
<body>
     
   <!-- PRE LOADER -->
	<section class="preloader">
		<div class="spinner">
			<span class="spinner-rotate"></span>
		</div>
	</section>


	<!-- MENU -->
	<section class="navbar custom-navbar navbar-fixed-top"
		role="navigation" style="background-color: #863636">
		<div class="container">

			<div class="navbar-header">
				<button class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon icon-bar"></span> <span class="icon icon-bar"></span>
					<span class="icon icon-bar"></span>
				</button>

				<!-- lOGO TEXT HERE -->
				<a href="principal.jsp" class="navbar-brand">London <span>.</span>Bridge</a>
			</div>

			<!-- MENU LINKS -->
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-nav-first">
					<li><a href="principal.jsp" class="smoothScroll">Home</a></li>
					<li><a href="indexAdm.jsp#about" class="smoothScroll">About</a></li>
					<li><a href="indexAdm.jsp#team" class="smoothScroll">Events</a></li>
					<li><a href="indexAdm.jsp#menu" class="smoothScroll">Menu</a></li>
					<li><a href="indexAdm.jsp#contact" class="smoothScroll">Contact</a></li>
					<li><a href="clientes.jsp" class="smoothScroll">Clientes</a></li>
                    <li><a href="empleados.jsp" class="smoothScroll">Empleados</a></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<svg width="3em" height="3em" viewBox="0 0 16 16" class="bi bi-person-circle" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="color:#2857B7">
                      <path d="M13.468 12.37C12.758 11.226 11.195 10 8 10s-4.757 1.225-5.468 2.37A6.987 6.987 0 0 0 8 15a6.987 6.987 0 0 0 5.468-2.63z"/>
                      <path fill-rule="evenodd" d="M8 9a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
                      <path fill-rule="evenodd" d="M8 1a7 7 0 1 0 0 14A7 7 0 0 0 8 1zM0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8z"/>
                    </svg>
				</ul>
			</div>

		</div>
	</section>
     
     <br><br><br><br><br><br>
     <div class="row">
          <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

          <div class="container">
               <h3 class="text-center">Lista de Clientes</h3>
               <hr>
               <br>
               <table class="table table-bordered">
                    <thead>
                         <tr>
                              <th>Id</th>
                              <th>Nombre</th>
                              <th>Apellido</th>
                              <th>Dirección</th>
                              <th>Telefono</th>
                              <th>Cédula</th>
                              <th>Email</th>
                              <th>Acctions</th>
                         </tr>
                    </thead>
                    <tbody>
                         <c:forEach var="user" items="${listUser}">
                              <tr>
                                   <td><c:out value="${user.idEmpleado}" /></td>
                                   <td><c:out value="${user.nombre}" /></td>
                                   <td><c:out value="${user.apellido}" /></td>
                                   <td><c:out value="${user.direccion}" /></td>
                                   <td><c:out value="${user.telefono}" /></td>
                                   
                                    <td><c:out value="${user.cedula}" /></td>
                                   <td><c:out value="${user.cateogoria}" /></td>
                                   <td><c:out value="${user.correo}" /></td>
                                    <td><c:out value="${user.clave}" /></td>
                                  
                                   <td><a href="edit?id=<c:out value='${user.id}' />">Edit</a>
                                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                                        href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
                              </tr>
                         </c:forEach>
                    </tbody>
               </table>
          </div>
     </div>
  

     <!-- SCRIPTS -->
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.stellar.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/smoothscroll.js"></script>
	<script src="js/custom.js"></script>

</body>
</html>