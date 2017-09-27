/**
 * 
 */
package com.clearswift.es;

/**
 * Simple test class. Calculates factorial.
 * @author ianc
 *
 */
public class Fact {
	static long	factorial(int input) {
		if(input < 0) {
			throw new IllegalArgumentException("Can't calculate factorial of negative numbers");
		} else if(input < 2) {
			return 1;
		} else {
			long result = 1;
			for(int i = 2; i <= input; i++) {
				result *= i;
			}
			return result;
		}
	}
}
