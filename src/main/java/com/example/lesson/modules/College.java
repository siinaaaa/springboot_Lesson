package com.example.lesson.modules;

import jakarta.persistence.*;

import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table
public class College {
    @Id
    @Size(min = 5, max = 48)
    private String nameOfcollege;
    @OneToOne(mappedBy = "college1")
    private Teacher teacher;
    @OneToMany(mappedBy = "college")
    private List<Teacher>teachers;
    @OneToMany(mappedBy = "college")
    private List<Lesson>lessons;

    public List<Lesson> getLessons() {
        return lessons;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public String getNameOfcollege() {
        return nameOfcollege;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void setNameOfcollege(String nameOfcollege) {
        this.nameOfcollege = nameOfcollege;
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

}
