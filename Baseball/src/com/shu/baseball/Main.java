package com.shu.baseball;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("HI");

		Numbers comnumber = new Numbers(); // 정답 숫자 생성
		System.out.println("");
		
		
		Numbers plynumber = new Numbers(tryNumber()); // tryNumber() - 입력받은 수 를 plynumber로 생성.
		while(comnumber.strikecount != 3) {	 //정답 Numbers에서 스트라이크가 3이 아니면 입력받은 수와 비교. 
			plynumber.compare(comnumber);  // 입력받은 plynumber와 비교 후 정답 numbers에 각 카운트 증가.
			System.out.println(comnumber.toString()); // 비교 결과 출력
			if(comnumber.strikecount == 3) { // 3strike일 때 비교 종료 후 결과 출력(몇 회 만에 성공 했습니다.)
				System.out.println(comnumber.result());
				return;
			}
			plynumber = new Numbers(tryNumber());	// 다음 시도 숫자 입력받아 plynumber로 저장
		}			
		
	}

	private static String tryNumber() {  // 세자리 숫자 입력받기.(000~999)
		System.out.println("세자리 숫자를 입력하세요.");

		Scanner sc = new Scanner(System.in);

		String tryNumber = "";

		tryNumber = sc.next();

		return tryNumber;
	}
}
