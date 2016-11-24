package com.example.lambda;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;
import java.util.function.IntToDoubleFunction;

import org.junit.Test;

public class DataSortTest {

	@Test
	public void 並び替えできること() {
		int[] numbers = { -2, 0, 1, 4, 5, -8 };
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		for (int n : numbers) {
			numbersList.add(n);
		}
		// 昇順
		Comparator<Integer> c1 = (n1, n2) -> n1 - n2;
		Collections.sort(numbersList, c1);

		System.out.println(numbersList);

		// 昇順
		Comparator<Integer> c2 = (n1, n2) -> n2 - n1;
		Collections.sort(numbersList, c2);
	}
}