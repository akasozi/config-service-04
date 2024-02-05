package com.polarbookshop.configservice04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigService04Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigService04Application.class, args);
	}

}
