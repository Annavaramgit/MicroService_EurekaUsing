package com.vaccinatioinfo_service.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.discovery.converters.Auto;
import com.vaccinatioinfo_service.Repository.VaccinationInfoRepository;
import com.vaccinatioinfo_service.dto.CitizenDto;
import com.vaccinatioinfo_service.dto.FinalResponse;
import com.vaccinatioinfo_service.entity.Vaccinated_Entity;

@Service
public class VaccinationInfoService {

	//private String url = "http://CITIZEN/citizen1/";
	private String url = "/citizen1/";
	//private String url = "http://localhost:8087/citizen1/";
	@Autowired
	private  VaccinationInfoRepository vaccinationInfoRepository;
	
//	@Autowired
//	private RestTemplate restTemplate;

	@Autowired
	private WebClient webClient;
	
	public Vaccinated_Entity savingMethod(Vaccinated_Entity vaccinated_Entity) 
	{
		return  vaccinationInfoRepository.save(vaccinated_Entity);
	}
	
	/*

public FinalResponse getVaccinatedWithCitizenDetails(long id) {
	   FinalResponse finalResponse = new FinalResponse();
	   Vaccinated_Entity vaccinatedEntity = vaccinationInfoRepository.findById(id).orElse(null);
	   List<CitizenDto>citizen=restTemplate.getForObject(url+vaccinatedEntity.getVaccinated(),List.class);
	   finalResponse.setCitizenDto(citizen);
	   finalResponse.setVaccinated_Entity(vaccinatedEntity);
	   return finalResponse;

}   */

public FinalResponse getVaccinatedWithCitizenDetails(long id) {
	
    FinalResponse finalResponse = new FinalResponse();
    //try {
    Vaccinated_Entity vaccinatedEntity = vaccinationInfoRepository.findById(id).orElse(null);
   
    // Using WebClient to fetch citizen details
    List<CitizenDto> citizens = webClient.get()
            .uri("http://CITIZEN//citizen1/"+vaccinatedEntity.getVaccinated())
            .retrieve()
            .bodyToFlux(CitizenDto.class)
           .collectList()
            .block();
    System.out.println("---------------------------------------------------------");
    finalResponse.setCitizenDto(citizens);
    finalResponse.setVaccinated_Entity(vaccinatedEntity);
  //  }
//    catch (Exception e) {
//		System.out.println("---------------------------------------------------------"+e.toString());
//	}
    return finalResponse;
}

}
