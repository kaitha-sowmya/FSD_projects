package com.sportyshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sportyshoes.controllers"+"com.sportyshoes.entity"+"com.sportyshoes.repository"+"com.sportyshoes.service")
public class Sportyshoes1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sportyshoes1Application.class, args);
	}

}
