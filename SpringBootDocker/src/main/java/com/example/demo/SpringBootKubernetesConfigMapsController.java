package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpringBootKubernetesConfigMapsController {

	@Value("${configmap.variable1}")
	private String variable1;

	@RequestMapping("/")
	public String welcome() {

		return "Spring Boot Kubernetes ConfigMap " + variable1;
	}

	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot Kubernetes ConfigMap"+ variable1;
	}

	@RequestMapping("/hello/{name}")
	public String helloDocker(@PathVariable(value = "name") String name) {
		String response = "Hello " + name;
		return response;

	}
}