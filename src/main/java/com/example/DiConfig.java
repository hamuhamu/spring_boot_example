package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.di.CalculatorInterface;
import com.example.di.Fronted;
import com.example.di.AddCalculator;
import com.example.di.Argument;

// JavaConfigの宣言
@Configuration
public class DiConfig {

	// シングルインスタンスになる
	@Bean
	CalculatorInterface calculator() {
		return new AddCalculator();
	}

	@Bean
	Argument argument() {
		return new Argument(1, 28);
	}

	@Bean
	Fronted fronted() {
		return new Fronted();
	}
}
