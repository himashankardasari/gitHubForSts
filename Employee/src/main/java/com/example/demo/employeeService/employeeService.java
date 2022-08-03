package com.example.demo.employeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employeeEntity.Employee;
import com.example.demo.employeeRepository.employeeRepository;

@Service
public class employeeService {
	
@Autowired
public employeeRepository empRepository;

public void saveEmploy(Employee employee) {
	empRepository.save(employee);
}




}
