package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// このアノテーションを付けることで、コントローラクラスになる
@RestController
public class HelloController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hello world";
	}
}
