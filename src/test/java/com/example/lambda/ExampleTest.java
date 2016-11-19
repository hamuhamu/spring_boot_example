package com.example.lambda;

import static org.junit.Assert.assertSame;

import java.util.Date;
import java.util.Optional;
import java.util.function.IntToDoubleFunction;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void FunctionalInterfaceを使用する() {
		// @FunctionalInterfaceを継承しなければならない
		IMyFunc lambda = () -> {
			return new Date();
		};

		System.out.println(lambda.func().toString());
	}

	@Test
	public void IntToDoubleFunctionを使用する() {

		IntToDoubleFunction lambda = (int x) -> {
			return x * x * 3.14;
		};

		System.out.println(lambda.applyAsDouble(100));
	}

}

@FunctionalInterface
interface IMyFunc {
	Date func();
}