package com.semihsahinoglu.news_microservices_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NewsMicroservicesConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsMicroservicesConfigApplication.class, args);
	}

}
