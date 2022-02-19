package com.example.SpringHomework_2.exercise07.sdasolution;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/sda_api/sda_pairs")
@RequiredArgsConstructor
public class PairsController {

    @GetMapping("/{name}")
    public SdaNamedPairs getNamedEmptyPairs(@PathVariable final String name) {
        return SdaNamedPairs.builder()
                .name(name) // sda solution klaida: simpleName(name)
                .pairs(Map.of())
                .build();
    }
}
