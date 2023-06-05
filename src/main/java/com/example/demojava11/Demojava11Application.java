package com.example.demojava11;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@RestController("/")
public class Demojava11Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demojava11Application.class, args);
	}

	// run on startup
	@Override
	public void run(String... args) {
		log.info("StringBuilder: [{}]", new StringBuffer().toString());
	}

	@GetMapping("test")
	public String test() {log.info("get controller"); return "test response";}

}
