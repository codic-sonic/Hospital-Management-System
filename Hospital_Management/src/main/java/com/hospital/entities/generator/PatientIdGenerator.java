package com.hospital.entities.generator;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import com.hospital.entities.IdCount;
import com.hospital.entities.Patient;
import com.hospital.repositories.IdCountRepository;
import com.hospital.repositories.PatientRepository;

public class PatientIdGenerator implements IdentifierGenerator {
	@Autowired
	IdCountRepository idCountRepository;
	
	private int count;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		IdCount curr = idCountRepository.findById(1).orElse(null);
		if(curr==null) {
			curr.setIdid_count(1);
			curr.setId(1);
			idCountRepository.save(curr);
		}
		count = curr.getIdid_count();
		curr.setIdid_count(count+1);
		idCountRepository.save(curr);
		String prefix = "P";
		String suffix = String.format("%05d", count);
		
		return (prefix + suffix);
	}
}