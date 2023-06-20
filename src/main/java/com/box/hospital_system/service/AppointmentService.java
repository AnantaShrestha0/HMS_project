package com.box.hospital_system.service;

import com.box.hospital_system.model.AppointmentModel;

public interface AppointmentService {

	public void add(AppointmentModel appointmentModel);
	public AppointmentModel doctor_check(String doctorname,String appointmentdate);
}
