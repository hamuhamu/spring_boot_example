package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// このアノテーションを付けることで、コントローラクラスになる
@RestController
public class HelloController {

	// このアノテーションを付けることで、GETを受け付けるメソッドだと宣言
	@GetMapping("/")
	public String sayHello() {
		return "Hello world";
	}
}
