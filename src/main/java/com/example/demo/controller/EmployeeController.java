package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService eservice;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp) {
		return eservice.save(emp);
		
	}
	@GetMapping("/find")
	public Employee findEmployee(@RequestParam int id) {
		return eservice.findEmployee(id);
		
	}
	@DeleteMapping("/delete")
	public Employee deleteEmployee(@RequestParam int id) {
		return eservice.deleteEmployee(id);
	}
	@PutMapping("/update")
	public Employee updateEmployee(@RequestParam int id,@RequestBody Employee emp) {
		return eservice.updateEmployee(id,emp);
	}
	

}
