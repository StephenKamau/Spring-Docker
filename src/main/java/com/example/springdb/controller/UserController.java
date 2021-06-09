package com.example.springdb.controller;

import com.example.springdb.data.UserRepository;
import com.example.springdb.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/new-user")
    public @ResponseBody
    String insertUser(@RequestParam String email, @RequestParam String fullName) {
        User user = new User();
        user.setFullName(fullName);
        user.setEmail(email);
        userRepository.save(user);
        return "saved!";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
}
