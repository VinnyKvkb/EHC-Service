package com.magnit.ehcservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,IntegrationAutoConfiguration.class })
public class     EHCServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EHCServiceApplication.class, args);

	}

}
