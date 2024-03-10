package com.audisoft.prueba.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.audisoft.prueba.application.repository.ProductRepository;
import com.audisoft.prueba.domain.Product;
import com.audisoft.prueba.infrastructure.entity.ProductEntity;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ProductDbRepsository implements ProductRepository{

	private final ProductDbRepository productDbRepository;
	
	
	
	@Override
	public Product findById(Long id) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(productDbRepository.findById(id), Product.class);
	}

	@Override
	public void saveProduct(Product product) {
		ModelMapper modelMapper = new ModelMapper();
		productDbRepository.save(modelMapper.map(product, ProductEntity.class));
	}

	@Override
	public List<Product> getAllProduct() {
		ModelMapper modelMapper = new ModelMapper();
		List<ProductEntity> pe = productDbRepository.findAll();
		List<Product> p = new ArrayList<Product>();
		pe.forEach(pep-> p.add(modelMapper.map(pep, Product.class)));
		return p;
	}

}
