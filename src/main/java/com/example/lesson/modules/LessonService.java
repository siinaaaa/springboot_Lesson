package com.example.lesson.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    private final LessonRepository lessonRepository;
    private final TeacherService teacherService;

    @Autowired
    public  LessonService(LessonRepository lessonRepository , TeacherService teacherService){
        this.lessonRepository=lessonRepository;
        this.teacherService = teacherService;
    }

    public String createLesson(Lesson lesson){
        Teacher teacher = lesson.getTeacher();
        Teacher teacher1=teacherService.sendOb(teacher);
        List<Lesson> lessons = teacher1.getLessons();
        for(int i=0;i<lessons.size();i++){
            if(lessons.get(i).equals(lesson.getName())){
                this.lessonRepository.save(lesson);
                return "true";
            }
        }
        return "false";
    }
    public Lesson readLesson(Lesson lesson){
        if(this.lessonRepository.findByName(lesson.getName())!=null){
            return this.lessonRepository.findByName(lesson.getName());
        }
        return null;
    }
    public String deleteLesson(Lesson lesson){
        if(this.lessonRepository.findByName(lesson.getName())!=null){
            this.lessonRepository.deleteById(lesson.getName());
            return "true";
        }
        return "false";
    }
    public String updateLesson(Lesson lesson){
        if(this.lessonRepository.findByName(lesson.getName())!=null){
            this.lessonRepository.deleteById(lesson.getName());
            this.lessonRepository.save(lesson);
            return "true";
        }
        return "false";
    }
}
