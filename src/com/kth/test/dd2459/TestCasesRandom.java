package com.kth.test.dd2459;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

import com.kth.dd2459.BinarySearch;
import com.kth.dd2459.Sorting;

class TestCasesRandom {

	static Random random = null;
	static Sorting sort = null;
	static BinarySearch search = null;
	int noOfElements;
	int[] ArrElements = null;
	int bound = 1000;
	int maxSize = 100;
	int key = 0;

	@BeforeAll
	static void setUpAll() {
		random = new Random();
		sort = new Sorting();
		search = new BinarySearch();
	}

	@BeforeEach
	void setUp() throws Exception {
		noOfElements = random.nextInt(maxSize);
		ArrElements = new int[noOfElements];
		for (int i = 0; i < noOfElements; i++)
			ArrElements[i] = random.nextInt(bound);
	}

	@AfterEach
	void tearDown() throws Exception {
		noOfElements = 0;
		ArrElements = null;
	}

	@AfterAll
	static void tearDownAll() {
		random = null;
		sort = null;
		search = null;
	}

	@RepeatedTest(100)
	void test1(RepetitionInfo info) {

		System.out.println("---TESTCASE 1----REPETITION NO " + info.getCurrentRepetition() + " -----------");
		System.out.println("No. of elements in the array - " + noOfElements);
		sort.sort(ArrElements);
		assertEquals(true, sort.checkSort(ArrElements), "Array not Sorted");

		System.out.println("---------------------------------------------------");
	}

	@Test
	void test2_Sunny() {
		System.out.println("---TESTCASE 2 -------------------------------------");
		System.out.println("No. of elements in the array - " + noOfElements);
		sort.sort(ArrElements);
		boolean res = search.membership(ArrElements, ArrElements[ArrElements.length - 1]);
		assertEquals(true, res);
		System.out.println("---------------------------------------------------");
	}

	@Test
	void test3_Sunny() {
		System.out.println("---TESTCASE 3--------------------------------------");
		System.out.println("No. of elements in the array - " + noOfElements);
		sort.sort(ArrElements);
		boolean res = search.membership(ArrElements, ArrElements[0]);
		assertEquals(true, res);
		System.out.println("---------------------------------------------------");
	}

	@RepeatedTest(100)
	void test4_Sunny(RepetitionInfo info) {
		System.out.println("---TESTCASE 4--------REPETITION NO " + info.getCurrentRepetition() + "------------------------------");
		System.out.println("No. of elements in the array - " + noOfElements);
		key = ArrElements[random.nextInt(noOfElements)];
		sort.sort(ArrElements);
		boolean res = search.membership(ArrElements, key);
		assertEquals(true, res);
		System.out.println("---------------------------------------------------");
	}

	@Test
	void test5_Rainy() {
		System.out.println("---TESTCASE 5--------------------------------------");
		System.out.println("No. of elements in the array - " + noOfElements);
		sort.sort(ArrElements);
		boolean res = search.membership(ArrElements, bound + 1);
		assertEquals(false, res);
		System.out.println("---------------------------------------------------");
	}

	@Test
	void test6_Rainy() {
		System.out.println("---TESTCASE 6--------------------------------------");
		System.out.println("No. of elements in the array - " + noOfElements);
		// sort.sort(ArrElements);
		key = random.nextInt(noOfElements);
		boolean res = search.membership(ArrElements, ArrElements[key]);
		assertEquals(false, res);
		System.out.println("---------------------------------------------------");
	}

	@Test
	void test7_Rainy() {
		System.out.println("---TESTCASE 7--------------------------------------");
		System.out.println("No. of elements in the array - " + noOfElements);
		// sort.sort(ArrElements);
		boolean res = search.membership(ArrElements, ArrElements[0]);
		assertEquals(false, res);
		System.out.println("---------------------------------------------------");
	}

}
