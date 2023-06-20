package com.box.hospital_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.box.hospital_system.model.Doctor_Info;

public interface Doctor_repo extends JpaRepository<Doctor_Info, Integer>{

}
