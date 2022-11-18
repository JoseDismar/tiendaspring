package co.com.example.tienda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	//@GetMapping("/status")
	@GetMapping("/healtcheck")
	public String status() {
		return "ok";
	}
	@GetMapping("/error")
	public String error() {
		return "ups, la cagaste";
	}
	
}
