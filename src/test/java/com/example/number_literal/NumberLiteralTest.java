package com.example.number_literal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberLiteralTest {

	// 数値は_で区切って記述することができる
	public int NUM = 100_000;

	@Test
	public void サンプルテスト() {
		assertEquals(100000, this.NUM);
	}
}
