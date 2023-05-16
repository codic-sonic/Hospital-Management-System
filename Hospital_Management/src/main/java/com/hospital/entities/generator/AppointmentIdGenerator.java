package com.hospital.entities.generator;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class AppointmentIdGenerator implements IdentifierGenerator {
    private int count = 1;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String prefix = "A";
        String suffix = String.format("%06d", count++);
        return prefix + suffix;
    }
}
