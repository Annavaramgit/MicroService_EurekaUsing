package com.vaccinatioinfo_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;




@SpringBootApplication
@EnableDiscoveryClient
public class VaccinationInfoCitizenMicroService1Application {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationInfoCitizenMicroService1Application.class, args);
	}

//	@Bean
//	@LoadBalanced
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
//	
	@Bean
	@LoadBalanced
	WebClient.Builder createLoadBalancedBuilder() { return WebClient.builder(); }

	@Bean
	WebClient client(WebClient.Builder builder) { return builder.build(); }
	
	
}
