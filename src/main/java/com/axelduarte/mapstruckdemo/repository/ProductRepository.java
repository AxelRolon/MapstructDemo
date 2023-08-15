package com.axelduarte.mapstruckdemo.repository;


import com.axelduarte.mapstruckdemo.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
