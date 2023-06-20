package com.box.hospital_system.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.hospital_system.model.Doctor_Info;
import com.box.hospital_system.model.Patient;

import com.box.hospital_system.repo.Doctor_repo;
import com.box.hospital_system.repo.Patient_repo;
import com.box.hospital_system.service.PatientService;

@Service
public class PatientServiceimpl implements PatientService{

	@Autowired
	private Patient_repo repo;
	
	@Autowired
	private Doctor_repo doctor_repo;
	
	
	
	@Override
	public List<Doctor_Info> listAll(){
		return doctor_repo.findAll();
	}

	@Override
	public Doctor_Info get(long id) {
		// TODO Auto-generated method stub
		return doctor_repo.findById((int) id).get();
	
	}
	@Override
	public void registration(Patient patient) {
		// TODO Auto-generated method stub
		repo.save(patient);
		
	}

}
