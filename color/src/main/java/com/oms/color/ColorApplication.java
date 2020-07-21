package com.oms.color;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ColorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColorApplication.class, args);
	}

}
