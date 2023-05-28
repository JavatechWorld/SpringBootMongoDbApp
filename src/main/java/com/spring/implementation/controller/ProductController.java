package com.spring.implementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.implementation.model.Products;
import com.spring.implementation.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository productRepo;
	
	@PostMapping("/save")
	public Products saveProducts(@RequestBody Products product) {
		return productRepo.save(product);
	}
}
