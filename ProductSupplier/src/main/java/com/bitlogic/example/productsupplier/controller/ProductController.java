package com.bitlogic.example.productsupplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlogic.example.productsupplier.model.Product;
import com.bitlogic.example.productsupplier.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	
	@PostMapping("/addprod")
	public ResponseEntity<Product> addprod(@RequestBody Product p){
		Product product = ps.addprod(p);
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
		
	}
	@GetMapping("/getallprod")
	public ResponseEntity<List<Product>> getallprod(){
		List<Product> pro = ps.getallprod();
		return new ResponseEntity<List<Product>>(pro,HttpStatus.OK);
	}
	
	@GetMapping("/getsingleprod/{product_id}")
	public ResponseEntity<Product> getsingleprod(@PathVariable("product_id")int id){
		Product pr = ps.getsingleprod(id);
		return new ResponseEntity<Product>(pr,HttpStatus.OK);
	}

	@PutMapping("/updateprod")
	public ResponseEntity<Product> updateprod(@RequestBody Product pro){
		Product produ = ps.addprod(pro);
		return new ResponseEntity<Product>(produ,HttpStatus.CREATED);
	}
	@DeleteMapping("/delete/{product_id}")
	public ResponseEntity<String> deleteprod(@PathVariable("product_id")int pid){
		ps.deleteprod(pid);
		return new ResponseEntity<String>("product deleted successfully....",HttpStatus.OK);
	}
}
