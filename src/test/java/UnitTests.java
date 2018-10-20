package test.java;
import static org.junit.Assert.*;

import java.util.*;
import main.java.*;
import org.junit.Test;


public class UnitTests {

	/**
	 * Node Coverage
	 * Test Seq: 	<20, 22, 24, 25, 26, 27, 28, 29, 30, 31, 32>
	 * Edge Coverage
	 * Test Seq: 	<20, 22, 24, 25, 26, 27, 28, 29, 30, 31, 32, 29, 28, 27>
	 * Condition Coverage
	 * Test Seq: 	<20, 22(false), 24, 25, 26, 27, 28, 29, 30, 31, 32>
	 * 				
	 */
	@Test
	public void test1() {
		Item[] items = new Item[] {new Item(5), new Item(4), new Item(3), new Item(2), new Item(1)};
		Item[] items1 = new Item[5];
		Item[] items2 = new Item[5];
		Item[] items3 = new Item[5];
		Item[] items4 = new Item[5];
		Item[] items5 = new Item[5];
		
		System.arraycopy(items, 0, items1, 0, 5);
		System.arraycopy(items, 0, items2, 0, 5);
		System.arraycopy(items, 0, items3, 0, 5);
		System.arraycopy(items, 0, items4, 0, 5);
		System.arraycopy(items, 0, items5, 0, 5);
		
		SortAlgos.bubbleSort(items);
		assertEquals(1, items[0].key);
		assertEquals(2, items[1].key);
		assertEquals(3, items[2].key);
		assertEquals(4, items[3].key);
		assertEquals(5, items[4].key);
		
		SortAlgos.heapSort(items1);
		assertEquals(1, items1[0].key);
		assertEquals(2, items1[1].key);
		assertEquals(3, items1[2].key);
		assertEquals(4, items1[3].key);
		assertEquals(5, items1[4].key);
		
		SortAlgos.insertionSort(items2);
		assertEquals(1, items2[0].key);
		assertEquals(2, items2[1].key);
		assertEquals(3, items2[2].key);
		assertEquals(4, items2[3].key);
		assertEquals(5, items2[4].key);
		
		SortAlgos.mergeSort(items3);
		assertEquals(1, items3[0].key);
		assertEquals(2, items3[1].key);
		assertEquals(3, items3[2].key);
		assertEquals(4, items3[3].key);
		assertEquals(5, items3[4].key);
		
		SortAlgos.quickSort(items4);
		assertEquals(1, items4[0].key);
		assertEquals(2, items4[1].key);
		assertEquals(3, items4[2].key);
		assertEquals(4, items4[3].key);
		assertEquals(5, items4[4].key);
		
		SortAlgos.selectionSort(items5);
		assertEquals(1, items5[0].key);
		assertEquals(2, items5[1].key);
		assertEquals(3, items5[2].key);
		assertEquals(4, items5[3].key);
		assertEquals(5, items5[4].key);
		
	}
	
	/**
	 * Node Coverage
	 * Test Seq: 	<20, 22(true)>
	 * Edge Coverage
	 * Test Seq: 	<20, 22(true)>
	 * Condition Coverage
	 * Test Seq: 	<20, 22(true)>
	 */
	@Test
	public void test2() {
		Item[] items = null;
		try {
			SortAlgos.bubbleSort(items);
			fail("Should throw Exception here");
		} catch(NullPointerException e) {
			System.out.println("Catch e successfully");
		}
		
		try {
			SortAlgos.heapSort(items);
			fail("Should throw Exception here");
		} catch(NullPointerException e) {
			System.out.println("Catch e successfully");
		}
		
		try {
			SortAlgos.insertionSort(items);
			fail("Should throw Exception here");
		} catch(NullPointerException e) {
			System.out.println("Catch e successfully");
		}
		
		try {
			SortAlgos.mergeSort(items);
			fail("Should throw Exception here");
		} catch(NullPointerException e) {
			System.out.println("Catch e successfully");
		}
		
		try {
			SortAlgos.quickSort(items);
			fail("Should throw Exception here");
		} catch(NullPointerException e) {
			System.out.println("Catch e successfully");
		}
		
		try {
			SortAlgos.selectionSort(items);
			fail("Should throw Exception here");
		} catch(NullPointerException e) {
			System.out.println("Catch e successfully");
		}
		
	}
	
	/**
	 * Condition Coverage
	 * Test Seq: 	<20, 22(false), 24, 25, 26, 27, 28>
	 */
	@Test
	public void test3() {
		Item[] items = new Item[] {new Item(1), new Item(2), new Item(3), new Item(4), new Item(5)};
		Item[] items1 = new Item[5];
		Item[] items2 = new Item[5];
		Item[] items3 = new Item[5];
		Item[] items4 = new Item[5];
		Item[] items5 = new Item[5];
		
		System.arraycopy(items, 0, items1, 0, 5);
		System.arraycopy(items, 0, items2, 0, 5);
		System.arraycopy(items, 0, items3, 0, 5);
		System.arraycopy(items, 0, items4, 0, 5);
		System.arraycopy(items, 0, items5, 0, 5);
		
		SortAlgos.bubbleSort(items);
		assertEquals(1, items[0].key);
		assertEquals(2, items[1].key);
		assertEquals(3, items[2].key);
		assertEquals(4, items[3].key);
		assertEquals(5, items[4].key);
		
		SortAlgos.heapSort(items1);
		assertEquals(1, items1[0].key);
		assertEquals(2, items1[1].key);
		assertEquals(3, items1[2].key);
		assertEquals(4, items1[3].key);
		assertEquals(5, items1[4].key);
		
		SortAlgos.insertionSort(items2);
		assertEquals(1, items2[0].key);
		assertEquals(2, items2[1].key);
		assertEquals(3, items2[2].key);
		assertEquals(4, items2[3].key);
		assertEquals(5, items2[4].key);
		
		SortAlgos.mergeSort(items3);
		assertEquals(1, items3[0].key);
		assertEquals(2, items3[1].key);
		assertEquals(3, items3[2].key);
		assertEquals(4, items3[3].key);
		assertEquals(5, items3[4].key);
		
		SortAlgos.quickSort(items4);
		assertEquals(1, items4[0].key);
		assertEquals(2, items4[1].key);
		assertEquals(3, items4[2].key);
		assertEquals(4, items4[3].key);
		assertEquals(5, items4[4].key);
		
		SortAlgos.selectionSort(items5);
		assertEquals(1, items5[0].key);
		assertEquals(2, items5[1].key);
		assertEquals(3, items5[2].key);
		assertEquals(4, items5[3].key);
		assertEquals(5, items5[4].key);
		
	}

	/**
	 * Condition Coverage
	 * Test Seq: 	<20, 22(false), 24, 25, 26, 27>
	 */
	@Test
	public void test4() {
		Item[] items = new Item[] {new Item(1)};
		Item[] items1 = new Item[1];
		Item[] items2 = new Item[1];
		Item[] items3 = new Item[1];
		Item[] items4 = new Item[1];
		Item[] items5 = new Item[1];
		
		System.arraycopy(items, 0, items1, 0, 1);
		System.arraycopy(items, 0, items2, 0, 1);
		System.arraycopy(items, 0, items3, 0, 1);
		System.arraycopy(items, 0, items4, 0, 1);
		System.arraycopy(items, 0, items5, 0, 1);
		
		SortAlgos.bubbleSort(items);
		assertEquals(1, items[0].key);
		
		SortAlgos.heapSort(items1);
		assertEquals(1, items1[0].key);
		
		SortAlgos.insertionSort(items2);
		assertEquals(1, items2[0].key);
		
		SortAlgos.mergeSort(items3);
		assertEquals(1, items3[0].key);
		
		SortAlgos.quickSort(items4);
		assertEquals(1, items4[0].key);
		
		SortAlgos.selectionSort(items5);
		assertEquals(1, items5[0].key);
		
	}

	
}
