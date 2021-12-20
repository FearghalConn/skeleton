package com.dailypay.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public Map<String, String> getExample(){
        return Collections.singletonMap("exampleKey", "example value");
    }

    // http://localhost:8080/example

}
