package com.example.lesson.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    private final CollegeRepository collegeRepository;

    @Autowired
    public CollegeService(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    //add manager for college with condition
    public String createCollege(Teacher teacher, College college, List<Lesson> lessons, List<Teacher> teachers, String nameOfcollege) {
        if (nameOfcollege.length() < 48 && nameOfcollege.length() > 5) {
            college.setNameOfcollege(nameOfcollege);
        } else {
            return "";
        }
        if (collegeRepository.findByTeachers(teacher) != null) {
            college.setTeacher(teacher);
            college.setLessons(lessons);
            college.setTeachers(teachers);
            collegeRepository.save(college);
            return "true";
        } else {
            return "false";
        }
    }

    public String updateCollage(String nameOfcollege, College college) {
        if (collegeRepository.findByNameOfcollege(nameOfcollege) != null) {
            collegeRepository.deleteById(nameOfcollege);
            collegeRepository.save(college);
            return "true";
        }
        return "false";

    }

    public String deleteCollege(College college) {
        if (collegeRepository.findByNameOfcollege(college.getNameOfcollege()) != null) {
            collegeRepository.deleteById(college.getNameOfcollege());
            return "true";
        }
        return "false";

    }

    public College readCollege(College college) {
        if (collegeRepository.findByNameOfcollege(college.getNameOfcollege()) != null) {
            return collegeRepository.findByNameOfcollege(college.getNameOfcollege());

        }
        return null;
    }


}