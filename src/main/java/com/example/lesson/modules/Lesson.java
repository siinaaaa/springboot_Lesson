package com.example.lesson.modules;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import javax.validation.constraints.Size;

@Entity
@Table
public class Lesson {
    @Id
    @Size(max = 64)
    private String name;
    private int tedadOfvahed;
    @ManyToOne
    private College college;
    @ManyToOne
    private Teacher teacher;
    @ManyToOne
    private Student student;

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTedadOfvahed() {
        return tedadOfvahed;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTedadOfvahed(int tedadOfvahed) {
        this.tedadOfvahed = tedadOfvahed;
    }

}
