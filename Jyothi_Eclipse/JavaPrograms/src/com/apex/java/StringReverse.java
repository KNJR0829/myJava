package com.apex.java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = input.nextLine();
		// String str = "mother"; // String str=new String ();
		int length = str.length();
		System.out.println(length);
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		input.close();
	}

}
