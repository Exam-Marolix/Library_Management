package com.hrdcrlrner.library;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "messages.properties")
@SpringBootApplication(scanBasePackages = "com.hrdcrlrner.*")
public class LibraryManagementApplication {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

}
