package com.ruby.java.ch03;

public class Test31 { // 구구단 1단 ~ 9단
	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("\n"); // 한 줄 바꿈
		}
		
		/*
		int i = 1;
		for(int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + (i * j));
		}
		System.out.println("\n"); */ // 역 구구단을 만들려면? (1~9 * 1)
	}
}
