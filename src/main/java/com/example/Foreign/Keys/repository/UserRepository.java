package com.example.Foreign.Keys.repository;

import com.example.Foreign.Keys.entity.Customer;
import com.example.Foreign.Keys.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserRepository {
    @Autowired
    CustomerRepository customerRepository;

    //adding user
    public Customer addUser(Customer customer){
        return customerRepository.save(customer);
    }
    //addingseveral users
    public List<Customer> addusers(List<Customer> customers){
        return customerRepository.saveAll(customers);
    }
    //find all users
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

}
