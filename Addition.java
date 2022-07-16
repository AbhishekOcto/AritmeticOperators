package com.bridgeLabz.arithmeticOperators;

	import java.util.Scanner;
	public class Addition {
	int a;
	int b;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a =");
		int a = sc.nextInt();
		System.out.println("enter b =");
		int b = sc.nextInt();
		
		
		
		int sum = a + b;
		System.out.println("sum is = " +sum );
			// TODO Auto-generated method stub
		sc.close();
		}

}
