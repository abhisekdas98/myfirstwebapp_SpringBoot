<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<title>Enter Todos</title>
</head>
<body>
	<div class="container">
		<h1>Enter Todos Details</h1>
		<form:form method="post" modelAttribute="todo">
           Description: <form:input type="text" path="description" />
            <form:input type="text" path="id" />
             <form:input type="text" path="done" />
			<input type="submit" class="btn btn-success">
		</form:form>
	</div>
	<script type="webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.0/jquery.min.js"></script>
</body>
</html>
