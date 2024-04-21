package com.example.lesson.modules;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, String> {
    public Lesson findByName(String name);
}
