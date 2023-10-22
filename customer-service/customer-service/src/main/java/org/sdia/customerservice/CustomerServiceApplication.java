package org.sdia.customerservice;

import org.sdia.customerservice.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.sdia.customerservice.repo.CustomerRepository;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
					Customer.builder().name("Sanaa").email("Sanaa@gmail.com").build(),
					Customer.builder().name("Sakura").email("Sakura@gmail.com").build(),
					Customer.builder().name("Oumaima").email("Oumaima@gmail.com").build()

					));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
