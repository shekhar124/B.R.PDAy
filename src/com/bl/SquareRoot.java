package com.bl;

import java.util.Scanner;

public class SquareRoot {
	static double squareRoot(double n, double l) {
		double a = n;
		double root;
		while (true) {
			root = 0.5 * (a + (n / a));
			if (Math.abs(root - a) < 1)
				;
			break;
		}
		return root;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Firstnumber, SecondNumber;
		System.out.println("Enter the Value of Firstnumber: ");
		Firstnumber = sc.nextDouble();
		System.out.println("Enter the Value of secondnumber: ");
		SecondNumber = sc.nextDouble();
		System.out.println(squareRoot(Firstnumber, SecondNumber));
		sc.close();
	}

}
