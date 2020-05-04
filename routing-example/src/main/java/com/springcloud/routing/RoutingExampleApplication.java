package com.springcloud.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RoutingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingExampleApplication.class, args);
	}
	
	@RequestMapping(value = "/available")
	public String available() {
		return "This is available response";
	}
	
	@RequestMapping(value = "/checkout")
	public String checkout() {
		return "This is checkout response";		
	}	

}
