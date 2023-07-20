<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>ProductApp</title>
</head>
<body class="" style="background-image: radial-gradient(#e6ebef, #1c87c9, #8ebf42);">

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-12 offset-md-0">
				<div class="card">
					<div class="card-body">
						<h1 class="text-center">Welcome to Product App</h1>
						<table class="table">
							<thead class="thead-dark">
								<tr>
									<th scope="col">ID</th>
									<th scope="col">ProductName</th>
									<th scope="col">ProductDescription</th>
									<th scope="col">ProductPrice</th>
									<th scope="col">ProductQunatity</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${products }" var="p">
									<tr>
										<th scope="row">${p.id }</th>
										<td>${p.productname }</td>
										<td>${p.description }</td>
										<td>&#x20b9; ${p.price }</td>
										<td>${p.quantity }</td>
										<td><a href="delete/${p.id }" class="btn btn-danger">Delete</a>
											<a href="update/${p.id }" class="btn btn-info">Update</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="text-center">
							<a href="addproduct" class="btn btn-outline-success">AddProduct</a>
						</div>
</body>
</html>