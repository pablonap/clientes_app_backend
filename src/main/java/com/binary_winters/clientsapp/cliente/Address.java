package com.binary_winters.clientsapp.cliente;

import lombok.Data;

@Data
public class Address {

	private String street;

	public Address(String street) {
		super();
		this.street = street;
	}

	public Address() {
		super();
	}
	
	
	
}
