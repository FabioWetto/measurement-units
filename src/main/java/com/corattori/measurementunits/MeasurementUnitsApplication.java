package com.corattori.measurementunits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MeasurementUnitsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MeasurementUnitsApplication.class, args);
		System.out.println("Ready!");
	}

}
