package com.booking.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.project.model.Admin;
import com.booking.project.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/adminpage")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/store")
    public ResponseEntity<?> storeAdmin(@RequestBody Admin admin) {
        
		adminService.storeAdmin(admin);
		return ResponseEntity.status(HttpStatus.OK).body(admin);
    }
	@GetMapping("/hotels")
    public ResponseEntity<List<Admin>> getAllHotels() {
        List<Admin> data = adminService.getAllHotels();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
 