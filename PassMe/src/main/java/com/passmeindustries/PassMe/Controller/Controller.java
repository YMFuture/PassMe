package com.passmeindustries.PassMe.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Controller {
    @GetMapping("/getresponse")
    public String getResponse(){
        return "I am alive";
    }
}
