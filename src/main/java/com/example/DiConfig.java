package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.di.CalculatorInterface;
import com.example.di.AddCalculator;

// JavaConfigの宣言
@Configuration
public class DiConfig {

	// シングルインスタンスになる
	@Bean
	CalculatorInterface calculator() {
		return new AddCalculator();
	}
}
