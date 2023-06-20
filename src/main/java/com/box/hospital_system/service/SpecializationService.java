package com.box.hospital_system.service;

import java.util.List;

import com.box.hospital_system.model.specialization;

public interface SpecializationService {
public List<specialization> listAll();
	
	public void save(specialization spec);
	public specialization get(long id);
}
