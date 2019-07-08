package com.kata;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static java.lang.Character.getNumericValue;
import static java.util.stream.Collectors.joining;

/**
 * @author Hamda BOUFAIED 
 * FoorBarKatacheck the number with following rules and
 * display the string in new line 
 * <code>Rules</code> 
 * if the number is divisible by 3 or contains 3, replace 3 by "Foo"
 * if the number is divisible by 5 or contains 5, replace 5 by "Bar"; 
 * if the number contains 7, replace by "Qix";
 *
 */
public class FooBarKata {

	public static void main(String[] args) {
		FooBarKata fooBar = new FooBarKata();
		IntStream.rangeClosed(1, 100)
				.mapToObj(a -> fooBar.replaceNumberWithRules(a))
				.forEach(System.out::println);
	}
	
	private static final String QIX = "Qix";
	private static final String BAR = "Bar";
	private static final String FOO = "Foo";
	
	private static Map<Integer, String> fooBarContainsChar() {
		Map<Integer, String> fooBarContains = new HashMap<>();
		   fooBarContains.put(3, FOO);
		   fooBarContains.put(5, BAR);
		   fooBarContains.put(7, QIX);
		return fooBarContains;
	}

	private static Map<Integer, String> fooBarModulo() {
		Map<Integer, String> fooBarModulo = new HashMap<>();
		   fooBarModulo.put(3, FOO);
		   fooBarModulo.put(5, BAR);
		return fooBarModulo;
	}

	public String replaceNumberWithRules(int number) {

		Map<Integer, String> fooBarModulo = fooBarModulo();

		Map<Integer, String> fooBarContains = fooBarContainsChar();

		StringBuilder result = new StringBuilder();
		result.append(moduloNumber(fooBarModulo, number));

		String toFooBar = String.valueOf(number);
		result.append(containsChar(fooBarContains, toFooBar));
		return (result.length() == 0) ? toFooBar : result.toString();
	}

	private static String containsChar(Map<Integer, String> fooBarContainsChar, String stringReplacment) {
		return stringReplacment.chars()
				.mapToObj(integerAsChar -> fooBarContainsChar.getOrDefault(getNumericValue(integerAsChar), ""))
				.collect(joining());
	}

	private static String moduloNumber(Map<Integer, String> fooBarModulo, int number) {
		return fooBarModulo.keySet().stream()
				.filter(toReplace -> number % toReplace == 0)
				.map(fooBarModulo::get)
				.collect(joining());
	}
	
}