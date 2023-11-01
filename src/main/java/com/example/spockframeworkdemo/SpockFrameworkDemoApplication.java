package com.example.spockframeworkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.spockframeworkdemo.dominio.*")
@ComponentScan(basePackages = {"com.example.spockframeworkdemo.*"})
@EntityScan("com.example.spockframeworkdemo.dominio.*")
@SpringBootApplication
public class SpockFrameworkDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpockFrameworkDemoApplication.class, args);
	}

}
