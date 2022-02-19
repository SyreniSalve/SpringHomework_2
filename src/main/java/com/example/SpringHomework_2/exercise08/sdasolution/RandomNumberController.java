package com.example.SpringHomework_2.exercise08.sdasolution;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RandomNumberController {

    private final SdaRandomBooleanProvider sdaRandomBooleanProvider;

    @GetMapping("/sda_api/random-boolean")
    public Boolean showFirstNumber() {
        return sdaRandomBooleanProvider.getValue(); // sda atsakymuose klaida: return randomNumberProvider.getValue();
    }
}
