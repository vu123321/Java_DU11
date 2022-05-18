package com.example.studentmanagement.service;

import com.example.studentmanagement.dto.StudentDto;
import com.example.studentmanagement.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

    Student create(Student data);
    Student update(Integer id, StudentDto studentDto);
    String deleteById(Integer id);
    Page<Student> getAll(Pageable pageable);
    Student getById(Integer id);

}
