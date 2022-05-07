package com.ms.training;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
	@Id
	private String code;
	private String details;
	private int price;
	@OneToOne(mappedBy="laptop")
	private Emp emp;
	
	public Laptop(String code) {
		super();
		this.code = code;
	}

	public Laptop(String code, String details, int price) {
		super();
		this.code = code;
		this.details = details;
		this.price = price;
	}
	
	
}
