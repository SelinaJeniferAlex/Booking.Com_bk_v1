package com.booking.project.service;

import java.util.List;

import com.booking.project.model.Admin;

public interface AdminService {
	
    Admin storeAdmin(Admin admin);
    
    List<Admin> getAllHotels();

	Admin deleteStay(int adminId);

	List<Admin> getAllStays();


}
