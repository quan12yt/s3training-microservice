package com.quan12yt.s3trainingoauth2client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class S3trainingOauth2ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3trainingOauth2ClientApplication.class, args);
	}

}
