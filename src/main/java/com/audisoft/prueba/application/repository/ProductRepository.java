package com.audisoft.prueba.application.repository;

import java.util.List;

import com.audisoft.prueba.domain.Product;

public interface ProductRepository {

	public Product findById(Long id);
	
	public void saveProduct(Product product);
	
	public List<Product> getAllProduct();
	
	
}
