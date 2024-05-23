package com.dxc.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.restapi.entity.Employee;
import com.dxc.restapi.exception.DatabaseEmptyException;
import com.dxc.restapi.exception.EmployeeNotFoundException;
import com.dxc.restapi.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployees() throws DatabaseEmptyException {
		List<Employee> list = employeeRepository.findAll();
		if(list.size() == 0)
			 throw new DatabaseEmptyException("Database is emplty");
		return list;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp = employeeRepository.save(employee);
		return emp;
		
	}

	@Override
	public Employee getEmployee(int id) throws EmployeeNotFoundException {
		Optional<Employee> op = employeeRepository.findById(id);
		if(op.isEmpty())
			throw new EmployeeNotFoundException("Employee is not found");
		return op.get();
	}

	@Override
	public Employee deleteEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = getEmployee(id);
		employeeRepository.deleteById(id);
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		Employee emp = getEmployee(employee.getId());
		employeeRepository.deleteById(employee.getId());
		emp = employeeRepository.save(employee);
		return emp;
	}

}
