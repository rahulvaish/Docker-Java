package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorServiceController {

	@RequestMapping("/")
	public String welcome() {
		return "SpringBoot Project to Experiment K8 Probing";
	}
	
	@RequestMapping("/geterror")
	public String geterror() {
		return String.valueOf(1/0);
	}

}
