package com.csm.tech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

	@GetMapping("/get")
	public String getAPI() {
		return "Welcome A";
	}
}
