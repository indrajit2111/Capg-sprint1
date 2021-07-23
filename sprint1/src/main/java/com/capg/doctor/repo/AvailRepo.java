package com.capg.doctor.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.doctor.entity.AvailabilityDates;

@Repository
public interface AvailRepo extends JpaRepository<AvailabilityDates, Serializable> {
	
//	public AvailabilityDates addAvailability(AvailabilityDates bean);

}
