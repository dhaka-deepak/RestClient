package com.deepak.Rest_Template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateApplication.class, args);
	}

	@Bean
	public RestClient restClient(){
		return RestClient.builder()
				.baseUrl("https://jsonplaceholder.typicode.com")
				.build();
	}
}
