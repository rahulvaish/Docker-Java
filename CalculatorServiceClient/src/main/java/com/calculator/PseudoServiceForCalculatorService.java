package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.calculator.model.Number;

@Service
public class PseudoServiceForCalculatorService {

	@Autowired
	RestTemplate restTemplate;

	public Number callService(Number number) {

		Number sum = restTemplate.postForObject("http://calculatorservice:8080/addition/",number, Number.class);
		return sum;
	}

}