package com.geekster.WeeklyTest3.controller;

import CustomConfigurationTeacher.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    Teacher t1;
    @GetMapping(value = "/teacher")
    public String getTeacher(){
        return t1.teach();
    }
}
