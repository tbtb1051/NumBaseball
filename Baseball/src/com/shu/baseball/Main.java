package com.shu.baseball;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("HI");

		Numbers comnumber = new Numbers(); // 정답 숫자 생성
		
		
		Numbers plynumber = new Numbers(tryNumber()); // tryNumber() - 입력받은 수 를 plynumber로 생성.
		Numbers a = plynumber;
		while(a.strikecount != 3) {	
			comnumber.compare(a);
			if(a.strikecount == 3) {
				System.out.println(a.result());
				return;
			}
			System.out.println(a.toString());
			plynumber = new Numbers(tryNumber());
			a = plynumber;
		}			
		
		
		
		// 스트라이크가 3이 될때까지 trycount를 올리며 반복한다.
		
		// 스트라이크가 3이되면 trycount를 출력하고 종료한다.
				
		
		
		//System.out.println(plynumber.toString());
		
	}

	private static String tryNumber() {
		System.out.println("세자리 숫자를 입력하세요.");

		Scanner sc = new Scanner(System.in);

		String tryNumber = "";

		tryNumber = sc.next();

		return tryNumber;
	}
}
