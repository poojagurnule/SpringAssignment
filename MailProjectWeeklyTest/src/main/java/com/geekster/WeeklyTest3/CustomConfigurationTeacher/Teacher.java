package com.geekster.WeeklyTest3.CustomConfigurationTeacher;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component

public class Teacher {

    public String teach(){
        return "SpringBoot teacher" ;
    }
}