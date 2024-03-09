package com.ruby.java.ch05;

public class Test01 {
	static void test(int...v) { // test() 메서드에서 int 타입의 가변 길이 인자를 받는 매개 변수 v 선언
		System.out.println(v.length + " : "); 
		for(int x : v) // 이 배열을 참조하는 v 변수를 통해 배열에 저장된 값 (test () 메서드 호출 때 전달한 인자값 출력)
			System.out.println(x + "");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test(1); // test 메서드 호출 -> 전달하는 인자의 개수를 크기로 하여 int 형 배열 형성, 전달한 인자값들이 배열에 저장
		test(1, 2);
		test(1, 2, 3);
	}
}
