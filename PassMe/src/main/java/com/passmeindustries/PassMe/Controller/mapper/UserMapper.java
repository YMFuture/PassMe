package com.passmeindustries.PassMe.Controller.mapper;

import com.passmeindustries.PassMe.Controller.dto.UserCreationDto;
import com.passmeindustries.PassMe.Controller.dto.UserDto;
import com.passmeindustries.PassMe.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user){
        long id = user.getId();
        String username = user.getUsername();

        return new UserDto(id, username);
    }

    public User toUser(UserCreationDto user){
        String username = user.getUsername();
        String password = user.getPassword();

        return new User(username, password);
    }
}
