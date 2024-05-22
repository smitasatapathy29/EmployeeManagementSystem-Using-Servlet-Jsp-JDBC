package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.daoimpl.DAOImpl;

@WebServlet("/deleteEmployeeById")
public class DeleteEmployeeByIdServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeDAO employeeDAO = new DAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int empId = Integer.parseInt(request.getParameter("emp_id"));
        boolean result = employeeDAO.deletEmployee(empId);
        if (result) {
            request.setAttribute("message", "<center><h1>Employee deleted successfully<h1><center>");
        } else {
            request.setAttribute("message", "Failed to delete employee");
        }
        request.getRequestDispatcher("delete_employee_by_id.jsp").forward(request, response);
    }
}