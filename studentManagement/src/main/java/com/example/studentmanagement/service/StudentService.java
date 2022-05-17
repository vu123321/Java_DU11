package com.example.studentmanagement.service;

import com.example.studentmanagement.dto.StudentDto;
import com.example.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {

    Student add(Student data);
    Student update(Integer id, StudentDto studentDto);
    String deleteStudent(Integer id);
    List<Student> getStudent();
    Student getStudentById(Integer id);



}
