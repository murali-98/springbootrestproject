package com.dxc.restapi.service;

import java.util.List;

import com.dxc.restapi.entity.Employee;
import com.dxc.restapi.exception.DatabaseEmptyException;
import com.dxc.restapi.exception.EmployeeNotFoundException;

public interface EmployeeService {
	public List<Employee> getAllEmployees() throws DatabaseEmptyException;
	public Employee saveEmployee(Employee employee);
	public Employee getEmployee(int id) throws EmployeeNotFoundException;
	public Employee deleteEmployee(int id) throws EmployeeNotFoundException;
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
	
}
