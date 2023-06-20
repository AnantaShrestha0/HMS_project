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
import com.box.hospital_system.model.Doctor_Info;
import com.box.hospital_system.service.AppointmentService;
import com.box.hospital_system.service.DoctorService;

@Controller
@RequestMapping("/appointment")
public class Appointment_controller {

	@Autowired
	private AppointmentService appointment_service;
	@Autowired
	private DoctorService dservice;
	@GetMapping("/appointment_info")
	public String getappointment() {
		return "appointment";
	}
	
	@PostMapping("/appointment_info")
	public String postappointment(@ModelAttribute AppointmentModel appointmentModel,Model model) {
		AppointmentModel a=appointment_service.doctor_check(appointmentModel.getDoctorname(),appointmentModel.getAppointmentdate());
		if(a==null) {
			appointment_service.add(appointmentModel);
			  List<Doctor_Info> dlsit=   dservice.list_of_doctor();
			   model.addAttribute("listDoctor", dlsit);
			return "appointmentsearchlist";
		}
		model.addAttribute("doctor_present","This doctor is already booked for this day; please try the next day.");
		return "redirect:/appointment_info";
	}
}
