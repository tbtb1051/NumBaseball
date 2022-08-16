package com.shu.baseball;

public class Main {
	public static void main(String[] args) {
		System.out.println("HI");

		Numbers comnumber = new Numbers();
		
		System.out.println(comnumber.toString());
		
		Numbers plynumber = new Numbers("123");
		
		System.out.println(plynumber.toString());
		
		comnumber.compare(plynumber);
		
		System.out.println(plynumber.toString());
		
	}
}

