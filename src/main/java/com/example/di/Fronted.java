package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Fronted {
	@Autowired
	private Argument arg;
	@Autowired
	private CalculatorInterface calculator;

	public void run() {
		int a = this.arg.getA();
		int b = this.arg.getB();
		int calced = this.calculator.calc(a, b);

		System.out.println(calced);
	}
}
