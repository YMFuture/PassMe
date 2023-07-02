package com.passmeindustries.PassMe.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/getresponse")
    public String getResponse(){
        return "I'm alive!";
    }
}
