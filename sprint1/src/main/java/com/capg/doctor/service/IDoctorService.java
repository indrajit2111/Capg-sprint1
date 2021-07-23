package com.capg.doctor.service;

import java.util.List;

import com.capg.doctor.entity.AvailabilityDates;
import com.capg.doctor.entity.Doctor;

public interface IDoctorService {

	public Doctor addDoctor(Doctor bean,AvailabilityDates bean1);
	public Doctor updateDoctorProfile(int id,Doctor bean);
	public AvailabilityDates addAvailability(AvailabilityDates bean);
	public List<AvailabilityDates> showAvailability(AvailabilityDates bean);
	public AvailabilityDates updateAvailability(int id,AvailabilityDates bean);
	public void removeAvailability(int id);
	public Doctor getDoctor(int id);
	public void removeDoctor(int id);
	public List<Doctor> getDoctorList();
	public List<Doctor> getDoctorBySpeciality(String speciality);
}
