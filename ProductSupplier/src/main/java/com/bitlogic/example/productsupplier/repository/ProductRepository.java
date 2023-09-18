package com.bitlogic.example.productsupplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlogic.example.productsupplier.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
Product findById(int id);
}
