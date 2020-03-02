package com.sysops.ayoubbellahcene;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";

    }

}