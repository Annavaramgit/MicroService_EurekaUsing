package com.vaccinatioinfo_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaccinatioinfo_service.Service.VaccinationInfoService;
import com.vaccinatioinfo_service.dto.FinalResponse;
import com.vaccinatioinfo_service.entity.Vaccinated_Entity;

@RestController
public class VaccinationInfoController {

	@Autowired
	private VaccinationInfoService vaccinationInfoService;
	
	@PostMapping("/vaccinationinfo")
	public ResponseEntity<Vaccinated_Entity> savingMethod(@RequestBody Vaccinated_Entity vaccinated_Entity){
	Vaccinated_Entity result = vaccinationInfoService.savingMethod(vaccinated_Entity);
	 
	return new ResponseEntity<>(result,HttpStatus.OK);
	}

	@GetMapping("/vaccinationinfo/{centerId}")
	public ResponseEntity<FinalResponse> fetchMethod(@PathVariable long centerId){
		
		FinalResponse result = vaccinationInfoService.getVaccinatedWithCitizenDetails(centerId);
		
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	

	
}
