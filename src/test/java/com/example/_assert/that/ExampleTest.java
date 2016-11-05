package com.example._assert.that;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void テストassertTrue() {

		assertTrue("10と11は同じ値ではない", 10 == 11);
	}

	@Test
	public void テストassertThat() {
		int age = 33;
		assertThat(age < 30, is(true));
		// 失敗時のエラーメッセージ
		// Expected: is <true>
		// but: was <false>

	}

	@Test
	public void テストassertThat2() {
		String actual = "hoge";
		// trueになるコード
		// assertThat(actual, is(allOf(startsWith("h"), endsWith("e"))));
		// assertThat(actual, is(allOf(startsWith("h"), containsString("og"),
		// endsWith("e"))));

		assertThat(actual, is(allOf(startsWith("x"), endsWith("o"))));
		assertThat(actual, is(allOf(startsWith("p"), containsString("nn"), endsWith("p"))));

		// Expected: is (a string starting with "x" and a string ending with
		// "o")
		// but: a string starting with "x" was "hoge"

		// Expected: is (a string starting with "p" and a string containing "nn"
		// and a string ending with "p")
		// but: a string starting with "p" was "hoge"

	}
}
