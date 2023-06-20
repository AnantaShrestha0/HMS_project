package com.box.hospital_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.box.hospital_system.model.Doctor_Info;
import com.box.hospital_system.model.Patient;

import com.box.hospital_system.service.PatientService;

@Controller
@RequestMapping("/patient")
public class Patient_controller {

	@Autowired
	private PatientService serv;
	
	@GetMapping("/patient_info")
	public String getpatient() {
		return "patient";
	}
	
	@PostMapping("/patient_info")
	public String postpatient(@ModelAttribute Patient patient,Model model) {
		serv.registration(patient);
		List<Doctor_Info> doctorname=serv.listAll();
		model.addAttribute("listDoctor", doctorname);
		return "appointment";
	}
}
