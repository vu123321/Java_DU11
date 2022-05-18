package com.example.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@Table
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "student_id")
    private Integer studentId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "student_id", updatable = false, insertable = false)
    private Student student;

    @Column(name = "course_id")
    private Integer courseId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "course_id", updatable = false, insertable = false)
    private Course course;

}
