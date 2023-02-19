package com.bitwise;

import java.util.Scanner;

public class Term_Of_AP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;

		int num;
		for (int i = 1; count < n; i++) {

			num = 3 * n + 2;

			if (num % 4 != 0) {

				System.out.println(num);
				count++;
			}

		}
	}
}
