package com.booking.project.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.ElementCollection;

public class AdminDto {
	
    private String hotelName;
    private String grade;
    private String distance;
    private String meals;
    private String propertyType;
    @ElementCollection
    private List<String> facilities;
    private MultipartFile image;
    private String place;
    private String placeType;
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPlaceType() {
		return placeType;
	}
	public void setPlaceType(String placeType) {
		this.placeType = placeType;
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
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
    
}
