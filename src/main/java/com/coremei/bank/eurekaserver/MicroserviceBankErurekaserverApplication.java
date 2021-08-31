package com.coremei.bank.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceBankErurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBankErurekaserverApplication.class, args);
	}

}
