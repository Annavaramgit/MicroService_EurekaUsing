package com.citize_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citize_service.entity.Citizen;
import com.citize_service.repository.Citizen_Repository;
import com.netflix.discovery.converters.Auto;

@Service
public class Citizen_Service {

	@Autowired
	private Citizen_Repository citizen_Repository;
	
	public Citizen savingMethod(Citizen citizen) {
		return citizen_Repository.save(citizen);
	}
	
	public List<Citizen> getMethod(int vaccinated){
		return citizen_Repository.findByVaccinated(vaccinated);
	}
	
}
