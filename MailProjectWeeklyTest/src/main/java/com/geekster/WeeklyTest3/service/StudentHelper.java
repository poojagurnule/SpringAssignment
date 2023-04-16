package com.geekster.WeeklyTest3.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"CustomConfigurationTeacher"})

public class StudentHelper {

    @Bean
    public static Student getStudent(){
        return new Student("Pooja",18);
    }



}

