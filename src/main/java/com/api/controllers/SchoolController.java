package com.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.SchoolDto;

@RestController
@RequestMapping("get")
public class SchoolController {

	@RequestMapping(value = "/Service")
	public SchoolDto getSchool() {

		SchoolDto pr = new SchoolDto();

		pr.setSchool("PVCC");
		pr.setEmail("pvc54@gmail.com");
		pr.setAddress("177 Yellowston Dr");
		pr.setCity("Charlottesville");
		pr.setState("VA");
		pr.setCountry("USA");

		return pr;
	}

}
