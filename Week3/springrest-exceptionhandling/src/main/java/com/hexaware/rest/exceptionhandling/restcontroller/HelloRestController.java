package com.hexaware.rest.exceptionhandling.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

	@GetMapping("/div/{num1}/{num2}")
	public String divNumbers(@PathVariable int num1, @PathVariable int num2) {
		int result = num1 / num2;
		return "Div of num is :" + result;
	}

//	@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED, reason = "Sorry you can't divide number by zero")
//	
//	@ExceptionHandler({ ArithmeticException.class,NullPointerException.class})
//	public ResponseEntity<String> exceptionHandler() {
//		System.out.println("Exception Handler");
//		
//		return new ResponseEntity<String>("Number cannnot be divided by zero", HttpStatus.BAD_REQUEST);
//
//	}
}