package com.example.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Student")
public class Student {


    // Student (name, age, date of birth, phone number, email).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "date_of_birth")

    @JsonFormat(pattern = "dd/MM/yyyy ")
    private Date dateOfBirth;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "email")
    private String email;


}
