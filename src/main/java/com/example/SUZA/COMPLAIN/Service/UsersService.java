package com.example.SUZA.COMPLAIN.Service;


import com.example.SUZA.COMPLAIN.Model.User;

import com.example.SUZA.COMPLAIN.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service


    public class UsersService {
        @Autowired
        private UsersRepository repository;

        public List<User> fetchUser(){
            return repository.findAll();
        }
        public User newUser(User users){
            return repository.save(users);
        }

        public User getUserById(String userId){
            return repository.findById(userId).orElse(null);
        }

        public String deleteUser(String userId){
            repository.deleteById(userId);
            return "user deleted successful"+userId;
        }

        public ResponseEntity<User> updateUser(String userId, User userDetails){
            User user = repository.findById(userId).orElse(null);
            user.setUname(userDetails.getUname());
            user.setCampus(userDetails.getCampus());
            user.setEmail(userDetails.getEmail());
            user.setDepartment(userDetails.getDepartment());
            User updateUser = repository.save(user);
            return ResponseEntity.ok(updateUser) ;
        }
    }


