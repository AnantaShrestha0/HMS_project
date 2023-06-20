package com.box.hospital_system.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.box.hospital_system.model.AppointmentModel;

public interface Appointment_list_repo extends JpaRepository<AppointmentModel, Integer>{

	
	List<AppointmentModel>  findByDoctorname(String id);
}
