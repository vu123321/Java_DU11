package com.example.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column()
    private Integer id;

    @Column()
    private String name;

    @Column()
    private Integer age;

    @Column()
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

    @Column()
    private Integer phoneNumber;

    @Column()
    private String email;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<StudentCourse> courses = new ArrayList<>();

}
