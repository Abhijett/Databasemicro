package com.microservice.model;

public class Microservice {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	private Integer userId;

	public Microservice(String name, Integer userId, String emailId, String phoneNumber, String addres, String nationality, String gender, String age) {
		this.name = name;
		this.userId = userId;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.addres = addres;
		this.nationality = nationality;
		this.gender = gender;
		this.age = age;
	}

	private String emailId;
	private String phoneNumber;
	private String addres;
	private String nationality;
	private String gender;
	private String age;



}
