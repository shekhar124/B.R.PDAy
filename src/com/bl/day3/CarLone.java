package com.bl.day3;

import java.util.Scanner;

public class CarLone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double P, Y, R, payment;
		System.out.println("Enter Loan Amount : ");
		P = sc.nextDouble();
		System.out.println("Enter Year : ");
		Y = sc.nextDouble();
		System.out.println("Enter Rate : ");
		R = sc.nextDouble();
		sc.close();
		double div, n = 12 * Y, r = R / (12 * 100);
		div = (1 - Math.pow((1 + r), (-n)));
		payment = (P * r) / div;
		double interest = payment * n - P;
		System.out.println("Interest Rate Per Month : " + r);
		System.out.println("Loan Period in Months : " + n);
		System.out.println("Monthly Payments : " + payment);
		System.out.println("Total Interest : " + interest);

	}

}
