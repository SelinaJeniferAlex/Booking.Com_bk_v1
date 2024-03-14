package com.booking.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.project.model.Form;
import com.booking.project.repo.FormRepo;
import com.booking.project.service.FormService;

@Service
public class FormServiceImpl implements FormService{
	
	@Autowired
	private FormRepo formRepo;
	
	@Override
	public Form addFormData(Form form){
		
		formRepo.saveAndFlush(form);
		return form;
	}

	@Override
	public boolean checkData(String emailAddress, String userPassword) {
		
		Form form = formRepo.findByEmailAddress(emailAddress);
		if (form!= null && form.getuserPassword().equals(userPassword))
			return true;
		else 
			return false;
	}

}
