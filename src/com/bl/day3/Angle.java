package com.bl.day3;

import java.util.Scanner;

public class Angle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the angle");
		double a=sc.nextDouble();
		double b =Math.toRadians(a);
		System.out.println("Sin"+a+"is: " +Math.sin(b));
		System.out.println("Cos"+a+"is: " +Math.cos(b));
		System.out.println("Tan"+a+"is: " +Math.tan(b));
		
		sc.close();
		
	}

}
