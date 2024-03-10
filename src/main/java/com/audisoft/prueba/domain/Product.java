package com.audisoft.prueba.domain;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
	
	private Long id;
	private String description;
	private double price;
	private String picture;

}
