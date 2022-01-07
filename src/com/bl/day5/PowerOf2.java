package com.bl.day5;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		sc.close();
		int power = 1;
		if (number >= 0 && number < 33) {
			for (int i = 1; i <= number; i++) {
				power = power * 2;
				System.out.println("PowerOf 2 ^ " + i + " is: " + power);
			}
		} else {
			System.out.println("Condidtion is Not Satisfied");
		}
	}
}
