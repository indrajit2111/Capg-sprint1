package com.capg.doctor.repo;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.cg.bookmydoctor.dto.Appointment;
//import com.cg.bookmydoctor.dto.AvailabilityDates;
import com.capg.doctor.entity.Doctor;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor, Serializable> {


//	public AvailabilityDates addAvailability(AvailabilityDates bean);
//	public boolean updateAvailability(AvailabilityDates bean);
	public Doctor findByDoctorName(String name);
	public List<Doctor> findBySpecialityIgnoreCase(String speciality);
}
