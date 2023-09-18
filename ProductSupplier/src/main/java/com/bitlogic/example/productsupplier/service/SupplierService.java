package com.bitlogic.example.productsupplier.service;

import java.util.List;

import com.bitlogic.example.productsupplier.model.Supplier;

public interface SupplierService {

	Supplier addsupp(Supplier s);

	List<Supplier> getallsupp();

	Supplier getsinglesupp(int id);

	void deletesupp(int sid);

	

}
