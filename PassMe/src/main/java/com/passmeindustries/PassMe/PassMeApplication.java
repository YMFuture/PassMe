package com.passmeindustries.PassMe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.passmeindustries.passme.repository")
@EntityScan("com.passmeindustries.passme")
@SpringBootApplication
public class PassMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassMeApplication.class, args);
	}
}
