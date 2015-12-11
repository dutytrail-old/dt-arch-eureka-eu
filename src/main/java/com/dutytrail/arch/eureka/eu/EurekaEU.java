package com.dutytrail.arch.eureka.eu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaEU {

	public static void main(String[] args) {
		SpringApplication.run(EurekaEU.class, args);
	}

}
