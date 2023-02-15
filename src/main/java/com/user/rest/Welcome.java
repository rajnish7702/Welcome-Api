package com.user.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("/welcomeApi")
	public String welcome() {
		return "Welcome to Api";
	}

}
