package com.dxc.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dxc.restapi.dto.mapper.EmployeeDtoMapper;

@SpringBootApplication
public class SpringbootRestApiApplication {
	@Autowired
    private static EmployeeDtoMapper employeeDtoMapper;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApiApplication.class, args);
		System.out.println(employeeDtoMapper);
		
	}

	 @Autowired
	 public void setEmployeeDtoMapper(EmployeeDtoMapper employeeDtoMapper) {
		 this.employeeDtoMapper = employeeDtoMapper;
	 }
}
