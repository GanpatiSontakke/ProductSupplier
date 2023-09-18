package com.bitlogic.example.productsupplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlogic.example.productsupplier.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
	
	
	Supplier findBySupplier_id(int id);
	

}
