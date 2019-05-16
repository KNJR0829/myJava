package com.apex.java;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		// int a = 10;
		// int b = 6;
		System.out.println("Numbers before swapping " + a + " and " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print("Numbers after swapping are " + a + " and " + b);
		num.close();
	}

}
