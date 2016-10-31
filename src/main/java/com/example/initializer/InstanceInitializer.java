package com.example.initializer;

public class InstanceInitializer {

	public int[] hoge = new int[100];
	public String name = "たろう";

	// インスタンスイニシャライザ
	{
		for (int i = 0; i < hoge.length; i++) {
			hoge[i] = i + 1;
		}
	}
}
