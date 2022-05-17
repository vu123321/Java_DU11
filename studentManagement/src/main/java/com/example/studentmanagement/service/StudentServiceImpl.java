package com.example.studentmanagement.service;

import com.example.studentmanagement.dto.StudentDto;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.reponsitory.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Student add(Student data) {
        return studentRepository.save(data);
    }

    @Override
    public Student update(Integer id, StudentDto data) {
        Optional<Student> exist = studentRepository.findById(id);
        if (!exist.isPresent()) {
                throw new RuntimeException("No data");
        }
        Student s = modelMapper.map(data,Student.class);
        s.setId(exist.get().getId());
        return studentRepository.save(s);
    }

    @Override
    public String deleteStudent(Integer id) {
        Optional<Student> exit = studentRepository.findById(id);
        if (!exit.isPresent()) {
            throw new RuntimeException("khong tim thay ban ghi nao trong CSDL");
        }
        studentRepository.deleteById(id);
        return "Xoa thanh cong";
    }

    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> exist = studentRepository.findById(id);
        if (!exist.isPresent()) {
            throw new RuntimeException("khong tim thay ban ghi trong CSDL");
        }
        Student student = exist.get();
        return studentRepository.getById(student.getId());
    }
}
