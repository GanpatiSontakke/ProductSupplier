package com.bitlogic.example.productsupplier.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogic.example.productsupplier.model.Supplier;
import com.bitlogic.example.productsupplier.repository.SupplierRepository;
import com.bitlogic.example.productsupplier.service.SupplierService;

@Service
public class SupplierServiceImple implements SupplierService {

	
	@Autowired
	SupplierRepository sr;

	@Override
	public Supplier addsupp(Supplier s) {
		Supplier supplier = sr.save(s);
		return s;
	}

	@Override
	public List<Supplier> getallsupp() {
		
		return sr.findAll();
	}

	@Override
	public Supplier getsinglesupp(int id) {
		
		return sr.findBySupplier_id(id);
	}

	@Override
	public void deletesupp(int sid) {
		sr.deleteById(sid);
		
		
	}

}
