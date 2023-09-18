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

import com.bitlogic.example.productsupplier.model.Supplier;
import com.bitlogic.example.productsupplier.service.SupplierService;

@RestController
public class SupplierController {
	@Autowired
	SupplierService ss;
	
	@PostMapping("/addsupp")
	public ResponseEntity<Supplier> addsupp(@RequestBody Supplier s){
		Supplier sup = ss.addsupp(s);
		return new ResponseEntity<Supplier>(sup,HttpStatus.OK);

}
	
	@GetMapping("/getallsupplier")
	public ResponseEntity<List<Supplier>> getallsupp(){
		List<Supplier> sup = ss.getallsupp();
		return new ResponseEntity<List<Supplier>>(sup,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/getsinglesupp/{supplier_id}")
	public ResponseEntity<Supplier> getsinglesupp(@PathVariable("supplier_id")int id){
		Supplier suppl = ss.getsinglesupp(id);
		return new ResponseEntity<Supplier>(suppl,HttpStatus.OK);
		
	}
	
	@PutMapping("/updatesupp")
	public ResponseEntity<Supplier> updatesupp(@RequestBody Supplier s){
		Supplier supp = ss.addsupp(s);
		return new ResponseEntity<Supplier>(supp,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deletesupp/{supplier_id}")
	public ResponseEntity<String> deletesupp(@PathVariable("/supplier_id")int sid){
		ss.deletesupp(sid);
		return new ResponseEntity<String>("supplier deleted successfully...",HttpStatus.OK);
		
	}
	}