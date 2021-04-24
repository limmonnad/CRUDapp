package com.example.demo2.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "students")
public class Student {
    //data аннотация lombok гетеры сетеры конструкторы tostring
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Transient
    private Integer age;
    @Column(name = "DOB")
    private LocalDate dob;

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }
}
