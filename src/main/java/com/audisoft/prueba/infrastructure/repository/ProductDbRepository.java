package com.audisoft.prueba.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.audisoft.prueba.infrastructure.entity.ProductEntity;


@Repository
public interface ProductDbRepository extends JpaRepository<ProductEntity,Long> {
	
	
}
