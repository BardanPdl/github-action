package com.example.demooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoooApplication {
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
//	echo "# github-action" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin git@github.com:BardanPdl/github-action.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(DemoooApplication.class, args);
	}

}
