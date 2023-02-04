package com.Math;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.Ravi.Calculator;

public class MathTest {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("Before class");
	}

	@Before
	public void Before() {
		System.out.println("Before");
	}

	@After
	public void after() {
		System.out.println("After");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		Calculator cal = new Calculator();
		assertEquals(30, cal.sum(10, 20));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		System.out.println("test2");
		Calculator cal = new Calculator();
		cal.sum(-10, 20);
	}

	@Test(expected = IllegalArgumentException.class)

	public void test3() {
		System.out.println("test3");
		Calculator cal = new Calculator();
		cal.sum(10, -20);
	}

	@Test(expected = IllegalArgumentException.class)
	
	public void test4() {
		System.out.println("test4");
		Calculator cal = new Calculator();
		cal.sum(-10, -20);
	}
	@Test(timeout = 6000)
	public void test5() {
		System.out.println("test5");
		Calculator cal = new Calculator();
		cal.sum(10, 20);
	}
	

	@AfterClass
	public static void afterclass() {
		System.out.println("After Class");
	}
}
