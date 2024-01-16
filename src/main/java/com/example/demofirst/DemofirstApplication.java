package com.example.demofirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class DemofirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemofirstApplication.class, args);
	}

}

