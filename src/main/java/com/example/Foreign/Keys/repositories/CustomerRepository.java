package com.example.Foreign.Keys.repositories;

import com.example.Foreign.Keys.dto.OrderResponse;
import com.example.Foreign.Keys.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.example.Foreign.Keys.dto.OrderResponse(c.name,p.productName)FROM Customer c JOIN c.product p")
     List<OrderResponse> getOrderInfo();
}
