package com.ms.training;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Project {
	@Id
	private String code;
	private String name;
	@ManyToMany(mappedBy = "projects")
	private List<Emp> employees;

	public Project(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Project(String code) {
		this.code = code;

	}
}
