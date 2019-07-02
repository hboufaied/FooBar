package com.kata;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author Hamda BOUFAIED
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class FooBarKataTest {

	/*
	 * divisors have high precedence, ex: 51 -> FooBar
     * the content is analysed in the order they appear, ex: 53 -> BarFoo
     * 13 contains 3 so we print "Foo"
     * 15 is divisible by 3 and 5 and contains 5, so we print “FooBarBar”
     * 33 contains 3 two times and is divisible by 3, so we print “FooFooFoo”
     * 27 is divisible by 3 and contains 7, so we print "FooQix"
	 */
	FooBarKata fooBarKata;

	@Before
	public void beforeEachTestMethod() {
		fooBarKata = new FooBarKata();
	}

	@Test
	public void sould_return_1_when_number_is_1() {
		// given
		int number = 1;
		// when
		String fooBarString = fooBarKata.replaceNumberWithRules(number);
		// then
		assertTrue(fooBarString.equals("1"));
	}

	@Test
	public void sould_return_FooBar_when_number_is_51() {
		// given
		int number = 51;
		// when
		String fooBarString = fooBarKata.replaceNumberWithRules(number);
		// then
		assertTrue(fooBarString.equals("FooBar"));
	}

	@Test
	public void sould_return_BarFoo_when_number_is_53() {
		// given
		int number = 53;
		// when
		String fooBarString = fooBarKata.replaceNumberWithRules(number);
		// then
		assertTrue(fooBarString.equals("BarFoo"));
	}

	// 13 contains 3 so we print "Foo"
	@Test
	public void sould_return_Foo_when_number_is_13() {
		// given
		int number = 13;
		// when
		String fooBarString = fooBarKata.replaceNumberWithRules(number);
		// then
		assertTrue(fooBarString.equals("Foo"));
	}

	// 15 is divisible by 3 and 5 and contains 5, so we print “FooBarBar”
	@Test
	public void sould_return_FooBarBar_when_number_is_15() {
		// given
		int number = 15;
		// when
		String fooBarString = fooBarKata.replaceNumberWithRules(number);
		// then
		assertTrue(fooBarString.equals("FooBarBar"));
	}

	// 33 contains 3 two times and is divisible by 3, so we print “FooFooFoo”
	@Test
	public void sould_return_FooFooFoo_when_number_is_33() {
		// given
		int number = 33;
		// when
		String fooBarString = fooBarKata.replaceNumberWithRules(number);
		// then
		assertTrue(fooBarString.equals("FooFooFoo"));
	}

	// 27 is divisible by 3 and contains 7, so we print "FooQix"
	@Test
	public void sould_return_FooQix_when_number_is_27() {
		// given
		int number = 27;
		// when
		String fooBarString = fooBarKata.replaceNumberWithRules(number);
		// then
		assertTrue(fooBarString.equals("FooQix"));
	}
}