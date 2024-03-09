package com.ruby.java.ch03;

public class Test27_1 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) { // for 명시와 함께 - 변수 선언 ; 조건식 ; 증감식
			System.out.println(i); // for문 블록 내 명령문
		}
		System.out.println("for OK"); // for문 블록 외 명령문
		
		int i = 0; // 변수 선언
		while(i < 10) { // 조건식과 함께 - while 명시
			System.out.println(i); // 명령문
			i++; // 증감식
		}
		System.out.println("while OK"); // while문 블록 외 명령문
		
		/* do {
			System.out.println(i); // -> (2) 이미 명령문이 do 블록에 있으므로 무한 반복의 루프에 빠지게 되어있음
			i++; // -> (3) 0 ~ 9 까지의 수 출력에는 do while문은 적합한 방법이 X
		}
		while(i <= 10); 
		System.out.println("do while OK"); */ // -> (1) do while 문의 경우 do 블록 내의 것이 먼저 실행 후 while 점검
	}
}
