package com.dxc.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
	private int id;
	private String empName;
	private String reportManager;
	private String empRole;
	private Float salary;
}
