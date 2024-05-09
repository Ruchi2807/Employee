package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao edao;

	public Employee save(Employee Emp) {
		// TODO Auto-generated method stub
		return edao.save(Emp);
	}

	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return edao.findEmployee(id);
	}

	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return edao.deleteEmployee(id);
	}

	public Employee updateEmployee(int id,Employee emp) {
		// TODO Auto-generated method stub
		return edao.updateEmployee(id,emp);
	}

	

	

}
