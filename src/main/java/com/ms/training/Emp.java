package com.ms.training;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")
public class Emp {
	@Id
	@Column(name="empid")
	private int eno;
	@Column(name="empname", nullable=false)
	private String name;
	@Column(name="salary")
	private int sal;
	@Column(name="designation", length=20)
	private String desg;
	@Column(name="department")
	private String dept;
}
