package com.box.hospital_system.service;

import java.util.List;

import com.box.hospital_system.model.AppointmentModel;
import com.box.hospital_system.model.Doctor_Info;

public interface Appointmentlistservice {
	
   List<AppointmentModel> data(int doctorid );
}
