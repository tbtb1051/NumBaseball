package com.shu.baseball;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	private final List<Number> numbers;
	
	int strikecount=0;
	int ballcount=0;
	int outcount=0;
	int trycount=0;
	
	public Numbers(String numbers) {
		this.numbers = mapNumbers(numbers);
		
	}

	private List<Number> mapNumbers(String numbers) {
		List<Number> temp = new ArrayList<>();
		
		String[] numberArray = numbers.split("");
		for (int position=0; position<numberArray.length; position++) {
			int value = Integer.parseInt(numberArray[position]);
			temp.add(new Number(position, value));
		}
		
		return temp;
	}
	
	public void makeComnumber() {
		//정답숫자 생성
	}
	
	public void strikeCount(){
		this.strikecount++;
	}
	public void ballCount(){
		this.ballcount++;
	}
	public void outCount(){
		this.outcount++;
	}
	public void tryCount(){
		this.trycount++;
	}

	public String compare(Numbers plyNums1) {
//		for() {
			
			
//		}
		return null;
	}
}
