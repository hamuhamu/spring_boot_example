package com.example.stream.api;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void for文() {
		ArrayList<Integer> nabeAtsu = new ArrayList<Integer>();
		for (int i = 1; i <= 51; i++) {
			if (i % 3 == 0 || String.valueOf(i).matches("[0-9]?3[0-9]?")) {
				nabeAtsu.add(i);
			}
		}
		System.out.println(nabeAtsu);
	}

	@Test
	public void StreamAPIとラムダ式() {
		ArrayList<Integer> nabeAtsu = new ArrayList<Integer>();
		IntStream.range(1, 52).filter(i -> (i % 3 == 0 || String.valueOf(i).matches("[0-9]?3[0-9]?")))
				.forEach(i -> nabeAtsu.add(i));

		System.out.println(nabeAtsu);
		nabeAtsu.forEach(e -> System.out.print(e + ", "));
		System.out.println("");
	}

	@Test
	public void 並列実行は元データの並び順は保障されない() {
		List<String> list = Arrays.asList("list1", "list2", "list3", "list4", "list5");

		list.stream().forEach(e -> System.out.println("stream: " + e));
		list.parallelStream().forEach(e -> System.out.println("parallelStream: " + e));
	}
}
