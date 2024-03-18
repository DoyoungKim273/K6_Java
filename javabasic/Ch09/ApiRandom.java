package com.ruby.java.jvbasicCh09;

import java.util.Random;

public class ApiRandom {
	public static void main(String[] args) {
		Random r1 = new Random();
		for(int i = 0; i < 5; i++) {
			System.out.println(r1.nextInt() + "\t"); // int 로 표현할 수 있는 범위의 숫자 중 하나 반환
			System.out.println(r1.nextInt(10) + "\t"); // 0 ~ 9 사이의 난수 하나 반환
			System.out.println(r1.nextBoolean() + "\t"); // true or false 값 중 하나 반환
			System.out.println(r1.nextDouble() + "\t"); //double 로 표현할 수 있는 범위의 숫자 중 하나 반환
			System.out.println();
		}
		
		Random r2 = new Random(123); // seed(계산을 할 때 기본값으로 사용되는 값)가 123으로 동일한 random 객체를 생성
		for(int i = 0; i < 5; i++) {
			System.out.println(r2.nextInt(10)); // 여러번 출력해도 결괏값이 같음(seed 값이 같기 때문)
		}
	}
}
