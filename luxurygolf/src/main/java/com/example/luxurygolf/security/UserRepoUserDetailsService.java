package com.example.luxurygolf.security;

import com.example.luxurygolf.domain.User;
import com.example.luxurygolf.services.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserRepoUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public UserRepoUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findUsersByUsername(s);
        if(user != null)
            return user;
        throw new UsernameNotFoundException("User " + s + "not found");
    }
}
