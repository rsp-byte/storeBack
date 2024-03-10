package com.audisoft.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.audisoft.prueba")
@EntityScan(basePackages = "com.audisoft.prueba.domain")
public class BdevStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdevStoreApplication.class, args);
	}

}
