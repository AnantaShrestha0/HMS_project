package com.box.hospital_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.box.hospital_system.model.AppointmentModel;


public interface Appointment_repo extends JpaRepository<AppointmentModel, Integer> {

  AppointmentModel findByDoctornameAndAppointmentdate(String doctorname,String appointmentdate);
		

}
