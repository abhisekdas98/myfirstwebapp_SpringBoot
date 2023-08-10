<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	    <link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">
		<title> ListTodos Page</title>
	</head>
	<body>
	    <div class="container">
		<div>Welcome ${username}!!!!</div>
		<h1>your todos are </h1>
		<table class="table">
		<thead>
		<tr>
		<th>Id</th>
		<th> Description </th>
		<th>Target Date</th>
		<th> Is Done </th>
		</tr>
		</thead>
		
		<tbody>
		
		<c:forEach items="${todos}" var="todo">
		<tr>
		<td>${todo.id}</td>
		<td>${todo.description} </td>
		<td>${todo.date} </td>
		<td>${todo.done}</td>
		 </tr>
		</c:forEach>
		
		</tbody>
		
		</table>
		<a href="add-todo" class="btn btn-success">Add todo</a>
		</div>
		<script type="webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.7.0/jquery.min.js"></script>
	</body>
</html>
