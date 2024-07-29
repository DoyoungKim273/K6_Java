package com.ruby.java.agrt.Ch05;

import java.util.Scanner;

public class Factorial {
	static int count = 0;
	static int factorial(int n) {
//		if(n > 0)
//			return n * factorial(n - 1);
//		else 
//			return 1;
		System.out.println(count++ + " " + n);
		return (n > 0) ? n * factorial(n - 1) : 1; // 자신과 똑같은 메서드를 계속해서 호출
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리얼은" + factorial(x) + "입니다.");
	}
}
