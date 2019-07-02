package com.kata;

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

	public static void main (String[] args) {
		FooBarKata fooBarKata = new FooBarKata();
		fooBarKata.printFooBar();
	}
	
	public void printFooBar() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(replaceNumberWithRules(i));
		}
	}

	public String replaceNumberWithRules(int number) {
		
		StringBuilder stringOfNumber = new StringBuilder();
		boolean exitFooBarRule = false;
		
		// divisors have high precedence
		 if(number % 3 == 0) {
			 stringOfNumber.append("Foo");
			 exitFooBarRule = Boolean.TRUE;
		 }
		 if(number % 5 == 0) {
        	 stringOfNumber.append("Bar");
			 exitFooBarRule = Boolean.TRUE;
		 }
		 /* convert number to array of char
		  * check the char in order and convert it to string with according rules
		  */
		 char [] numberToCharArray = String.valueOf(number).toCharArray();
		 for(char output : numberToCharArray) {
			 if(output == '3'){
				 stringOfNumber.append("Foo");
				 exitFooBarRule = Boolean.TRUE;
	    	 } else if(output == '5') {
	        	 stringOfNumber.append("Bar");
				 exitFooBarRule = Boolean.TRUE;
	    	 } else if(output == '7') {
	        	 stringOfNumber.append("Qix");
				 exitFooBarRule = Boolean.TRUE;
	    	 }
		 }
		 
		 // if any rules is checked then return the value of the current number
		 if(!exitFooBarRule) {
			 stringOfNumber.append(number); 
		 }
		 
		return stringOfNumber.toString();
	}

}