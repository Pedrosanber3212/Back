package com.example.springbootmaven.Services;

import com.example.springbootmaven.Entities.User;
import com.example.springbootmaven.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
    public Boolean deleteUser(User user) {


    }

    public boolean isUserCreated(User user){
        User u= userRepository.findByUsername(user.getUsername());
        return (u!=null);
    }
}
