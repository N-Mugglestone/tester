package com.testing.tester;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TesterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesterApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository) {
		return args -> {

			Address address = new Address(
					"England",
					"London",
					"NE9 4RF"
			);
			Student student = new Student(
					"Jamila",
					"Ahmed",
					"jahmed@google.co.uk",
					Gender.FEMALE,
					address,
					"IT",
					LocalDateTime.now()
			);

			repository.save(student);
		};
	}

}
