package com.bitwise;

import java.util.Scanner;

public class Squareroot {
	

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number, squareRoot;
	

		 number = sc.nextInt();

		squareRoot = (int) Math.sqrt(number);

		System.out.println(squareRoot);
	}
}