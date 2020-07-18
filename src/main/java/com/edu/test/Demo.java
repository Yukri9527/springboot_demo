package com.edu.test;

public class Demo {
//  String -> Integer   Integer->String
	public static void main(String[] args) {
		String s = "10";
		int i =Integer.valueOf(s);
		
		i+=2;
		System.out.println(i);
		String ss =String.valueOf(i);
		System.out.println(ss);
	}
}
