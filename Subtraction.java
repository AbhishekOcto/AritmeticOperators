package com.bridgeLabz.arithmeticOperators;
import java.util.Scanner;
public class Subtraction {
	int a;
	
	int b;	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :" );
		int a = sc.nextInt();
		System.out.println("Enter b :" );
		int b = sc.nextInt();
		int diff = a - b;
		System.out.println("Difference of two numbers: " + diff );
			sc.close();
	}

}
