package com.shu.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.shu.baseball.Result.ResultStatus;

public class Numbers {
	private final List<Number> numbers;
	int strikecount = 0;
	int ballcount = 0;
	int outcount = 3;
	int trycount = 0;

	public Numbers(String numbers) {
		this.numbers = mapNumbers(numbers);

	}

	public Numbers() {
		this.numbers = makeComnumber();
	}

	@Override
	public String toString() {
		return "결과 : " + strikecount + "STRIKE, " + ballcount + "BALL, " + (3 - strikecount - ballcount) + "OUT (시도횟수 : " + trycount + "회)";
	}
	
	public String result() {
		return "정답입니다. " + trycount + "번 만에 성공했습니다.";
	}

	private List<Number> mapNumbers(String numbers) {
		List<Number> temp = new ArrayList<>();

		String[] numberArray = numbers.split("");
		for (int position = 0; position < numberArray.length; position++) {
			int value = Integer.parseInt(numberArray[position]);
			temp.add(new Number(position, value));
		}

		return temp;
	}

	public List<Number> makeComnumber() {
		List<Number> comNums = new ArrayList<>();// 정답숫자 생성
		Random random = new Random();
		int randomint[] = { 0, 0, 0 };
		for (int i = 0; i < 3; i++) {
			randomint[i] = random.nextInt(10);
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (randomint[i] == randomint[j])
						i--;
				}
			}
		}
		for (int j = 0; j < 3; j++) {
			System.out.println(randomint[j]);
			comNums.add(new Number(j, randomint[j]));
		}
		return comNums;
	}

	
	public void runcount(ResultStatus result) {
		if(result == ResultStatus.STRIKE) {
			this.strikecount++;
//			this.outcount--;
		}
		if(result == ResultStatus.BALL) {
			this.ballcount++;
//			this.outcount--;
		} 
	}

	public void tryCount() {
		this.trycount++;
	}

	public String compare(Numbers plyNums) {
		ResultStatus result = null;
		for (Number i : this.numbers) {
			for (Number j : plyNums.numbers) {
				result = i.compare(j);
				if (result == ResultStatus.STRIKE) {
					plyNums.runcount(result);
					continue;
				} else if (result == ResultStatus.BALL) {
					plyNums.runcount(result);
					continue;
				}
			}
		}
		plyNums.tryCount();
		return null;
	}
}
