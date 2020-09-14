<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head> 
    <title>Main Leave List</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" 
    	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
    	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
    	crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" 
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" 
		crossorigin="anonymous"></script>
		
</head>
<body>
	<h1>Doctors</h1>
	 <a href="/register">Add Doctor</a>
	 <table class="table table-striped table-hover table-dark">
	 <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Show</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
    </tr>
  	</thead>
  	<tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
  </tbody>
	</table>
	<div class="container">
    <div th:if="${not #lists.isEmpty(leave_s)}">
        
        <table class="table table-striped">
            <tr>
                <th>Id</th>
                <th>Name</th>
              
                <th>List</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <tr th:each="doctor : ${doctors}">
                <td th:text="${doctor.id}"></td>
                <td th:text="${doctor.firstName}"></td>
              
                <td><a th:href="${'/show/' + doctor.id}">View</a> </td>
                <td><a th:href="${'/edit/' + doctor.id}">Edit</a> </td>
                <td><a th:href="${'/delete/' + doctor.id}">Delete</a> </td>
            </tr>
        </table>
    </div>
</body>
</html>
