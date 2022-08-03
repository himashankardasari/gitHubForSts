package com.example.demo.employeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.employeeEntity.Employee;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Integer> {
	

}
