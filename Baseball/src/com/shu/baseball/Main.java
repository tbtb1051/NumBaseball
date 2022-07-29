package com.shu.baseball;

public class Main {
	public static void main(String[] args) {
		testnumbermatch();
		System.out.println("HI");
		numbersTest();
	}
	
	private static void numbersTest() {
		Numbers comNums = new Numbers("12");
		
		Numbers plyNums1 = new Numbers("12");
		Numbers plyNums2 = new Numbers("21");
		Numbers plyNums3 = new Numbers("34");
		Numbers plyNums4 = new Numbers("31");
		Numbers plyNums5 = new Numbers("13");
		
		String result;
		result = comNums.compare(plyNums1);
		//브렌치 테스트 랄랄라 한번더
		
	}

	private static void testnumbermatch() {
		Number comnumber = new Number(1,1);
		Number usernumber1 = new Number(1,1);
		Number usernumber2 = new Number(2,1);
		
		String result;
		result = comnumber.compare(usernumber1);
//		if(result == "STRIKE") {
//			counts.strikeCount();
//		}
//		if(result == "BALL") {
//			counts.ballCount();
//		}
//		if(result == "OUT") {
//			counts.outCount();
//		}
//		System.out.println(result);
//		System.out.println(counts.strikecount);
//		result = comnumber.compare(usernumber2);
//		System.out.println(result);		
	}
}
