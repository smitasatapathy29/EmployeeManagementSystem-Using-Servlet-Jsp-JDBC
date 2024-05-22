<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Employee</title>
    <style>
        .container {
            background-color: #9bb0fa;
            width: 50%;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid black;
            border-radius: 5px;
        }

        #text {
            width: 90%;
            margin: auto;
            padding: 10px;
            border: 1px solid black;
        }

        input[type="submit"] {
            background-color: white;
            font-size: medium;
            width: 20%;
            margin: auto;
            padding: 5px;
            border: 2px solid black;
            margin-left: 40%;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: black;
            color: white;
        }
    </style>
</head>
<body>
    <center><h1>Employee Information</h1></center>
    <div class="container">
        <form id="form_data" method="post" action="addEmployeeServlet" onsubmit="return validateForm()">
            <h3>Enter Your Name</h3>
            <input id="text" type="text" name="name" placeholder="Your Name"><br>
            <h3>Enter Your Employee Id</h3>
            <input id="text" type="text" name="emp_id" placeholder="Emp_id"><br>
            <h3>Enter Your Email Id</h3>
            <input id="text" type="text" name="email" placeholder="Email Id"><br>
            <h3>Enter Your Mobile Number</h3>
            <input id="text" type="number" name="mobile" placeholder="Mobile number"><br>
            <h3>Enter your gender</h3>
            <input id="text" type="text" name="gender" placeholder="Gender"><br>
            <h3>Enter your city</h3>
            <input id="text" type="text" name="city" placeholder="City"><br>
            <!-- Hidden input field for action -->
            <input type="hidden" name="action" value="add">
            <h3><input type="submit" value="Submit"></h3>
        </form>
    </div>
</body>
	<script>
function validateForm() {
    var name = document.forms["form_data"]["name"].value;
    var emp_id = document.forms["form_data"]["emp_id"].value;
    var email = document.forms["form_data"]["email"].value;
    var mobile = document.forms["form_data"]["mobile"].value;
	
    // for name
    if (name === "" || name == null || !/^[a-zA-Z ]+$/.test(name)) {
        alert("Name field can't be blank and must contain only characters");
        return false;
    }
	
    // for emp id
    if (emp_id == "" || emp_id === 0 || !/^\d+$/.test(emp_id)) {
        alert("Employee ID can't be 0 or blank and contain only numbers");
        return false;
    }
    
    // for email id
    if (email == "" || email === null || !/\S+@\S+\.\S+/.test(email)) {
        alert("Invalid Email Format or it is null");
        return false;
    }
 // for number
    if(mobile == null || mobile == "" || !/^\d{10}$/.test(mobile)){
    	alert("Invalid Mobile Number or it is Null");
    	return false;
    }
    

    return true; 
}
</script>
   
</html>
