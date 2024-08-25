package com.booking.project.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.project.model.User;

public interface UserRepo extends JpaRepository<User, UUID>{

	User findByEmail(String email);

	User findByUserName(String userName);

}
