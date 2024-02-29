package com.vaccinatioinfo_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaccinatioinfo_service.entity.Vaccinated_Entity;

@Repository
public interface VaccinationInfoRepository extends JpaRepository<Vaccinated_Entity, Long> {

}
