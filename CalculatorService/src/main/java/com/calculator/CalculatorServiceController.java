package com.calculator;

import org.springframework.web.bind.annotation.*;
import com.calculator.model.Number;

@RestController
public class CalculatorServiceController {


	@PostMapping("/addition/")
	public Number addTwoNumbers(@RequestBody Number number) {
		if(number != null){
			if(number.getFirstNumber() != null && number.getSecondNumber() != null){
				number.setResult(number.getFirstNumber() +  number.getSecondNumber());
				return number;
			}
		}
		return null;
	}
}
