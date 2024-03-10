package com.audisoft.prueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.audisoft.prueba.application.repository.ProductRepository;
import com.audisoft.prueba.application.service.ProductService;

@Configuration
public class BdevStoreApplicationConfig {

	 @Bean
	  public ProductService productService(ProductRepository productREpository) {
	    return new ProductService(productREpository);
	  }

}
