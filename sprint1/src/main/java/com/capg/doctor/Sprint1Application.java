package com.capg.doctor;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capg.doctor.entity.Doctor;
import com.capg.doctor.repo.AvailRepo;
import com.capg.doctor.repo.IDoctorRepository;



@SpringBootApplication
public class Sprint1Application {

	public static void main(String[] args) {
//		SpringApplication.run(Sprint1Application.class, args);
		ConfigurableApplicationContext ct = SpringApplication.run(Sprint1Application.class, args);
		
//		IDoctorRepository repo=ct.getBean(IDoctorRepository.class);
//		AvailRepo arepo=ct.getBean(AvailRepo.class);
//		Doctor doc=new Doctor();
//		doc.setChargesPerVisit(1000);
//		doc.setDoctorName("Singh");
//		doc.setEmail("Indrajit123@gmail.com");
//		doc.setHospitalName("pqr");
//		doc.setLocation("kolkata-s");
//		doc.setMobileNo(1234567890);
//		doc.setPassword("abc12345");
//		doc.setSpeciality("gynaecologist");
//		repo.save(doc);
//		AvailabilityDates ad=new AvailabilityDates();
//		ad.setAvailibityId(101);
//		ad.setDoctor(doc);
//		ad.setEndDate(LocalDate.now());
//		ad.setFromDate(LocalDate.now());
//		arepo.save(ad);
		
		

	}

}
