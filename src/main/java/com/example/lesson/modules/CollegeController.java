package com.example.lesson.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollegeController {
    private CollegeService collegeService;

    @Autowired
    public CollegeController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    public String createCollege(Teacher teacher, College college, List<Lesson> lessons, List<Teacher> teachers, String nameOfcollege) {
        String result = this.collegeService.createCollege(teacher, college, lessons, teachers, nameOfcollege);
        if (result.equals("true")) {
            return "true";
        }
        return "false";
    }

    public String updateCollage(String nameOfcollege, College college) {

        if (this.collegeService.updateCollage(nameOfcollege, college).equals("true")) {
            return "true";

        }
        return "false";
    }

    public String deleteCollege(College college) {
        if (this.collegeService.deleteCollege(college).equals("true")) {
            return "true";
        }
        return "false";
    }
    public College readCollege(College college){
        if(this.collegeService.readCollege(college)!=null){
            return this.collegeService.readCollege(college);
        }
        return null;
    }

}
