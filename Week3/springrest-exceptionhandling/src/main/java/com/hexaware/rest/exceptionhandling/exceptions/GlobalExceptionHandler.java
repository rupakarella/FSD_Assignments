package com.hexaware.rest.exceptionhandling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	// @ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE,reason="Some Exception
	// occured")
	@ExceptionHandler({ ArithmeticException.class })
	public ResponseEntity<String> handleExp(ArithmeticException e) {

		return new ResponseEntity<String>(e.toString(), HttpStatus.NOT_FOUND);

	}

}