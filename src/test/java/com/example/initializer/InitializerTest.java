package com.example.initializer;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class InitializerTest {

	@Test
	public void インスタンスイニシャライザを使えること() {
		InstanceInitializer initializer = new InstanceInitializer();

		assertSame("たろう", initializer.name);
		assertSame(11, initializer.hoge[10]);
	}

	@Test
	public void スタティックイニシャライザを使えること() {

		assertSame("じろう", StaticInitializer.name);
		assertSame("大阪", StaticInitializer.adress);
	}
}
