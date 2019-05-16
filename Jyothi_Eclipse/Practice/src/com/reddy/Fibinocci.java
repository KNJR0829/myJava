package com.reddy;
import java.util.Scanner;

public class Fibinocci {

	public static void main(String args[]) {

		Scanner h=new Scanner(System.in);

		System.out.println("Enter a number: ");

		int k=h.nextInt();

		int firstNumber=0,secondNumber=1,nextNumber;
		nextNumber=firstNumber+secondNumber;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(nextNumber);
		h.close();
		while(nextNumber<k) {
			firstNumber=secondNumber;
			secondNumber=nextNumber;
			nextNumber=firstNumber+secondNumber;
			System.out.println(nextNumber);
		}

	}
}

