package com.box.hospital_system.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.hospital_system.model.specialization;
import com.box.hospital_system.repo.specialization_repo;
import com.box.hospital_system.service.SpecializationService;

@Service
public class SpecializationServiceimpl implements SpecializationService {
	@Autowired
	private specialization_repo repo;

	@Override
	public List<specialization> listAll(){
		return repo.findAll();
	}
	
	@Override
	public void save(specialization spec) {
		repo.save(spec);
		
	}
	
	@Override
	public specialization get(long id) {
		return repo.findById((int) id).get();
	}
}
