package ong.generation.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="atividade1")
public class Atividade1 {
	@GetMapping
	public String Atividade1() {
		
		return "Utilizei a paciência, humildade e persistência";
	}
	
}
