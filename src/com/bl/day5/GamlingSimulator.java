package com.bl.day5;

import java.util.Scanner;

public class GamlingSimulator {
	public static void playGame(int Stake, int Goal, int Trails) {
		int bets = 0;
		int wins = 0;
		for (int i = 0; i < Trails; i++) {
			int cash = Stake;
			while (cash > 0 && cash < Goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == Goal)
				wins++;
		}
		System.out.println(wins + " wins of " + Trails);
		System.out.println("Percentage of Games Won = " + 100.0 * wins / Trails);
		System.out.println("Average Number of Bets = " + 1.0 * bets / Trails);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stake :");
		int Stake = sc.nextInt();
		System.out.println("Enter Goal : ");
		int Goal = sc.nextInt();
		System.out.println("Enter Number of Trails : ");
		int Trails = sc.nextInt();
		playGame(Stake, Goal, Trails);
		sc.close();
	}

}
