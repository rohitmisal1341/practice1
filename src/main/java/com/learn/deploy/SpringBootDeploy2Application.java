package com.learn.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootDeploy2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeploy2Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
		return application.sources(SpringBootDeploy2Application.class);
	}
}
