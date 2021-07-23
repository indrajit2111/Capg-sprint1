package com.capg.doctor.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class AvailabilityDates {
	
	@Id
	private int availibityId;
	@OneToOne
	private Doctor doctor;
	private LocalDate fromDate;
	private LocalDate endDate;
	
	

}
