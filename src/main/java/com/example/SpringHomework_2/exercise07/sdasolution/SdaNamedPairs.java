package com.example.SpringHomework_2.exercise07.sdasolution;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SdaNamedPairs {

    private String name;
    private Map<String, String> pairs;
}
