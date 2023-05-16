package com.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entities.Patient;
import com.hospital.repositories.PatientRepository;

@RestController
public class PatientController {

	@Autowired
	PatientRepository patientRepository;
	
	@PostMapping("add")
	public ResponseEntity<Patient> addPatient(@RequestBody Patient p) {
		patientRepository.save(p);
		
		return ResponseEntity.status(HttpStatus.OK).body(p);
		}
}
