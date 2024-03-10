package com.audisoft.prueba.infrastructure;

import java.util.ArrayList;
import java.util.List;

import com.audisoft.prueba.application.service.ProductService;
import com.audisoft.prueba.infrastructure.dto.ProductDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audisoft.prueba.domain.Product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	ModelMapper modelMapper = new ModelMapper();
	
	@GetMapping("/product/{id}")
	public ResponseEntity<ProductDto> getUserById(@PathVariable Long id) {
		return new ResponseEntity<>(modelMapper.map((productService.getProduct(id)), ProductDto.class), HttpStatus.OK);
	}

	@PostMapping("/product")
	public ResponseEntity<ProductDto> saveUser(@RequestBody ProductDto productDto) {
		productService.saveProduct(modelMapper.map(productDto, Product.class));
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> getProducts() {
		List<Product> pe = productService.getAllProduct();
		List<ProductDto> p = new ArrayList<ProductDto>();
		pe.forEach(pep-> p.add(modelMapper.map(pep, ProductDto.class)));
		return new ResponseEntity<>(p, HttpStatus.OK);
	}
	
}
