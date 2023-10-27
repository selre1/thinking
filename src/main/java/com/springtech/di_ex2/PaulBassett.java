package com.springtech.di_ex2;

import org.springframework.stereotype.Component;

@Component("paul")
public class PaulBassett implements Coffee{
    @Override
    public String drik() {
        return "폴바셋을 마시다";
    }
}
