package com.passmeindustries.PassMe.Repository;

import com.passmeindustries.PassMe.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findById(Long id);
}
