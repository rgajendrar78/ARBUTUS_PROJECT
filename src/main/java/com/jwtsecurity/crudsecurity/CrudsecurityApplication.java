package com.jwtsecurity.crudsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class CrudsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudsecurityApplication.class, args);
	}

}
