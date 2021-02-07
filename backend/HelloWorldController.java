package com.example.actuatorservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.time.LocalDate;

@Controller
public class HelloWorldController {
	
	@GetMapping("/api/all")
	@ResponseBody
	@CrossOrigin
	public Allj allOut(String[] args) {
		return new Allj();
	}

	              
}
