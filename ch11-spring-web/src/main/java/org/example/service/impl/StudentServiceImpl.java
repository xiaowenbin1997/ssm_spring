package org.example.service.impl;

import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.example.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        System.out.println("StudentServiceImpl的set注入");
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentDao.findAllStudents();
        return students;
    }
}
