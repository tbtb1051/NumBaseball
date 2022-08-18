package com.shu.baseball;

import com.shu.baseball.Result.ResultStatus;

public class Number { 	//[0,a][1,b],[2,c] 와 같은 위치와 값 정보를 가지는 number
	private final int position;
	private final int value;

	@Override
	public String toString() {
		return "Number [position=" + position + ", value=" + value + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + position;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Number other = (Number) obj;
		if (position != other.position)
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	public Number(int position, int value) {
		this.position = position;
		this.value = value;
	}

	public ResultStatus compare(Number usernumber) { // 값 비교 후 strike, ball, out 상태값 return
		if (this.equals(usernumber)) {
			return ResultStatus.STRIKE;
		}
		if (value == usernumber.value) {
			return ResultStatus.BALL;
		}
		else
			return ResultStatus.OUT;
	}

}
