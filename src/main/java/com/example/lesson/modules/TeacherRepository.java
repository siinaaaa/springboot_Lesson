package com.example.lesson.modules;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    public Teacher findByStaffNumberofTeacher(int staff);
}
