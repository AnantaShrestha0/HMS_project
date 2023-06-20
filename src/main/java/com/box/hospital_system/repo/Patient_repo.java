package com.box.hospital_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.box.hospital_system.model.Patient;

public interface Patient_repo extends JpaRepository<Patient, Integer>{

}
