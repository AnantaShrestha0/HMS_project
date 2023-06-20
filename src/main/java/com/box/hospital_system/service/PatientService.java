package com.box.hospital_system.service;

import java.util.List;

import com.box.hospital_system.model.Doctor_Info;
import com.box.hospital_system.model.Patient;


public interface PatientService {

	void registration(Patient patient);
	public List<Doctor_Info> listAll();
	public Doctor_Info get(long id);
}
