package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Sort;

class BubbleSort {

	@Test
	void test() {
		Sort<Integer> sort = new Sort<Integer>();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1565455);
		lista.add(500);
		lista.add(250);
		lista.add(1000);
		lista.add(750);
		lista.add(60);
		lista.add(1200);
		lista = sort.bubbleSort(lista);
		assertEquals(lista.get(6), 1565455);
		assertEquals(lista.get(5), 1200);
		assertEquals(lista.get(4), 1000);
		assertEquals(lista.get(3), 750);
		assertEquals(lista.get(2), 500);
		assertEquals(lista.get(1), 250);
		assertEquals(lista.get(0), 60);
	}

}
