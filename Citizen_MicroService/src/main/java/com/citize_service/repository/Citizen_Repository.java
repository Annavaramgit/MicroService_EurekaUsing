package com.citize_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citize_service.entity.Citizen;
@Repository
public interface Citizen_Repository extends JpaRepository<Citizen, Long> {
	public List<Citizen> findByVaccinated(int vaccinated);

}
