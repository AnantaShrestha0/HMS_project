package com.box.hospital_system.controller;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.box.hospital_system.model.Doctor_Info;
import com.box.hospital_system.model.specialization;
import com.box.hospital_system.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class Doctor_Data_contoller {

	
	@Autowired
	private DoctorService service;
	
	@PostMapping("/doctor_info")
	public String doctor_info(@ModelAttribute Doctor_Info doctor,Model model) {
		
//
//		try {
//		if(file.isEmpty()) {
//			
//		}else {
//			doctor.setImagefile(file.getOriginalFilename());
//			File savefile=new ClassPathResource("static/img").getFile();
//			Path path= Paths.get(savefile.getAbsolutePath()+File.separator+file.getOriginalFilename());
//			
//		    Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
//		
//		}
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
	
		
		service.save(doctor);
		
		
		
		return "patient";
	}
	
	@GetMapping("/doctor_info")
	public String showdata(Model model) {
		List<specialization> special=service.listAll();
		model.addAttribute("listspecializarion", special);
		return "docter";
	}
}
