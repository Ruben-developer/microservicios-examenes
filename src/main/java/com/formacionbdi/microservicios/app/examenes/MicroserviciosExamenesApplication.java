package com.formacionbdi.microservicios.app.examenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import jdk.jfr.Enabled;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosExamenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosExamenesApplication.class, args);
	}

}
