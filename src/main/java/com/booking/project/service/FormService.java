package com.booking.project.service;

import com.booking.project.model.Form;

public interface FormService {
	
	Form addFormData(Form form);
	boolean checkData(String emailAddress, String userPassword);
	

}
