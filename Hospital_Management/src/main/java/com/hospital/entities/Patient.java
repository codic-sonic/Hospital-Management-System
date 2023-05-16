package com.hospital.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Patient {
	
	@Id
	@GenericGenerator(name = "pat_id", strategy = "com.hospital.entities.generator.PatientIdGenerator")
	@GeneratedValue(generator = "pat_id")
	private String pat_id;
	@Pattern(regexp ="^[a-zA-Z]+$", message = "Only Alphabets are allowed")
	@NotNull
	private String firstname;
	@Pattern(regexp ="^[a-zA-Z]+$", message = "Only Alphabets are allowed")
	@NotNull
	private String lastname;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "address_id")
	@NotNull
	private Address address;
	@Pattern(regexp = "^[0-9]+$", message = "Only Digits are allowed")
	@NotNull
	@Length(min = 10,max = 10,message = "Please enter 10 digits")
	private String phoneno;
	@NotNull
	private String symptom;

	public String getPat_id() {
		return pat_id;
	}

	public void setPat_id(String pat_id) {
		this.pat_id = pat_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

}
