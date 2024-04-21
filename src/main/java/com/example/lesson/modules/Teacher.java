package com.example.lesson.modules;

import jakarta.persistence.*;

import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table
public class Teacher {
    @Id
    private int staffNumberofTeacher;
    @ManyToOne
    private College college;
    @OneToOne
    private College college1;
    @Size(max = 48)
    private String nameOfteacher;
    private String lastNameOfteacher;
    @OneToMany(mappedBy = "teacher")
    private List<Lesson>lessons;

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public College getCollege() {
        return college;
    }

    public int getStaffNumberofTeacher() {
        return staffNumberofTeacher;
    }

    public College getCollege1() {
        return college1;
    }

    public String getLastNameOfteacher() {
        return lastNameOfteacher;
    }

    public String getNameOfteacher() {
        return nameOfteacher;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public void setCollege1(College college1) {
        this.college1 = college1;
    }

    public void setLastNameOfteacher(String lastNameOfteacher) {
        this.lastNameOfteacher = lastNameOfteacher;
    }

    public void setNameOfteacher(String nameOfteacher) {
        this.nameOfteacher = nameOfteacher;
    }

    public void setStaffNumberofTeacher(int staffNumberofTeacher) {
        this.staffNumberofTeacher = staffNumberofTeacher;
    }

}
