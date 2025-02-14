package com.example.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByProductId(Integer productId);
}
