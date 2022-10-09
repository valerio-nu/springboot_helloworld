package com.cyborg.dev.hello_world;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpring {
    String Message;

    @GetMapping("/")
    public String GetHello(Model model){
        Message = "Hello World";
        model.addAttribute("Message", Message);

        return "hello";
    }
}
