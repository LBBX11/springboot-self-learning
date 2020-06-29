package com.lib.project.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Greetings from Spring Boot!";
    }


}
