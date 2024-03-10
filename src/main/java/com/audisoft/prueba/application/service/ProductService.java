package com.audisoft.prueba.application.service;

import java.util.List;

import org.modelmapper.ModelMapper;

import com.audisoft.prueba.application.repository.ProductRepository;
import com.audisoft.prueba.domain.Product;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RequiredArgsConstructor
@Slf4j
public class ProductService {

	private final ProductRepository productRepository;
	
	ModelMapper modelMapper = new ModelMapper();
	
	public Product getProduct(Long id){
		return productRepository.findById(id);
	}
	
	public void saveProduct(Product product){
	 productRepository.saveProduct(product);
	}
	
	public List<Product> getAllProduct(){
		 return productRepository.getAllProduct();
	}
	
	
}
