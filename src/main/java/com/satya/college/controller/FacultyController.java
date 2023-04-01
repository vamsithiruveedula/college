package com.satya.college.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FacultyController {

	@RequestMapping("/getAllFaculties")
	public ModelAndView getAllFaculties() {
		Date date = new Date();
		ModelAndView mv = new ModelAndView("faculty");
		mv.addObject("abc", date);
		return mv;
	}
	
	@RequestMapping("/getFaculties")
	public String getFaculties(Model model) {
		Date date = new Date();
		model.addAttribute("xyz", date);
		return "faculty";
	}
}
