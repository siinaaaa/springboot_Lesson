package com.example.lesson.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController {
    private LessonService lessonService;

    @Autowired
    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    public String createLesson(Lesson lesson) {
        if (this.lessonService.createLesson(lesson).equals("true")) {
            return "true";
        }
        return "false";
    }

    public Lesson readLesson(Lesson lesson) {
        if (this.lessonService.readLesson(lesson) != null) {
            return this.lessonService.readLesson(lesson);
        }
        return null;
    }

    public String deleteLesson(Lesson lesson) {
        if (this.lessonService.deleteLesson(lesson) != null) {
            return this.lessonService.deleteLesson(lesson);
        }
        return null;
    }

    public String updateLesson(Lesson lesson) {
        if (this.lessonService.updateLesson(lesson) != null) {
            return this.lessonService.updateLesson(lesson);
        }
        return null;
    }
}
