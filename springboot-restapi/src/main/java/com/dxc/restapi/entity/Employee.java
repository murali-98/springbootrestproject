package com.dxc.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	private int id;
	private String empName;
	private String reportManager;
	private String empRole;
	private Float salary;
	
	
}
