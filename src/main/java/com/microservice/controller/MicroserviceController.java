package com.microservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.microservice.model.Microservice;
import com.microservice.repository.IMicroserviceRepository;

@RestController
public class MicroserviceController {

    @Autowired
    private IMicroserviceRepository microserviceRepository;


    @PostMapping
    public void addMicroservice(@RequestBody Microservice microservice) throws Exception {
        microserviceRepository.addMicroservice(microservice);
    }

    @PutMapping("/{id}")
    public void updateMicroservice(@PathVariable int id, @RequestBody Microservice updatedMicroservice) throws Exception {
        updatedMicroservice.setUserId(id);
        microserviceRepository.updateMicroservice(updatedMicroservice);
    }

    @DeleteMapping("/{id}")
    public void deleteMicroservice(@PathVariable int id) throws Exception {
        microserviceRepository.deleteMicroservice(id);
    }


    @GetMapping("/{id}")
    public Microservice getMicroservice(@PathVariable int id) throws Exception {
        return microserviceRepository.getById(id);
    }

    @GetMapping("/showmicroservice")
    public List<Microservice> getAllMicroservices() throws Exception {
        return microserviceRepository.getAll();
    }
}
