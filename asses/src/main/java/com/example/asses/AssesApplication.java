package com.example.asses;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@EnableJpaRepositories(basePackages={"com.repository.employee"})
@ComponentScan(basePackages={"com.employee.controllers","com.repository.employee.search"
})

@EntityScan(basePackages={"com.asses.model"})
@OpenAPIDefinition
@SpringBootApplication
public class AssesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssesApplication.class, args);
		System.out.println("Working.....");
	}

}
