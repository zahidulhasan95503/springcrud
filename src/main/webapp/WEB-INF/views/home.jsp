<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp" %>

</head>
<body>
<div class = "container mt-3">
<h1 class="text-center md-4 ">Welcome To Product App</h1>
<div class = "container">
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Product name</th>
      <th scope="col">description</th>
      <th scope="col">price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${product}" var="p">
    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.name}</td>
      <td>${p.description}</td>
      <td class = "font-weight-bold">&#8377; ${p.price}</td>
      <td>
      <a href="deleteproduct/${p.id}"><i class="fa-solid fa-trash-can text-danger"style="font-size: 30px;"></i></a>
      <a href="updateproduct/${p.id}"><i class="fa-solid fa-pen-nib text-primary"style="font-size: 30px;"></i></a>
      </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="container text-center">

<a href="add-product" class = "btn btn-outline-success">Add Product</a>

</div>
</div>

</div>
</body>
</html>