package com.passmeindustries.PassMe.Service;

import com.passmeindustries.PassMe.Repository.UserRepository;
import com.passmeindustries.PassMe.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    //encrypt password and pass User to the Persistence Layer

    @Autowired
    private UserRepository userRepository;

    public User getUser(long id) {
        //to implement -> get User from the persistence layer
        Optional<User> user = userRepository.findById(id);

        return user.get();
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
