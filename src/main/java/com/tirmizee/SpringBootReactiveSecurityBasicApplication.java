package com.tirmizee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties;

@SpringBootApplication
public class SpringBootReactiveSecurityBasicApplication {
	WebFluxProperties s;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactiveSecurityBasicApplication.class, args);
	}

}
