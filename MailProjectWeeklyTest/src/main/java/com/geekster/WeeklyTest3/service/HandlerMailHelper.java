package com.geekster.WeeklyTest3.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HandlerMailHelper {

    @Bean
    public HandleMail getHandleMail(){
        return new HandleMail();
    }
}
