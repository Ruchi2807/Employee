package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Employee;
import com.example.demo.repo.EmployeeRepo;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepo empRepo;

	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
	    Optional<Employee>optional=empRepo.findById(id);
	    if(optional.isPresent()) {
	    return optional.get();
	}
	return null;

	}

	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Optional<Employee>optional=empRepo.findById(id);
		if(optional.isPresent()) {
	 empRepo.deleteById(id);
	 return optional.get();
		}
		return null;
	}

	public Employee updateEmployee(int id,Employee emp) {
		// TODO Auto-generated method stub
		Optional<Employee>optional=empRepo.findById(id);
		if(optional.isPresent()) {
			emp.setId(id);
			return empRepo.save(emp);
		}
		return null;
	}
}