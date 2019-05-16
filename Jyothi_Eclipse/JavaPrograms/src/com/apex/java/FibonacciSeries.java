package com.apex.java;

public class FibonacciSeries {

	public static void main(String[] args) {

		int firstnum = 1;
		int secondnum = 1;
		int febseq = 10;
		int nextnum;
		System.out.println(firstnum);
		System.out.println(secondnum);
		nextnum = firstnum + secondnum;
		while (nextnum < febseq) {
			nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
			System.out.print(nextnum+ " ");
		}
	}

}
