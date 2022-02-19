package com.example.SpringHomework_2.exercise08.mysolution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RandomBooleanController {


    @GetMapping("/random-boolean")
    public Boolean getRandomBoolean(){
        return new RandomBooleanProvider().getValue();
    }
}
