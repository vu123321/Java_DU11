package com.example.studentmanagement.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDto {

    private Integer id;

    private String name;

    private Integer age;


    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

    private Integer phoneNumber;

    private String email;
}
