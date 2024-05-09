package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.Users;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public Users save(Users user) {
		// TODO Auto-generated method stub
		return  userDao.save(user);
	}

	public Users findUser(int id) {
		// TODO Auto-generated method stub
		return userDao.findUser(id);
	}

	public Users deleteUser(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

	public Users updateUser(int id, Users users) {
		// TODO Auto-generated method stub
		return userDao.updateUser(id,users);
	}
	
	

}
