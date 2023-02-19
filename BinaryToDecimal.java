package com.bitwise;

import java.util.Scanner;

public class BinaryToDecimal {
	
		public static void main(String args[]){ 
			Scanner sc = new Scanner(System.in);
			String num= sc.next();
		
		int decimal=Integer.parseInt(num,2);  
		System.out.println(decimal);  
		}  
}
