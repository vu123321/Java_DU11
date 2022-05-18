package com.example.studentmanagement.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    @Id
    private Integer code;
    private String description;

    @Column()
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date startDay;

    @Column()
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date endDay;

    @OneToMany(mappedBy = "course" ,fetch = FetchType.LAZY)
    List<StudentCourse> courses = new ArrayList<>();
}
