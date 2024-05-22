package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.daoimpl.DAOImpl;
import com.model.Employee;

@WebServlet("/showEmployeeById")
public class ShowEmployeeByIdServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeDAO employeeDAO = new DAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int empId = Integer.parseInt(request.getParameter("empId"));
        Employee employee = employeeDAO.showEmployeebyId(empId);
        request.setAttribute("employee", employee);
        request.getRequestDispatcher("show_employee_by_id.jsp").forward(request, response);
    }
}