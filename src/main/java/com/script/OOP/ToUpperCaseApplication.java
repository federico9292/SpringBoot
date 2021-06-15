package com.script.OOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ToUpperCaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToUpperCaseApplication.class, args);
	}

	@GetMapping("/toUpperCase")
	public String hello(@RequestParam(value = "string", defaultValue = "testo Qualsiasi") String string) {
		return string.toUpperCase();
	}

}
