package com.cyborg.dev.hello_world;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpring {


    @GetMapping("/")
    public String GetHello(){

        return "hello";
    }
}
