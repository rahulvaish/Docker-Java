package com.calculator;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.model.Number;
import com.calculator.service.CalculatorServiceFloat;
import com.calculator.service.CalculatorServiceInteger;

@RestController
public class CalculatorServiceController {

	@RequestMapping("/")
	public String welcome() {
		return "Calculator Service Application";
	}

	@RequestMapping(value = "/addition/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatAddition(@RequestBody Number number) {
		CalculatorServiceFloat calculator = new CalculatorServiceFloat();		
		return String.valueOf(calculator.addition(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/substraction/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatSubstraction(@RequestBody Number number) {
		CalculatorServiceFloat calculator = new CalculatorServiceFloat();
		return String.valueOf(calculator.substraction(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/multiplication/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatMultiplication(@RequestBody Number number) {
		CalculatorServiceFloat calculator = new CalculatorServiceFloat();
		return String.valueOf(calculator.multiplication(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/division/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatDivision(@RequestBody Number number) {
		CalculatorServiceFloat calculator = new CalculatorServiceFloat();
		return String.valueOf(calculator.division(number.getFirstNumber(), number.getSecondNumber()));
	}

	// -----------------------

	@RequestMapping(value = "/addition/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intAddition(@RequestBody Number number) {
		CalculatorServiceInteger calculator = new CalculatorServiceInteger();
		return String.valueOf(calculator.addition(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/substraction/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intSubstraction(@RequestBody Number number) {
		CalculatorServiceInteger calculator = new CalculatorServiceInteger();
		return String.valueOf(calculator.substraction(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/multiplication/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intMultiplication(@RequestBody Number number) {
		CalculatorServiceInteger calculator = new CalculatorServiceInteger();
		return String.valueOf(calculator.multiplication(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/division/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intDivision(@RequestBody Number number) {
		CalculatorServiceInteger calculator = new CalculatorServiceInteger();
		return String.valueOf(calculator.division(number.getFirstNumber(), number.getSecondNumber()));
	}

}
