package com.ruby.java.jvbasicCh09;

public class ApiPrac06 {
	public static void main(String[] args) {
		String s1 = String.valueOf(false);
		String s2 = String.valueOf('A');
		String s3 = String.valueOf(3.14);
		String s4 = String.valueOf(123);
		String s5 = String.valueOf(new MyObject(123));
		// 인자로 전달한 모든 타입의 데이터는 String으로 변환되며 문자열은 전달한 값으로 처리됨
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
