package com.example.lesson.modules;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College, String> {
   public College findByTeachers(Teacher teacher);
   public College findByNameOfcollege(String nameOfcollege);

}
