package com.capg.doctor.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.doctor.entity.AvailabilityDates;
import com.capg.doctor.entity.Doctor;
import com.capg.doctor.exception.DoctorException;
import com.capg.doctor.repo.AvailRepo;
import com.capg.doctor.repo.IDoctorRepository;



@Service
public class IDoctorServiceImpl implements IDoctorService {
	
	@Autowired
	public IDoctorRepository idocrepo;
	@Autowired
	public AvailRepo arepo;
	
	public Doctor addDoctor(Doctor bean,AvailabilityDates bean1) {
	
//		addAvailability(bean1);
		return idocrepo.save(bean);
		
	}

	@Override
	public Doctor updateDoctorProfile(int id,Doctor bean) {
		// TODO Auto-generated method stub
		
		Doctor doc=idocrepo.findById(id).get();
		
		if (Objects.nonNull(bean.getDoctorId())) {
			doc.setDoctorId(bean.getDoctorId());
		}
		if (Objects.nonNull(bean.getDoctorName()) && !"".equalsIgnoreCase(bean.getDoctorName())) {
			doc.setDoctorName(bean.getDoctorName());
		}
		if (Objects.nonNull(bean.getEmail())) {
			doc.setEmail(bean.getEmail());
		}
		if (Objects.nonNull(bean.getHospitalName()) && !"".equalsIgnoreCase(bean.getHospitalName())) {
			doc.setHospitalName(bean.getHospitalName());
		}
		if (Objects.nonNull(bean.getLocation()) && !"".equalsIgnoreCase(bean.getLocation())) {
			doc.setLocation(bean.getLocation());
		}
		if (Objects.nonNull(bean.getMobileNo())) {
			doc.setMobileNo(bean.getMobileNo());
		}
		if (Objects.nonNull(bean.getPassword())) {
			doc.setPassword(bean.getPassword());
		}
		if (Objects.nonNull(bean.getSpeciality()) && !"".equalsIgnoreCase(bean.getSpeciality())) {
			doc.setSpeciality(bean.getSpeciality());
		}
		return idocrepo.save(doc);
	}

	@Override
	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		Optional<Doctor> list = idocrepo.findById(id);
		if(!list.isPresent()) {
			throw new DoctorException("Doctor not found");
		}
		return list.get();
	}

	@Override
	public void removeDoctor(int id) {
		// TODO Auto-generated method stub
//		arepo.delete(entity);
		idocrepo.deleteById(id);
//		removeAvailability(id);
	}

	@Override
	public List<Doctor> getDoctorList() {
		// TODO Auto-generated method stub
		if(getDoctorList().isEmpty()) {
			throw new DoctorException("Doctors are not available");
		}
		return idocrepo.findAll();
	}

	@Override
	public List<Doctor> getDoctorBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		if(getDoctorBySpeciality(speciality).isEmpty()) {
			throw new DoctorException("Doctors are not available");
		}
		return idocrepo.findBySpecialityIgnoreCase(speciality);
	}

	@Override
	public AvailabilityDates addAvailability(AvailabilityDates bean) {
		// TODO Auto-generated method stub
		return arepo.save(bean);
	}

	@Override
	public List<AvailabilityDates> showAvailability(AvailabilityDates bean) {
		// TODO Auto-generated method stub
		if(showAvailability(bean).isEmpty()) {
			throw new DoctorException("Dates not available");
		}
		return arepo.findAll();
	}

	@Override
	public AvailabilityDates updateAvailability(int id,AvailabilityDates bean) {
		// TODO Auto-generated method stub
		if(bean==null) {
			throw new DoctorException("Provide correct details");
		}
		AvailabilityDates ad=arepo.findById(id).get();
		ad.setDoctor(bean.getDoctor());
		ad.setEndDate(bean.getEndDate());
		ad.setFromDate(bean.getFromDate());
		return arepo.save(ad);
	}

	@Override
	public void removeAvailability(int id) {
		// TODO Auto-generated method stub
		if(!arepo.findById(id).isPresent()) {
			throw new DoctorException("Dates not available");
		}
		arepo.deleteById(id);
	}

}
