package com.capg.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.doctor.entity.AvailabilityDates;
import com.capg.doctor.entity.Doctor;
import com.capg.doctor.service.IDoctorService;



@RestController
public class DoctorController {
	
	@Autowired
	public IDoctorService serv;
	
	@PostMapping("/doctor")
	public Doctor addDoctor(@RequestBody Doctor bean,@RequestBody AvailabilityDates bean1) {
		return serv.addDoctor(bean,bean1);
	}
	@GetMapping("/doctor/{id}")
	public Doctor getDoctor(@PathVariable("id")int id) {
		return serv.getDoctor(id);
	}
	
	@PutMapping("/doctor/{id}")
	public Doctor updateDoctorProfile(@PathVariable("id") int id,@RequestBody Doctor bean) {
		return serv.updateDoctorProfile(id,bean);
		
	}
	@PutMapping("/doctor/dates/{id}")
	public AvailabilityDates updateAvailability(@PathVariable("id") int id,@RequestBody AvailabilityDates bean) {
		return serv.updateAvailability(id,bean);
		
	}
	
	@GetMapping("/all")
	public List<Doctor> getDoctorList(){
		return serv.getDoctorList();
	}
	@GetMapping("/all/dates")
	public List<AvailabilityDates> getDates(AvailabilityDates bean){
		return serv.showAvailability(bean);
	}
	@GetMapping("/all/{speciality}")
	public List<Doctor> getDoctorBySpeciality(@PathVariable("speciality") String speciality){
		return serv.getDoctorBySpeciality(speciality);
	}
	
	@DeleteMapping("/doctor/{id}")
	public void removeDoctor(@PathVariable("id") int id) {
		serv.removeDoctor(id);
	}

}
