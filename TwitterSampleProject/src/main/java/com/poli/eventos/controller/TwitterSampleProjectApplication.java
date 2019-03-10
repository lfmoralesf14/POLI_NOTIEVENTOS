package com.poli.eventos.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan (basePackages="com.poli.devweb.twitterSample,servicios,com.poli.devweb.repositories,com.poli.devweb.model.entities")
@EntityScan(basePackages = {"com.poli.devweb.model.entities"}) 
@EnableJpaRepositories ("com.poli.devweb.repositories")
public class TwitterSampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterSampleProjectApplication.class, args);
	}

}

