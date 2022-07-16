package com.bridgeLabz.arithmeticOperators;
import java.util.Scanner;
public class Operators {
int a;
int b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking input from user
		
		System.out.println("Enter the first number a :");
		int a = sc.nextInt();
		System.out.println("Enter the first number a :");
		int b = sc.nextInt();
		
	// multiplication
int mul = a * b;
//division
int div = a / b;
// modulo
int mod = a % b;

			// printing the methods

System.out.println("Mutiplication of two numbers: " + mul);
System.out.println("Division of two numbers: " + div);
System.out.println("Modulo of two numbers: " + mod);		
		
sc.close();		
		
	}

}
