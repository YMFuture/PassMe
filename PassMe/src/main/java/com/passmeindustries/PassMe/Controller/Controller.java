package com.passmeindustries.PassMe.Controller;

import com.passmeindustries.PassMe.Controller.dto.UserDto;
import com.passmeindustries.PassMe.Service.UserService;
import com.passmeindustries.PassMe.User;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Controller {

    private UserService userService;

    @GetMapping("/getresponse")
    public String getResponse(){
        return "I am alive";
    }

    @GetMapping(value = "/getresponse/{id}")
    @ResponseBody
    public UserDto getUser(@PathVariable("id") long id){
        User user = userService.getUser(id);
        return new UserDto(user.getId(), user.getUsername());
    }
}
