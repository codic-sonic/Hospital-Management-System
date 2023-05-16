package com.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hospital.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, String>{
	
}
