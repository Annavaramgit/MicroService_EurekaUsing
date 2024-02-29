package com.citize_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citize_service.entity.Citizen;
import com.citize_service.service.Citizen_Service;

@RestController
public class Citizen_controller {

	@Autowired
	private Citizen_Service citizen_Service;
	
	@PostMapping("/citizen1")
	public ResponseEntity<Citizen> savingMethod(@RequestBody Citizen citizen){
		
		Citizen citizen1 = citizen_Service.savingMethod(citizen);
		
		return new ResponseEntity<>(citizen1,HttpStatus.OK);
		
	}
	
	@GetMapping("/citizen1/{vaccinated}")
	public ResponseEntity<List<Citizen>> getDetilsMethod(@PathVariable int vaccinated)
	{
	List<Citizen> result =	citizen_Service.getMethod(vaccinated);
	
	return new ResponseEntity<>(result,HttpStatus.OK);
		
	}
	
	
}
