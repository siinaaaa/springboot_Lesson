package com.example.lesson.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private TeacherRepository teacherRepository;
    @Autowired
    public TeacherService(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }
    public Teacher sendOb(Teacher teacher){
        return this.teacherRepository.findByStaffNumberofTeacher(teacher.getStaffNumberofTeacher());
    }

}
