package com.capg.doctor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int doctorId;
	private String doctorName;
	private String speciality;
	private String location;
	private String hospitalName;
	private long mobileNo;
	private String email;
	private String password;
	private double chargesPerVisit;
	
}
