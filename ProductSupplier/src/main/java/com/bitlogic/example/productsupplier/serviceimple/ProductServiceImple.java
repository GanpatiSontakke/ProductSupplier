package com.bitlogic.example.productsupplier.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogic.example.productsupplier.model.Product;
import com.bitlogic.example.productsupplier.repository.ProductRepository;
import com.bitlogic.example.productsupplier.service.ProductService;

@Service

public class ProductServiceImple implements ProductService {
	@Autowired
	ProductRepository pr;

	@Override
	public Product addprod(Product p) {
		Product product = pr.save(p);
		
		return product;
	}

	@Override
	public List<Product> getallprod() {
		List<Product> pro=pr.findAll();
		return pro;
	}

	@Override
	public Product getsingleprod(int id) {
		Product product = pr.findById(id);
		return product;
	}

	@Override
	public void deleteprod(int pid) {
		pr.deleteById(pid);
		
		}

}
