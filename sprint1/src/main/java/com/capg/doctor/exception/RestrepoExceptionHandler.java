package com.capg.doctor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


public class RestrepoExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DoctorException.class)
	public ResponseEntity<ErrorMessage> handleDoctorException(DoctorException ex,WebRequest request) 
	{
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
	}
}
