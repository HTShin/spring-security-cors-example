package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping(value = "/api/test-api")
	public ResponseEntity<String> demo() {
		ResponseEntity<String> response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		try {
			String str = "Test API OK spring version 2.3.4";
			response = new ResponseEntity<>(str, HttpStatus.OK);
		} catch (Exception ex) {
			// logger
		}
		return response;
	}
}
