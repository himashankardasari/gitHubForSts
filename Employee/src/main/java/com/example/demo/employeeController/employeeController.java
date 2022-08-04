package com.example.demo.employeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employeeEntity.Employee;
import com.example.demo.employeeService.employeeService;

@RestController
@RequestMapping("/demo")
public class employeeController {

	
@Autowired
public employeeService empService;

@PostMapping("/save")
public void saveEmploye(@RequestBody Employee employee) {
	empService.saveEmploy(employee);
}

@GetMapping("/test")
public String testing() {
	String result = "Hello, again";
	return result;
}

@GetMapping("/tester")
public String testing() {
	String result = "Hi, amigo";
	return result;
}
	
}
