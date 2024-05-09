package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
     @Query("select e from employee e where salary =?1")
	 Optional<Employee> findEmployeeBySalary(@Param("employeeId") int employeeId);
}
