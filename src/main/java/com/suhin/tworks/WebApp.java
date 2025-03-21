package com.suhin.tworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class WebApp {

	public static void main(String[] args) {
		SpringApplication.run(WebApp.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "pages/index";
	}

	@GetMapping("/sign-up")
	public String signUp() {
		return "pages/user/signup";
	}

	@GetMapping("/find")
	public String findUser() {
		return "pages/user/find";
	}
}
