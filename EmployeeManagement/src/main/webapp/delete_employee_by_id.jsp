<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Employee by ID</title>
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
        #emp_id{
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
    <center><h2><strong>Delete Employee by ID</strong></h2>
    
   <div class="container">
   
    <form action="deleteEmployeeById" method="post">
      <h3><label for="emp_id" >Enter Employee ID:</label></h3>  
        <input type="text" id="emp_id" name="emp_id" required placeholder="Enter the EmployeeId"><br><br>
        <input type="submit" value="Delete Employee">
    </form>

   <h3><center><% String message = (String) request.getAttribute("message");
       if (message != null) { %>
        <p><%= message %></p>
    <% } %></center></h3> 
        </div>
</body>
</html>