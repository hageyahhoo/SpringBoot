package com.metflix;

import org.apache.catalina.filters.RequestDumperFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MembershipApplication {

	@Bean
	protected RequestDumperFilter requestDumperFiler() {
		return new RequestDumperFilter();
	}


	public static void main(String[] args) {
		SpringApplication.run(
				MembershipApplication.class,
				args);
	}
}
