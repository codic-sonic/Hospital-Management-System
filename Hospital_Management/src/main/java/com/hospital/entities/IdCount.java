package com.hospital.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IdCount {
	
	@Id
	int id;
	
	int idid_count;
	
	
	public int getIdid_count() {
		return idid_count;
	}

	public void setIdid_count(int idid_count) {
		this.idid_count = idid_count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
