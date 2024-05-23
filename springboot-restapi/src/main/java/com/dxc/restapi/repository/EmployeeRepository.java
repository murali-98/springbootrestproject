package com.dxc.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.restapi.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
