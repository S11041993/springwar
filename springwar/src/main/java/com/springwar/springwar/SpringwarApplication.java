package com.springwar.springwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringwarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwarApplication.class, args);
	}
	
	@GetMapping("/greeting")
	public String home()
	{
		return "war file deployed";
	}
	
	@GetMapping("/greetings")
	public String homes()
	{
		return "war file deployed successfully";
	}

}
