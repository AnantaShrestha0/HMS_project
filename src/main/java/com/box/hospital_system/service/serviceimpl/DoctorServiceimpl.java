package com.box.hospital_system.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.box.hospital_system.model.Doctor_Info;
import com.box.hospital_system.model.specialization;
import com.box.hospital_system.repo.Doctor_repo;
import com.box.hospital_system.repo.specialization_repo;
import com.box.hospital_system.service.DoctorService;
import org.springframework.util.StringUtils;


@Service
public class DoctorServiceimpl implements DoctorService{

	@Autowired
	private specialization_repo repo;
	
	@Autowired
	private Doctor_repo doc_repo;
	
	@Override
	public List<specialization> listAll(){
		return repo.findAll();
	}
	
	@Override
	public void save(Doctor_Info doctor) {
		doc_repo.save(doctor);
		
	}
	@Override
	public specialization get(long id) {
		return repo.findById((int) id).get();
	}

	@Override
	public void savephoto(MultipartFile file) {
		// TODO Auto-generated method stub
		
		String filename=StringUtils.cleanPath(file.getOriginalFilename());
		if(filename.contains("..")) {
			System.out.println("Not a valid file.");
		}
	}

	@Override
	public List<Doctor_Info> list_of_doctor() {
		// TODO Auto-generated method stub
		
		return doc_repo.findAll();
	}
}
