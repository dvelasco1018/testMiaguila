package com.miaguila.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan("com.miaguila.test.model")
@EnableJpaRepositories("com.miaguila.test.repositories")
@ComponentScan("com.miaguila.test.service")
@ComponentScan("com.miaguila.test.controller")
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
