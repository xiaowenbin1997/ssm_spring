package org.example.dao;

import org.example.domain.Student;
import org.example.service.StudentService;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> findAllStudents();
}
