package com.booking.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.project.model.Admin;
import com.booking.project.repo.AdminRepo;
import com.booking.project.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepo adminRepo;
	
	@Override
	  public Admin storeAdmin(Admin admin) {
		
        adminRepo.saveAndFlush(admin);
		return admin;
    }
	@Override
    public List<Admin> getAllHotels() {
        return adminRepo.findAll();
    }
	@Override
	public Admin deleteStay(int adminId) {
		  Admin admin = adminRepo.findById(adminId).get();
	        if(admin!=null)
	        adminRepo.delete(admin);
	        
	        return admin;
	}
	@Override
	public List<Admin> getAllStays() {
        return adminRepo.findAll();

	}

}
