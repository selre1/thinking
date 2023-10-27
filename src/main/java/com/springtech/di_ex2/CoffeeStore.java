package com.springtech.di_ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeStore {

    //TODO 사람이 커피를 마실 수 있도록 문제 해결!
    // 어느커피든 상관 없음
    // 힌트: @Qualifier
    // 접속 => localhost:8080/
    // => "커피를 들었다. 폴바셋을 마시다"

    @GetMapping("/")
    public String store(){
        //TODO  작성
        return null;
    }
}
