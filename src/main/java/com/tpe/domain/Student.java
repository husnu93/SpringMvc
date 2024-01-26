package com.tpe.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
@Entity
@Table(name = "t_student")
public class Student {
    @Id//pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NotBlank(message = "Please provide first name")
    @Column(nullable = false)
    private String firstName;
    @NotEmpty(message = "Please provide Last Name") //null , ""(empty) kabul etmez

    private String lastName;
    @NotNull(message = "Where is your grade")
    private Integer grade;
    private LocalDateTime createTime= LocalDateTime.now();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirtsName() {
        return firstName;
    }

    public void setFirtsName(String firtsName) {
        this.firstName = firtsName;
    }

    public String getLaastName() {
        return lastName;
    }

    public void setLaastName(String laastName) {
        this.lastName = laastName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }


}
