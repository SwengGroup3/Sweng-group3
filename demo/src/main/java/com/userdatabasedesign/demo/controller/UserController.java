package com.userdatabasedesign.demo.controller;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.userdatabasedesign.demo.entity.User;
import com.userdatabasedesign.demo.repository.UserRepository;






@RestController
@RequestMapping("/api")


public class UserController {
    @Autowired
    UserRepository userRepository;


    @PostMapping("/users")
    public String createNewGoal(@RequestBody User user)
    {
        userRepository.save(user);
        return "New user created";
    }


}
