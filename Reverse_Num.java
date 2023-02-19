package com.bitwise;

import java.util.*;

public class Reverse_Num {

	public static void main(String[] args) {
		int n, rem = 0, rev = 0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println(rev);

	}
}
