package com.bl.day4;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		sc.close();
		if (n > 0)
			System.out.println("The Harmonic Value of the number is : " + nthHarmonic(n));
		else
			System.out.println("The entered number should be positive.");
	}

	public static double nthHarmonic(int n) {
		double a, value = 0.0;
		for (a = 1; a <= n; a++) {
			value = value + (1 / a);
		}
		return value;
	}

}
