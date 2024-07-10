package com.booking.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.project.dto.FormDto;
import com.booking.project.model.Form;
import com.booking.project.service.FormService;

@RestController
@RequestMapping("/registerform")
public class FormController {
	
	@Autowired
	private FormService formService;
	
	@PostMapping("/register")
	public ResponseEntity<Boolean> addFormData(@RequestBody Form form){
	
		boolean success = formService.addFormData(form);		
		return ResponseEntity.status(HttpStatus.OK).body(success);

	}
	
	@PostMapping("/login")
	public ResponseEntity<Boolean> checkData(@RequestBody FormDto formDto){
		
		boolean success = formService.checkData(formDto.getemailAddress(), formDto.getuserPassword());
		return ResponseEntity.status(HttpStatus.OK).body(success);
	
	}


}
