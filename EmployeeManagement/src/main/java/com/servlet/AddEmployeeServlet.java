package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.daoimpl.DAOImpl;
import com.model.Employee;

@WebServlet("/addEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
    
    private EmployeeDAO employeeDAO = new DAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        addEmployee(request, response);
    }

    private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int empId = Integer.parseInt(request.getParameter("emp_id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        long mobile = Long.parseLong(request.getParameter("mobile"));
        String gender = request.getParameter("gender");
        String city = request.getParameter("city");
        
        Employee employee = new Employee(name, empId, email, mobile, gender, city);
        
        int result = employeeDAO.insertEmployee(employee);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        if (result > 0) {
            out.println("<center><h1>Employee added successfully</h1><center>");
        } else {
            out.println("<h2>Failed to add employee</h2>");
        }
    }
}