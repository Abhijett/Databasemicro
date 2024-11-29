package com.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.model.Microservice;
import com.microservice.repository.IMicroserviceRepository;

@Service
public class MicroserviceServiceImpl implements IMicroserviceService {

	@Autowired
	private IMicroserviceRepository microserviceRepository;

	@Override
	public void addMicroservice(Microservice microservice) {
		microserviceRepository.addMicroservice(microservice);
	}

	@Override
	public void updateMicroservice(Microservice microservice) {
		microserviceRepository.updateMicroservice(microservice);
	}

	@Override
	public void deleteMicroservice(int microserviceId) {
		microserviceRepository.deleteMicroservice(microserviceId);
	}

	@Override
	public Microservice getById(int userId) {
		return microserviceRepository.getById(userId);
	}

	@Override
	public List<Microservice> getAll() {
		return microserviceRepository.getAll();
	}

	@Override
	public List<Microservice> getByPhoneNumber(String phone_number) {
		return microserviceRepository.getByPhoneNumber(phone_number);
	}

	@Override
	public List<Microservice> getByLesserPrice(double price) {return List.of();}

	@Override
	public List<Microservice> getByEmailID(String email_id) {
		return List.of();
	}


}
