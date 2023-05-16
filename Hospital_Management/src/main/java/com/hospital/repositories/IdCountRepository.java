package com.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hospital.entities.IdCount;

public interface IdCountRepository extends JpaRepository<IdCount, Integer>{
	
}
