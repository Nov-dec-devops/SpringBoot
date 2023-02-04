package com.Ravi.math;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.Ravi.Math.Calculator;

public class MathTest {

	public static Calculator cal = null;

	@Test
	public void test1() {
		System.out.println("test1");
		cal = new Calculator();
		assertEquals(30, cal.sum(10, 20));
	}

	@Test
	@Ignore
	public void test2() {
		System.out.println("test2");
		cal = new Calculator();
		cal.sum(-10, 20);
	}

	@Test
	public void test3() {
		System.out.println("test3");
		cal = new Calculator();
		cal.sum(10, -20);
	}

	@Test
	public void test4() {
		System.out.println("test4");
		cal = new Calculator();
		cal.sum(-10, -20);
	}
}
