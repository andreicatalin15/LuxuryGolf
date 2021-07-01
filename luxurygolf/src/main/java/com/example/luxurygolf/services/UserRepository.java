package com.example.luxurygolf.services;

import com.example.luxurygolf.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findUsersByUsername(String username);
}
