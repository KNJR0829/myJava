package com.reddy;

public class RevInt {

	public static void main(String[] args) {
		int num=998989;
		int rev=0;
		while(num>0)
		{
rev=rev*10+num%10;//9
num=num/10;

	}
System.out.println(rev);
}
}