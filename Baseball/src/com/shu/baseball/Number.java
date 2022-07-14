package com.shu.baseball;

public class Number {
	private final int position;
	private final int value;
	
	public Number(int position, int value) {
		this.position = position;
		this.value = value;
	}
	
	public String compare(Number usernumber) {
		if(position == usernumber.position && value == usernumber.value) {
			return "STRIKE";
		}
		if(value == usernumber.value) {
			return "BALL";
		}
		return "OUT";
	}
	
	
}
