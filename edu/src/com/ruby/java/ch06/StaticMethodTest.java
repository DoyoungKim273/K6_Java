package com.ruby.java.ch06;

public class StaticMethodTest {
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest(); 
		// 힙 메모리에 StaticMethodTest클래스의 인스턴스를 생성한 다음, 스택 메모리에 생성한 참조변수 exam에 해당 인스턴스의 참조정보를 저장
		exam.print2(); // 스택에서 참조변수의 exam의 인스턴스를 찾아가 print2() 매서드를 호출함
	}
	
	public static void print1() {
		System.out.println("hello");
	}
	
	public void print2() {
		System.out.println("java");
	}
}
