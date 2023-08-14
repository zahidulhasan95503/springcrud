<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">
				<h1 class="text-center md-3">Fill the product details</h1>

				<form action="add-product" method="post">
					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							id="name" name="name" placeholder="Enter the product Name"
							class="form-control">
					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea rows="5" id="desc" name="description" class="form-control"
							placeholder="Enter the Product Description"></textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							id="price" name="price" class="form-control"
							placeholder="Enter the ProductPrice">
					</div>
					
					<div class="container text-center">
					<a href="${pageContext.request.contextPath}/"
					class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-primary">Add</button>
					</div>


				</form>

			</div>

		</div>

	</div>

</body>
</html>