package com.bitlogic.example.productsupplier.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Product {
	
	@Id
	private int product_id;
	private String product_name;
	private String product_description;
	private float product_price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Supplier supplier;
	
	

}
