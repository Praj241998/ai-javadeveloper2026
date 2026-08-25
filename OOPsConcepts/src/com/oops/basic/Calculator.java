package com.oops.basic;

public class Calculator {

	int sum(int ...arr ) {
		int sum = 0;
		for (int val : arr) {
			sum +=val;
		}

		return sum;
	}

	double square(double num) {
		double val =Math.pow(num,2);
		return val;
	}

}
