package com.booking.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookingappRegister")
public class Form {
	
	@Id
	@GeneratedValue
	private int regId;
	private String  emailAddress;
	private String userName;
	private String userPassword;
	public int getregId() {
		return regId;
	}
	public void setregId(int regId) {
		this.regId = regId;
	}
	public String getemailAddress() {
		return emailAddress;
	}
	public void setemailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getuserPassword() {
		return userPassword;
	}
	public void setuserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

}
