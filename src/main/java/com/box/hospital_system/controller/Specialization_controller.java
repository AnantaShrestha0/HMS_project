package com.box.hospital_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.box.hospital_system.model.specialization;
import com.box.hospital_system.repo.specialization_repo;
import com.box.hospital_system.service.SpecializationService;


@Controller
public class Specialization_controller {
	@Autowired
	private SpecializationService service;
	
	@Autowired
	private specialization_repo repo;
	
//    @GetMapping("/")
//	public String special() {
//	return "index"	;
//	}
    
    @GetMapping("/specialization_detail")
    public String getfoR(){
    	return "specialization";
    }
    
    @PostMapping("/specialization_detail")
    public String getformdata(@ModelAttribute specialization spec,Model model) {
    	repo.save(spec);
    	List<specialization> special=service.listAll();
		model.addAttribute("listspecializarion", special);
    	return "docter";
    }
    
	
}
