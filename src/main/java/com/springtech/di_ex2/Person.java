package com.springtech.di_ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    private Coffee coffee;

    public String setCoffee(){
        return "커피를 들었다." + coffee.drik();
    }
}
