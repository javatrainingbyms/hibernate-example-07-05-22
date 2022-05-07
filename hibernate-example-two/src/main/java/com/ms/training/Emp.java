package com.ms.training;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	@Id
	private int eno;
	private String name;
	private int sal;
	
	@OneToOne//(fetch=FetchType.LAZY)
	private Laptop laptop;
	
	@OneToMany(mappedBy="emp")
	private List<Account> accounts;
	
	@ManyToMany
	private List<Project> projects;
	
	public Emp(int eno, String name, int sal, Laptop laptop) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
		this.laptop = laptop;
	}
	public Emp(int eno) {
		super();
		this.eno = eno;
	}
	public Emp(int eno, String name, int sal, Laptop laptop, List<Project> projects) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
		this.laptop = laptop;
		this.projects = projects;
	}
	
}
