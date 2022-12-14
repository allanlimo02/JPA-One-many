package com.example.Foreign.Keys.controllers;

import com.example.Foreign.Keys.dto.OrderResponse;
import com.example.Foreign.Keys.entity.Customer;
import com.example.Foreign.Keys.repositories.ProductRepository;
import com.example.Foreign.Keys.repositories.CustomerRepository;
import com.example.Foreign.Keys.service.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class OrderController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/placeOrder")
    public Customer makeOrder(@RequestBody OrderRequest orderRequest){

        return customerRepository.save(orderRequest.getCustomer());
    }
    @GetMapping("/getOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }
    @GetMapping("/getJointInfo")
    public List<OrderResponse> getJointInfo(){
        return customerRepository.getOrderInfo();
    }
}
