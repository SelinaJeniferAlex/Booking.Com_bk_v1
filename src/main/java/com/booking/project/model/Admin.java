package com.booking.project.model;

import java.util.List;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue
	private int adminId;
    private String hotelName;
    private String grade;
    private String distance;
    private String meals;
    private String propertyType;
    @ElementCollection
    private List<String> facilities;
    private String image;
    public Admin() {
    	
    }
	public Admin(int adminId, String hotelName, String grade, String distance, String meals, String propertyType,
			List<String> facilities, String image) {
		super();
		this.adminId = adminId;
		this.hotelName = hotelName;
		this.grade = grade;
		this.distance = distance;
		this.meals = meals;
		this.propertyType = propertyType;
		this.facilities = facilities;
		this.image = image;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getMeals() {
		return meals;
	}
	public void setMeals(String meals) {
		this.meals = meals;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public List<String> getFacilities() {
		return facilities;
	}
	public void setFacilities(List<String> facilities) {
		this.facilities = facilities;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
    
    
    
}
