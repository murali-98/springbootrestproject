package com.dxc.restapi.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dxc.restapi.exception.DatabaseEmptyException;
import com.dxc.restapi.exception.EmployeeNotFoundException;
@RestControllerAdvice
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler(DatabaseEmptyException.class)
     public ResponseEntity<?> handleDatabaseEmptyException(DatabaseEmptyException ex){
	   
		return new ResponseEntity<String>(new String(ex.getMessage()),HttpStatus.BAD_REQUEST);
    }
	
	   @org.springframework.web.bind.annotation.ExceptionHandler(EmployeeNotFoundException.class)
	   public ResponseEntity<?> handleEmployeeNotFoundException(EmployeeNotFoundException ex){
		   
		   return new ResponseEntity<String>(new String(ex.getMessage()),HttpStatus.BAD_REQUEST);
	   }
	   
	   @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	   public ResponseEntity<?> handleException(Exception ex){
		   
		   return new ResponseEntity<String>(new String(ex.getMessage()),HttpStatus.BAD_REQUEST);
	   }
}
