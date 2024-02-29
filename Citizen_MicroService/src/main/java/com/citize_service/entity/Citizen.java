package com.citize_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long citizen_Id;
	private String citizen_Name;
	private int vaccinated;
}
