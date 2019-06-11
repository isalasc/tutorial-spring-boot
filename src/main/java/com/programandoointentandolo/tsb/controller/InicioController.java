package com.programandoointentandolo.tsb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

	@GetMapping("/")
	public String inicio() {
		return "redirect:/productos/lista";
	}

}
