package com.kata;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

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
	 * divisors have high precedence, ex: 51 -> FooBar the content is analysed in
	 * the order they appear, ex: 53 -> BarFoo 13 contains 3 so we print "Foo" 15 is
	 * divisible by 3 and 5 and contains 5, so we print “FooBarBar” 33 contains 3
	 * two times and is divisible by 3, so we print “FooFooFoo” 27 is divisible by 3
	 * and contains 7, so we print "FooQix"
	 */
	@Test
	public void sould_return_the_remplacement_string_as_map_value() {
		FooBarKata fooBarKata = new FooBarKata();

		Map<Integer, String> givenResult = new HashMap<>();
		givenResult.put(1, "1");
		givenResult.put(51, "FooBar");
		givenResult.put(53, "BarFoo");
		givenResult.put(13, "Foo");
		givenResult.put(15, "FooBarBar");
		givenResult.put(33, "FooFooFoo");
		givenResult.put(27, "FooQix");

		givenResult.entrySet()
				.forEach(map -> assertEquals(fooBarKata.replaceNumberWithRules(map.getKey()), map.getValue()));
	}
}