package org.example.controller;

import org.example.domain.Student;
import org.example.service.StudentService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        WebApplicationContext wac = null;
        ServletContext context = getServletContext();
        wac = WebApplicationContextUtils.getWebApplicationContext(context);
        System.out.println("容器信息" + wac);
        StudentService myService = (StudentService) wac.getBean("myService");
        Student student = new Student();
        student.setId(Integer.valueOf(id));
        student.setName(name);
        student.setEmail(email);
        student.setAge(Integer.parseInt(age));
        myService.addStudent(student);
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}
