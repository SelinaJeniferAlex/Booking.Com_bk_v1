package com.booking.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.project.model.User;
import com.booking.project.repo.UserRepo;
import com.booking.project.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public Object addUser(User user) {
		User existusername = userRepo.findByUserName(user.getUserName());
	    User existemail = userRepo.findByEmail(user.getEmail());
	    if (existusername != null) {
	        return "Username already exists";
	    } 

	    if (existemail != null) {
	        return "Email already exists";
	    } 
	    else {
	        User user1 = userRepo.saveAndFlush(user);
	        return user1;
	    }
	}

	@Override
	public boolean verifyUser(User user) {
		User existingUser = userRepo.findByUserName(user.getUserName());
	    if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
	        return true;
	    }
	    return false;
	}

}
