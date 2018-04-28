package com.event.evet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.event.evet.repository")
public class EvetApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvetApplication.class, args);
	}
}
