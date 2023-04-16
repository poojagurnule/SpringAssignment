package com.geekster.WeeklyTest3.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;



@Data
@AllArgsConstructor
public class Student {
    String name;
    int rollNo;



    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        sb.append(this.rollNo);
        return sb.toString();
    }
}
