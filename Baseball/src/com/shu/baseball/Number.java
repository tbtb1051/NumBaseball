package com.shu.baseball;

import com.shu.baseball.Result.ResultStatus;

public class Number {
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

	public ResultStatus compare(Number usernumber) {
		if (this.equals(usernumber)) {
			return ResultStatus.STRIKE;
		}
		if (value == usernumber.value) {
//			System.out.println(value);
//			System.out.println(usernumber.value);
			return ResultStatus.BALL;
		}
		else
			return ResultStatus.OUT;
	}

}
