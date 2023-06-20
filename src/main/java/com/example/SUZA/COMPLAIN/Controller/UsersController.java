package com.example.SUZA.COMPLAIN.Controller;


import com.example.SUZA.COMPLAIN.Model.User;

import com.example.SUZA.COMPLAIN.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/User")

public class UsersController {
        @Autowired
        private UsersService service;

        @GetMapping("/get")
        public List<User> fetchUser(User user){
            return  service.fetchUser();
        }
        @GetMapping("/get/{userId}")
        public User fetchById(@PathVariable String userId){
            return service.getUserById(userId);
        }
        @PostMapping("/add")
        public User newUser(@RequestBody User user){
            return service.newUser(user);
        }
        @DeleteMapping("/delete/{userId}")
        public void delete(String userId){
            service.deleteUser(userId);
        }
    }


