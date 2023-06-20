package com.box.hospital_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.box.hospital_system.model.AppointmentModel;
import com.box.hospital_system.model.Appointmentlist;
import com.box.hospital_system.model.Doctor_Info;
import com.box.hospital_system.model.specialization;
import com.box.hospital_system.service.Appointmentlistservice;
import com.box.hospital_system.service.DoctorService;

@Controller
@RequestMapping("/appointment_list")
public class Appointment_search_list {

	@Autowired
	private Appointmentlistservice service;
	@Autowired
	private DoctorService dservice;
	@GetMapping("/appointmentlistdata")
	public String getdata(Model model) {
	   List<Doctor_Info> dlsit=   dservice.list_of_doctor();
	   model.addAttribute("listDoctor", dlsit);
		return "appointmentsearchlist";
	}
	
	@PostMapping("/appointmentlistdata")
	public String showdata(@ModelAttribute Appointmentlist appointmentlist,Model model) {
		int doctorid=appointmentlist.getDoctorid();
		List<AppointmentModel> list=service.data(doctorid);
		model.addAttribute("appointmentlist", list);
		
		return "appointmentsearchlist";
	}
}
