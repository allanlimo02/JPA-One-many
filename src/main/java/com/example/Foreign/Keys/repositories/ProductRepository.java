package com.example.Foreign.Keys.repositories;

import com.example.Foreign.Keys.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}
