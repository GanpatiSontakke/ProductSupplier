package com.bitlogic.example.productsupplier.service;

import java.util.List;

import com.bitlogic.example.productsupplier.model.Product;

public interface ProductService {

	Product addprod(Product p);

	List<Product> getallprod();

	Product getsingleprod(int id);

	void deleteprod(int pid);

}
