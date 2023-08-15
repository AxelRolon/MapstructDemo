package com.axelduarte.mapstruckdemo.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.axelduarte.mapstruckdemo.dto.GetProduct;
import com.axelduarte.mapstruckdemo.entity.Product;
import com.axelduarte.mapstruckdemo.mapper.ProductMapper;
import com.axelduarte.mapstruckdemo.repository.ProductRepository;


@Configuration
public class TestAppMapstruct {
	
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Bean
	private CommandLineRunner testProductMapper() {
		
		return args -> {
			List<Product> products = productRepository.findAll();
			
			System.out.println("Products");
			products.forEach(System.out::println);
			
			System.out.println("Get Products");
			List<GetProduct> getProductList = productMapper.toGetProductList(products);
			getProductList.forEach(System.out::println);
			
			System.out.println("Mapped Products");
			List<Product> mappedProducts = productMapper.toGetEntityList(getProductList);
			mappedProducts.forEach(System.out::println);
		};
	}
	
}
