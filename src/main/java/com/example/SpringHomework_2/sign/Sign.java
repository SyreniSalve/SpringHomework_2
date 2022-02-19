package com.example.SpringHomework_2.sign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sign {

    @GetMapping("")
    public String toShowSign(){
        return ">>>>>>";
    }
}
