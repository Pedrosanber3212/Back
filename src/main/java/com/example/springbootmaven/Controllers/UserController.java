package com.example.springbootmaven.Controllers;

import com.example.springbootmaven.Entities.User;
import com.example.springbootmaven.Repositories.UserRepository;
import com.example.springbootmaven.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/userRegister")
    public User createUser(@RequestBody User user) {
    if(userService.isUserCreated(user)){
        return new ResponseEntity<>("Usuario ya creado", HttpStatus.BAD_REQUEST);    }

    }

}
