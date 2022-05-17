package com.example.studentmanagement.controller;

import com.example.studentmanagement.dto.StudentDto;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping(value = "/add")
    public ResponseEntity<Student> add(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.add(student), HttpStatus.OK);
    }


    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Student> update(@PathVariable Integer id, @RequestBody StudentDto studentDto) {
        return new ResponseEntity<>(studentService.update(id, studentDto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deletedStudent(@PathVariable Integer id) {
        return new ResponseEntity<>(studentService.deleteStudent(id), HttpStatus.OK);
    }

    @GetMapping(value = "/get")
    public ResponseEntity<List<Student>> getStudent(){
        return new ResponseEntity<>(studentService.getStudent(),HttpStatus.OK);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }
}
