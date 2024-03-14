package com.booking.project.model;

public class FormDto {
	
	private String emailAddress;
	private String userPassword;
	
	public FormDto(String emailAddress, String userPassword) {
		super();
		this.emailAddress = emailAddress;
		this.userPassword = userPassword;
	}
	public String getemailAddress() {
		return emailAddress;
	}
	public void setemailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getuserPassword() {
		return userPassword;
	}
	public void setuserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
