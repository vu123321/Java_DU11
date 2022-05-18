package com.example.studentmanagement.reponsitory;

import com.example.studentmanagement.entity.Course;
import com.example.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {


}
