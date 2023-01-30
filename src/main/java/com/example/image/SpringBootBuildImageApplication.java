package com.example.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootBuildImageApplication {

	@GetMapping("/api/image")
	public String getMsg(){
		return "Create docker from SB app";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBuildImageApplication.class, args);
	}

}
