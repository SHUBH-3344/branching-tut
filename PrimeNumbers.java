package com.bitwise;

import java.util.Scanner;

public class PrimeNumbers {
	//static int count = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();

		  int counter;

		  for (int i = 2; i <= num; i++) {
		   counter = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     counter++;
		     break;
		    }
		   }

		   if (counter == 0) {
		    System.out.println(i);
		   }

		  }
	
		
	}
}
