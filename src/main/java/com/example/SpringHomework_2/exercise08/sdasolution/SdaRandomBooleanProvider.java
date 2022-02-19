package com.example.SpringHomework_2.exercise08.sdasolution;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Component
@RequestScope
public class SdaRandomBooleanProvider {
    private final boolean value = new Random().nextBoolean();

    public boolean getValue(){
        return value;
    }
}
