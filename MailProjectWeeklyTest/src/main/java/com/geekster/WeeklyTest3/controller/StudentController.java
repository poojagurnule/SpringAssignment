package com.geekster.WeeklyTest3.controller;

import com.geekster.WeeklyTest3.service.HandleMail;
import com.geekster.WeeklyTest3.service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
//  It will search the object of student in IOC Containers scanned by @ComponentScan annotations in @SpringBootApplication annotation
    Student s1;

    @Autowired
//   It will search the object of HandleMail in IOC Containers
    HandleMail h1;



    @GetMapping(value = "/student")
    public Student getStudent(){
        System.out.println("The application is supposed to send mails");
        h1.sendMail();
        System.out.println("Mail send successfully ");


        return s1;
    }
}
