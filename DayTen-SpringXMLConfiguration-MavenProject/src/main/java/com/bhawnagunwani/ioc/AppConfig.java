package com.bhawnagunwani.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bhawnagunwani.models.Customer;

@Configuration
public class AppConfig {

	@Bean
	public Customer customerBean() {
		Customer customer = new Customer();
		customer.setName("King Kochhar");
		return customer;
	}
	
}
