package com.reddy;

public class StringMethods {

	public static void main(String[] args) {

		String s="fly high in the skie";
		String str="Hardwork is Key for Success";
		System.out.println(s.length());
		System.out.println(s.replace(" ",""));
		
		System.out.println(s.indexOf('c'));
		System.out.println(s.indexOf('s',s.indexOf('s')+1));

		System.out.println(s.indexOf("s",s.indexOf("s") + 1));
		System.out.println(s.indexOf("i",s.indexOf("i") + 3));
		System.out.println(s.charAt(3));
	System.out.println(s.equals(str));
System.out.println(s.equalsIgnoreCase(str));
System.out.println(s.substring(4,9));
//System.out.println(s.split(s, 'k'));
System.out.println(s.compareTo(str));
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.compareTo(str));
	System.out.println(s.hashCode()+ str.hashCode());
	}
	

}
