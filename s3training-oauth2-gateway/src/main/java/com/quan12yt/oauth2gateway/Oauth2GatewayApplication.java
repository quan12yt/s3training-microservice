package com.quan12yt.oauth2gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Oauth2GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2GatewayApplication.class, args);
	}

}
