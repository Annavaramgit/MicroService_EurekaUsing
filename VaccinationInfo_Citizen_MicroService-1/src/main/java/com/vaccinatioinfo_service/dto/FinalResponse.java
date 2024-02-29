package com.vaccinatioinfo_service.dto;

import java.util.List;

import com.vaccinatioinfo_service.entity.Vaccinated_Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinalResponse {
	
private Vaccinated_Entity vaccinated_Entity;
	
private List<CitizenDto> citizenDto;	


}
