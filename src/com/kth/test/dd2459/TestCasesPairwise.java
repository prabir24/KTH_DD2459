package com.kth.test.dd2459;

import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.kth.dd2459.BinarySearch;
import com.kth.dd2459.Sorting;

class TestCasesPairwise {

	static Sorting sort = null;
	static BinarySearch search = null;
	static Scanner scanner = null;
	static int arr[] = null;

	static int[] convertStrtoArr(String str) {
		int str_length = str.length();

		int[] arr = new int[20];

		int j = 0, i;

		for (i = 0; i < str_length; i++) {

			if (str.charAt(i) == ',') {
				j++;
			} else {
				arr[j] = arr[j] * 10 + (str.charAt(i) - 48);
			}
		}
		for(i = 0; i< 20; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		return arr;
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sort = new Sorting();
		search = new BinarySearch();
		scanner = new Scanner(new File("Data_20.txt"));
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		sort = null;
		search = null;
	}

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test()
	void test() {
		
		while(scanner.hasNext()) {
			arr = convertStrtoArr(scanner.nextLine());
			sort.sort(arr);
			boolean res = search.membership(arr, 20);
			try {
				Assert.assertEquals(true, res);
			} catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	@Test()
	void test1() {
		
		while(scanner.hasNext()) {
			arr = convertStrtoArr(scanner.nextLine());
			sort.sort(arr);
			boolean res = search.membership(arr, 1);
			try {
				Assert.assertEquals(true, res);
			} catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
