package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// このアノテーションを付けることで、コントローラクラスになる
@RestController
public class HelloController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello world";
	}
}
