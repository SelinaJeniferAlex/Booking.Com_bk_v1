package com.booking.project.service;

import com.booking.project.model.User;

public interface UserService {
	
	Object addUser(User user);
	
	boolean verifyUser(User user);
}
