package com.example.filedemodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class FileDemoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileDemoDbApplication.class, args);
	}
}
