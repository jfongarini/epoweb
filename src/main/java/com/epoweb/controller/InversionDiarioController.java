package com.epoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InversionDiarioController {
	
	@RequestMapping("/inversionDiario")
	public String inversionDiario() {
		return "inversionDiario/inversionDiario";
	}

}
