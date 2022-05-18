package com.example.studentmanagement.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailDto {

    private Integer id;

    private String name;

    private Integer age;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

    private Integer phoneNumber;

    private String email;
}
