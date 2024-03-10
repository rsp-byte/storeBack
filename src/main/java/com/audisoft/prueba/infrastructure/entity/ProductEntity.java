package com.audisoft.prueba.infrastructure.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name ="products")
public class ProductEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
	
    @Column(name="description")
	private String description;
    
    @Column(name="price")
	private double price;
    
    @Column(name="picture")
	private String picture;

}
