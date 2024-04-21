package com.example.lesson.modules;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table
public class Student {
    @Id
    private String studentNumber;
    @Size(max = 48)
    private String name;
    private String lastName;
    private String nationalCode;
    @OneToMany(mappedBy = "student")
    private List<Lesson>lessons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

}
