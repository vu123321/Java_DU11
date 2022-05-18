package com.example.studentmanagement.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Integer id;

    private String name;

    private Integer age;

}
