package com.box.hospital_system.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.hospital_system.model.AppointmentModel;
import com.box.hospital_system.repo.Appointment_list_repo;
import com.box.hospital_system.service.Appointmentlistservice;

@Service
public class Appointmentlist_service_impl implements Appointmentlistservice{

	@Autowired
	private Appointment_list_repo repo;
	@Override
	public List<AppointmentModel> data(int doctorid) {
		// TODO Auto-generated method stub
		String did=Integer.toString(doctorid);
		return repo.findByDoctorname(did);
	}

}
