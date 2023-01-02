package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.calculator.model.Number;

@RestController
public class CalculatorController {

	@Autowired
	PseudoServiceForCalculatorService pseudoServiceForCalculatorService;
	
	@RequestMapping("/")
	public String welcome() {
		return "Calculator Client Application";
	}

	@PostMapping("/addition/")
	public Number addTwoNumbers(@RequestBody Number number) {
		Number num = pseudoServiceForCalculatorService.callService(number);
		return num;
	}

}
