package com.example;

public class Example2 {

	public int add(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("負数は入力できません");
		}
		return a + b;
	}
}
