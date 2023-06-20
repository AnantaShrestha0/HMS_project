package com.box.hospital_system.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.box.hospital_system.model.Doctor_Info;
import com.box.hospital_system.model.specialization;

public interface DoctorService {

	public List<specialization> listAll();
	
	public void save(Doctor_Info doctor);
	public specialization get(long id);
	public void savephoto(MultipartFile file);
	List<Doctor_Info> list_of_doctor();
}
