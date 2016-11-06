package com.example.optional;

import static org.junit.Assert.assertSame;

import java.util.Optional;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void Optionalを使わない() {
		String hoge = this.getHoge();

		// nullチェック
		if (hoge != null) {
			// hogeがnullじゃなければ文字数取得
			// nullチェックをしていないとNullPointerExceptionになる
			System.out.println(hoge.length());

		}
	}

	public void Optionalを使う() {
		Optional<String> hogeOpt = Optional.ofNullable(this.getHoge());

		// ifPresentメソッドは、保持している値が存在している（nullでない）場合だけ、引数のラムダ式（Consumer型）を実行します
		hogeOpt.ifPresent(hoge -> System.out.println(hoge.length()));
	}

	public String getHoge() {
		return null;
	}
}
