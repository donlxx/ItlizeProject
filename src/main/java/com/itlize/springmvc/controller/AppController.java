package com.itlize.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = { "/test/{value}" }, method = RequestMethod.GET)
	public String newEmployee(@PathVariable String value) {
		
		return value;
		//return "registration";
	}

}
