package com.learn.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

	@GetMapping("/")
	public String home() {
		return "hey buddy you are on home page";
	}
}
