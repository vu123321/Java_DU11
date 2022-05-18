package com.example.studentmanagement.reponsitory;

import com.example.studentmanagement.entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse,Integer> {
    List<StudentCourse> findByCourseId(Integer courseId);

    List<StudentCourse> findByStudentId(Integer studentId);
}
