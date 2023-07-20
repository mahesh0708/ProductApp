<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>AddProduct</title>
</head>
<body class="" style="background-image: radial-gradient(#e6ebef, #1c87c9, #8ebf42);">

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h1 class="text-center">Fill the Product Details</h1>
						<form action="insert" method="post">
							<div class="form-group">
								<label for="id">Id</label> <input type="text"
									class="form-control" id="id" placeholder="Enter id" name="id">
							</div>
							<div class="form-group">
								<label for="productname">ProductName</label> <input type="text"
									class="form-control" id="productname"
									placeholder="Enter productname" name="productname">
							</div>
							<div class="form-group">
								<label for="description">ProductDescription</label> <input
									type="text" class="form-control" id="description"
									placeholder="Enter Desrciption" name="description">
							</div>
							<div class="form-group">
								<label for="price">Price</label> <input type="text"
									class="form-control" id="price" placeholder="Enter price"
									name="price">

							</div>
							<div class="form-group">
								<label for="quantity">Quantity</label> <input type="number"
									class="form-control" id="quantity" name="quantity" min="0">
							</div>

							<div class="text-center">
								<a href="${pageContext.request.contextPath }/"
									class="btn btn-outline-danger">Back</a>
								<button type="submit" class="btn btn-primary">Add</button>
							</div>
						</form>
</body>
</html>