package com.ibm.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ManageCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageCurrencyConversionApplication.class, args);
	}

}
