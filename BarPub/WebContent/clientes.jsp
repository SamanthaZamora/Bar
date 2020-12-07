<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>

     <title>Lista Clientes</title>
     <meta charset="UTF-8">
     <link href="images/favicon.ico" rel="icon">
     <meta name="viewport" content="width=device-width, initial-scale=1">
     <meta http-equiv="X-UA-Compatible" content="IE=Edge">
     <meta name="description" content="">
     <meta name="keywords" content="">
     <meta name="author" content="">
     <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
     <link rel="stylesheet" href="css/bootstrap.min.css">
     <link rel="stylesheet" href="css/index.css">
     

</head>
<body>
     <header>
          <nav class="navbar navbar-expand-md navbar-dark"
               style="background-color: #666">
               <div>
                    <a href="https://www.javaguides.net" class="navbar-brand"> User
                         Management App </a>
               </div>
          </nav>
     </header>      
     <br>

     <div class="row">
          <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

          <div class="container">
               <h3 class="text-center">Lista de Clientess</h3>
               <hr>
               <div class="container text-left">

                    <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
                         New User</a>
               </div>
               <br>
               <table class="table table-bordered">
                    <thead>
                         <tr>
                              <th>IdCliente</th>
                              <th>nombre</th>
                              <th>apellido</th>
                              <th>direccion</th>
                              <th>telefono</th>
                              <th>cedula</th>
                              <th>cateogoria</th>
                              <th>correo</th>
                              <th>clave</th>
                              <th>Accion</th>
                         </tr>
                    </thead>
                    <tbody>
                         <!--   for (Todo todo: todos) {  -->
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
                         <!-- } -->
                    </tbody>

               </table>
          </div>
     </div>

     <div class="container text-left">

                    <a href="../html/indexAdmin.html" class="btn btn-success">Add
                         Inicio</a>
               </div>    

     <!-- SCRIPTS -->
     <script src="../js/jquery.js"></script>
     <script src="../js/bootstrap.min.js"></script>
     <script src="../js/jquery.stellar.min.js"></script>
     <script src="../js/wow.min.js"></script>
     <script src="../js/owl.carousel.min.js"></script>
     <script src="../js/jquery.magnific-popup.min.js"></script>
     <script src="../js/smoothscroll.js"></script>
     <script src="../js/custom.js"></script>

</body>
</html>