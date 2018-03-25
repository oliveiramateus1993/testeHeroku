package com.mateusoliveira.testeheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class TesteherokuApplication {

	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Hello Word!";
	}

	public static void main(String[] args) {
		SpringApplication.run(TesteherokuApplication.class, args);
	}
}
