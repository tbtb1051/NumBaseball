package com.shu.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.shu.baseball.Result.ResultStatus;

public class Numbers {
	private final List<Number> numbers;
	int strikecount = 0;
	int ballcount = 0;
	int trycount = 0;

	public Numbers(String numbers) {
		this.numbers = mapNumbers(numbers);

	}

	public Numbers() {
		this.numbers = makeComnumber();
	}

	@Override
	public String toString() {
		return "결과 : " + strikecount + "S, " + ballcount + "B, " + (3 - (strikecount + ballcount)) + "O (시도횟수 : " + trycount + "회)";
	}
	
	public String result() {
		return "정답입니다. " + trycount + "번 만에 성공했습니다.";
	}

	private List<Number> mapNumbers(String numbers) {  // 입력받은 세자리숫자 각 포지션을 가지는 number 형태로 생성
		List<Number> temp = new ArrayList<>();

		String[] numberArray = numbers.split("");
		for (int position = 0; position < numberArray.length; position++) {
			int value = Integer.parseInt(numberArray[position]);
			temp.add(new Number(position, value));
		}

		return temp;
	}

	public List<Number> makeComnumber() {  // 정답 숫자 생성
		List<Number> comNums = new ArrayList<>();
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
		System.out.print("정답숫자 : ");
		for (int j = 0; j < 3; j++) {
			System.out.print(randomint[j]);
			comNums.add(new Number(j, randomint[j]));
		}
		return comNums;
	}

	
	public void runcount(ResultStatus result) {
		if(result == ResultStatus.STRIKE) {
			this.strikecount++;
		}
		if(result == ResultStatus.BALL) {
			this.ballcount++;
		} 
	}

	public void tryCount() {
		this.trycount++;
	}

	public String compare(Numbers comNums) {
		ResultStatus result = null;
		comNums.strikecount = 0;
		comNums.ballcount = 0;
		for (Number i : this.numbers) {
			for (Number j : comNums.numbers) {
				result = i.compare(j);
				if (result == ResultStatus.STRIKE) {
					comNums.runcount(result);
					continue;
				} else if (result == ResultStatus.BALL) {
					comNums.runcount(result);
					continue;
				}
			}
		}
		comNums.tryCount();
		return null;
	}
}
