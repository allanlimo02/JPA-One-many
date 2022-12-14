package com.example.Foreign.Keys.controllers;

import com.example.Foreign.Keys.entity.Customer;
import com.example.Foreign.Keys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    //newUser
    @PostMapping("/adduser")
    public Customer addusers(@RequestBody Customer customer){
        return userRepository.addUser(customer);
    }
    @PostMapping("/addusers")
    public List<Customer> addusers(@RequestBody List<Customer> customers){
        return userRepository.addusers(customers);
    }
    @GetMapping("/getusers")
    public List<Customer> getusers(){
        return userRepository.getAll();
    }
}
