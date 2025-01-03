package com.gestionBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.am.snacks.model")
@EnableJpaRepositories(basePackages = "com.gestionBackend.repository")

public class GestionBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionBackendApplication.class, args);
	}

}
