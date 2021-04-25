package com.pijush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TicketApplicationClient {

	public static void main(String[] arguments) {
		SpringApplication.run(TicketApplicationClient.class, arguments);
	}
}
