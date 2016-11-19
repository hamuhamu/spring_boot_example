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

	@Test
	public void lambda式の外のローカル変数にアクセス() {
		// ローカルに宣言した値を参照できるが、基本的に定数を使用するべき
		double b = 1.41;
		IntToDoubleFunction lambda = (int x) -> {
			// ラムダ式内で、ラムダ式の外の変数の値を書き換えることはできない
			// b = 1.41
			return x * x * b;
		};

		System.out.println(lambda.applyAsDouble(100));
	}

	private int classField = 0;
	private static int staticField = 0;

	@Test
	public void lambda式の外のグローバル変数にアクセス() {
		DoSomethingInterface lambda = () -> {
			this.classField++;
			ExampleTest.staticField++;
		};
		System.out.println("Before; classField " + this.classField);
		System.out.println("Before; staticField=" + ExampleTest.staticField);

		lambda.doSomething();

		// グローバル変数の中身が変わってしまう
		System.out.println("After; classField=" + this.classField);
		System.out.println("After; staticField=" + ExampleTest.staticField);
	}

	@FunctionalInterface
	interface IMyFunc {
		Date func();
	}

	@FunctionalInterface
	public interface DoSomethingInterface {
		void doSomething();
	}
}