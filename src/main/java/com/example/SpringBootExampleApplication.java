package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.ApplicationContext;
import com.example.di.CalculatorInterface;

@SpringBootApplication
@EnableAutoConfiguration
@Import(DiConfig.class)
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootExampleApplication.class, args);
		CalculatorInterface c = context.getBean(CalculatorInterface.class);
		System.out.println(c.calc(1, 2));
	}
}
