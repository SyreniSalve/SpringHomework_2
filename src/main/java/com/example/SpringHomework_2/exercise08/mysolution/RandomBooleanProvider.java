package com.example.SpringHomework_2.exercise08.mysolution;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomBooleanProvider {
    private final boolean value = new Random().nextBoolean();

    public boolean getValue(){
        return value;
    }
}
