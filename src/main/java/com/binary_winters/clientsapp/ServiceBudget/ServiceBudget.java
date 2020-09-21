package com.binary_winters.clientsapp.ServiceBudget;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="service")
public class ServiceBudget {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String code;

	private String name;

	private String detail;

	private double price;
	
	private Boolean optional;
	
}