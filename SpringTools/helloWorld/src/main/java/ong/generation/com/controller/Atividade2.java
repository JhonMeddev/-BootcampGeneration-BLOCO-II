package ong.generation.com.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="atividade2")
public class Atividade2 {
	@GetMapping
	public String Atividade2() {
		
		return "<h1>Quero aprender mais sobre SpringTool e MYSQL</h1>";
	}
	
}