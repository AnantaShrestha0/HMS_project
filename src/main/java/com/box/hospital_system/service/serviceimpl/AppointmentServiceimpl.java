package com.box.hospital_system.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.hospital_system.model.AppointmentModel;
import com.box.hospital_system.repo.Appointment_repo;
import com.box.hospital_system.service.AppointmentService;

@Service
public class AppointmentServiceimpl implements AppointmentService{

	@Autowired
	private Appointment_repo appointment_repo;
	@Override
	public void add(AppointmentModel appointmentModel) {
		// TODO Auto-generated method stub
		
		appointment_repo.save(appointmentModel);
		
	}
	@Override
	public AppointmentModel doctor_check(String doctorname,String appointmentdate) {
		// TODO Auto-generated method stub
		AppointmentModel doctor=appointment_repo.findByDoctornameAndAppointmentdate(doctorname,appointmentdate);
		return doctor;
	}

}
