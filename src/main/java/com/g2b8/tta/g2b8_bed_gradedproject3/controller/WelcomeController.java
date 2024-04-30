package com.g2b8.tta.g2b8_bed_gradedproject3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String displayWelcomePage() {
		return "redirect:/students/list";
	}

}