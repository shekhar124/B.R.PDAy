package com.bl.day5;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to flip the coin: ");
		int numberOfFlips = sc.nextInt();
		sc.close();
		if (numberOfFlips <= 0) {
			System.out.println("Please enter Positive Integer");
		} else {
			int numberofHeads = 0;
			for (int i = 0; i < numberOfFlips; i++) {
				if (Math.random() > 0.5) {
					numberofHeads++;
					System.out.println(numberofHeads);
				}
			}
			double percentofHeads = (numberofHeads * 100) / numberOfFlips;
			double percentofTails = 100 - percentofHeads;
			System.out.println("Percentage of heads : " + percentofHeads  );
			System.out.println("Percentage of tails : " + percentofTails);
		}
	}

}
