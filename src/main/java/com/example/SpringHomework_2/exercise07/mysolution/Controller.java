package com.example.SpringHomework_2.exercise07.mysolution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/pairs/{name}")
    public NamedPairs returnAsJason(@PathVariable String name){
        NamedPairs result = new NamedPairs();
        result.setName(name);
        return result;
    }
}
