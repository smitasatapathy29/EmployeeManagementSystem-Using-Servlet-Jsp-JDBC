<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Show Employee by ID</title>
    <style>
    .container {
        background-color: #9bb0fa;
        width: 50%; 
        margin: 0 auto; 
        padding: 20px;
        border: 1px solid black;
        border-radius: 5px;
        text-align:left;
    }
        #empId{
        width: 90%;
        margin: auto;
        padding: 10px;
        border: 1px solid black;
    }
    input[type="submit"] {
        background-color: white;
        font-size: medium;
        width: 25%;
        margin: auto;
        padding: 2px;
        border: 2px solid black;
        margin-left: 40%; /* Adjusted margin-left for better alignment */
        border-radius: 5px;
        cursor: pointer; /* Added cursor pointer on hover */
    }

    input[type="submit"]:hover {
        background-color: black;
        color: white;
    }
    </style>
</head>
<body>

   <center> <h2>Show Employee by ID</h2></center>
    <div class="container">
    <form action="showEmployeeById" method="post">
      <h3><label for="empId">Enter Employee ID:</label></h3>  
        <input type="text" id="empId" name="empId" required>
        <input type="hidden" name="action" ><br><br>
        <input type="submit" value="Show Employee">
    </form>
    <b>
    <% 
    com.model.Employee employee = (com.model.Employee) request.getAttribute("employee");
    if (employee != null) { %>
        <h3>Employee Details:</h3>
        <p>Name: <%= employee.getName() %></p>
        <p>Employee ID: <%= employee.getEmp_Id() %></p>
        <p>Email ID: <%= employee.getEmail_Id() %></p>
        <p>Mobile Number: <%= employee.getMob_No() %></p>
        <p>Gender: <%= employee.getGender() %></p>
        <p>City: <%= employee.getCity() %></p>
    <% } %></b></div>
</body>
</html>