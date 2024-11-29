package com.microservice.service;

import java.util.List;

import com.microservice.model.Microservice;

public interface IMicroserviceService {

	void addMicroservice(Microservice user);
	void updateMicroservice(Microservice user);
	void deleteMicroservice(int userId);
	Microservice getById(int userId);
	List<Microservice> getAll();
	List<Microservice> getByPhoneNumber(String phone_number);
	List<Microservice> getByLesserPrice(double price);

	List<Microservice> getByEmailID(String email_id);
}
