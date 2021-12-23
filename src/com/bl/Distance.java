package com.bl;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, distance;
		System.out.println("Enter the values of x, y: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		sc.close();
		distance = Math.sqrt(x * x + y * y);
		System.out.println(distance);
	}
}
