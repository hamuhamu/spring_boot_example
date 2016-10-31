package com.example.initializer;

public class StaticInitializer {

	public static String name = "じろう";
	public static String adress = "東京";

	// インスタンスイニシャライザ
	static {
		adress = "大阪";
	}
}
