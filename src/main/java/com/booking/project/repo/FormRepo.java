package com.booking.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.booking.project.model.Form;

@Repository
public interface FormRepo extends JpaRepository<Form, Integer>{
	@Query(value = "SELECT * FROM bookingapp_register WHERE email_address = :emailAddress",nativeQuery = true)
	Form findByEmailAddress(String emailAddress);
	
	@Query(value = "SELECT * FROM bookingapp_register WHERE email_address = :emailAddress",nativeQuery = true)
	boolean existsByEmailAddress(String emailAddress);


}
