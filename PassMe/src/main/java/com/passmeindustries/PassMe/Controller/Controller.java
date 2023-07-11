package com.passmeindustries.PassMe.Controller;

import com.passmeindustries.PassMe.Controller.dto.UserCreationDto;
import com.passmeindustries.PassMe.Controller.dto.UserDto;
import com.passmeindustries.PassMe.Controller.mapper.UserMapper;
import com.passmeindustries.PassMe.Service.UserService;
import com.passmeindustries.PassMe.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class Controller {

    private UserService userService;
    private UserMapper userMapper;

    @Autowired
    public Controller(UserService userService, UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/getresponse")
    public String getResponse(){
        return "I am alive";
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public UserDto getUser(@PathVariable long id){
        User user = userService.getUser(id);
        return new UserDto(user.getId(), user.getUsername());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create(@RequestBody UserCreationDto userToSave){
        User user = userService.save(userMapper.toUser(userToSave));
        return new UserDto(user.getId(), user.getUsername());
    }
}
