package com.bl;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int num1 = a + b * c;
		int num2 = a * b + c;
		int num3 = c + a / b;
		int num4 = a % b + c;
		System.out.println("a + b * c =" + num1);
		System.out.println("a * b + c =" + num2);
		System.out.println("c + a / b =" + num3);
		System.out.println("a % b + c =" + num4);
	}

}
