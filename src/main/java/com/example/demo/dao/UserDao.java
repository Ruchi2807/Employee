package com.example.demo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Users;
import com.example.demo.repo.UserRepo;

@Repository
public class UserDao {
	@Autowired
	private UserRepo userRepo;

	public Users save(Users user) {
		// TODO Auto-generated method stub
		return userRepo.save(user) ;
	}

	public Users findUser(int id) {
		// TODO Auto-generated method stub
		Optional<Users> optional= userRepo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public Users deleteUser(int id) {
		// TODO Auto-generated method stub
		Optional<Users>optional=userRepo.findById(id);
		if(optional.isPresent()) {
			userRepo.deleteById(id);
			 return optional.get();
		}
		return null;
	}

	public Users updateUser(int id, Users users) {
		// TODO Auto-generated method stub
		Optional<Users>optional=userRepo.findById(id);
		if(optional.isPresent()) {
			users.setId(id);
			return userRepo.save(users);
		}
		return null;
	}

}
