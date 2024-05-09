package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Users;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public Users save(@RequestBody Users user) {
		return userService.save(user);
		
	}
	
	@GetMapping("/find")
	public Users findUser(@RequestParam  int id) {
		return userService.findUser(id);
		
	}
	
	@DeleteMapping("/delete")
	public Users deleteUser(@RequestParam  int id) {
		return userService.deleteUser(id);
		
	}
	@PutMapping("/update")
	public Users updateUser(@RequestParam  int id,@RequestBody Users users) {
		return userService.updateUser(id,users);
		
	}
	

}
