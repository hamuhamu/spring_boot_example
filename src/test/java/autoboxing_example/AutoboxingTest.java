package autoboxing_example;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class AutoboxingTest {

	@Test
	public void オートボクシングできること() {
		int int_i = 100;
		// オートボクシングが起きる
		Integer Int_i = int_i;

		assertEquals(100, Int_i.intValue());
	}

	@Test
	public void オートボクシングできEqual比較で偽が返ること() {
		int int_i = 100;
		// オートボクシングが起きる
		Integer Int_i = int_i + 10000;
		Integer Int_i2 = 100100;

		// 参照比較になり==の比較がfalseになる
		// @see http://typea.info/blg/glob/2007/01/java.html
		assertEquals(false, Int_i == Int_i2);
	}

	@Test
	public void オートアンボクシングできること() {
		Integer Int_i = 100;
		// オートアンボクシングが起きる
		int int_i = Int_i;

		assertEquals(100, int_i);
	}

	@Test(expected = NullPointerException.class)
	public void オートアンボクシングでぬるぽが起きること() {
		Integer Int_i = null;
		// オートアンボクシングが起きる
		int int_i = Int_i;
	}
}
