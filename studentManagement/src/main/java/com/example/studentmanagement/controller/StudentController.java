package com.example.studentmanagement.controller;

import com.example.studentmanagement.dto.StudentDetailDto;
import com.example.studentmanagement.dto.StudentDto;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.service.StudentServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

//    200, 201
//    400, 404,
//    500
//    tim hieu them : 401, 403

    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {

        return new ResponseEntity<>(studentService.create(student), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody StudentDto studentDto) {
        int id = studentDto.getId();
        return new ResponseEntity<>(studentService.update(id, studentDto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id) {
        return new ResponseEntity<>(studentService.deleteById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllPage(@RequestParam int page,
                                                       @RequestParam int size) {

        Page<Student> studentList = studentService.getAll(PageRequest.of(page, size));

        List<StudentDto> studentDtoList = new ArrayList<>();

        for (Student student : studentList) {

            StudentDto studentDto = this.modelMapper.map(student, StudentDto.class);

            studentDtoList.add(studentDto);
        }

        return new ResponseEntity<>(studentDtoList, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<StudentDetailDto> getById(@PathVariable Integer id) {
        Student student = studentService.getById(id);
        StudentDetailDto studentDetailDto = this.modelMapper.map(student, StudentDetailDto.class);

        return new ResponseEntity<>(studentDetailDto, HttpStatus.OK);
    }
}
