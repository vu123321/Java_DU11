package com.example.studentmanagement.service;

import com.example.studentmanagement.dto.StudentDto;
import com.example.studentmanagement.entity.Course;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.entity.StudentCourse;
import com.example.studentmanagement.reponsitory.CourseRepository;
import com.example.studentmanagement.reponsitory.StudentCourseRepository;
import com.example.studentmanagement.reponsitory.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Student create(Student data) {
        return studentRepository.save(data);
    }

    @Override
    public Student update(Integer id, StudentDto data) {
        Optional<Student> exist = studentRepository.findById(id);
        if (!exist.isPresent()) {
            throw new RuntimeException("No data");
        }
        Student s = modelMapper.map(data, Student.class);
        s.setId(exist.get().getId());
        return studentRepository.save(s);
    }

    @Override
    public String deleteById(Integer id) {
        Optional<Student> exit = studentRepository.findById(id);
        if (!exit.isPresent()) {
            throw new RuntimeException("khong tim thay ban ghi nao trong CSDL");
        }
        studentRepository.deleteById(id);
        return "Xoa thanh cong";
    }

    @Override
    public Page<Student> getAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Student getById(Integer id) {
        Optional<Student> exist = studentRepository.findById(id);
        if (!exist.isPresent()) {
            throw new RuntimeException("khong tim thay ban ghi trong CSDL");
        }
        Student student = exist.get();
        return studentRepository.getById(student.getId());
    }

    public int getStudentByCourseId(Integer courseId) {
        Optional<Course> exist = courseRepository.findById(courseId);
        if (!exist.isPresent()) {
            throw new RuntimeException("no data");
        }
        List<StudentCourse> studentCourses = studentCourseRepository.findByCourseId(courseId);
        return studentCourses.size();
    }

    public int getCourseByStudentId(Integer studentId) {
        Optional<Student> exist = studentRepository.findById(studentId);
        if (!exist.isPresent()) {
            throw new RuntimeException("No Data");
        }
        List<StudentCourse> studentList = studentCourseRepository.findByStudentId(studentId);

        return studentList.size();
    }
}
