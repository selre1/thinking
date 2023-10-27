package com.springtech.di_ex2;

import org.springframework.stereotype.Component;

@Component("star")
public class StarBucks implements Coffee{
    @Override
    public String drik() {
        return "스타벅스를 마시다";
    }
}
