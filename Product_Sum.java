package com.bitwise;
import java.util.Scanner;

public class Product_Sum {
public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int choice=sc.nextInt();
	    int result;

	    switch(choice) 
	    {
	      case 1: //sum
	        result = 0;
	        for(int i=1;i<=num;i++) {
	          result += i;
	        }
	      break;

	      case 2: //product
	        result = 1;
	        for(int i=1; i<=num; i++) {
	          result *= i;
	        }
	      break;

	      default: //invalid op
	        result = -1;
	      break;
	    }
	    System.out.println(result);
}
}