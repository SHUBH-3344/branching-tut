package com.bitwise;

import java.util.Scanner;

public class Fibonacii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//user input taken
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		//System.out.println(b);
//looping condition
		for (int i = 2; i <= n; i++) {
			 c = a + b;
			//System.out.println(c);

			a = b;
			b = c;

		}
    System.out.println(c);
	}
}
