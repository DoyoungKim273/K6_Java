package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	
	public Member() { // Member 클래스의 생성자 -> new Member(); 명령문이 실행될 때 호출됨
		System.out.println("Member() 생성자 실행");
	}
	
	public Member(String name) {
		System.out.println("Member(String) 생성자 실행");
		System.out.println(name);
	}
	
	public Member(String name, int age) {
		System.out.println("Member(String, int) 생성자 실행 : ");
		System.out.println(name + ":" + age);
	}
	
	public void setName(String name) {
	}
	
	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		new Member(); 
		new Member("Amy");
		new Member("Amy", 23);
		// Member 클래스의 인스턴스를 힙에 생성 -> 이때 힙에는 Member 클래스의 name과 age 필드가 생성됨
		// 기본 타입 필드는 0으로, 참조 타입 필드는 null로 자동 초기화
		// 필드가 모두 힙에 생성된 후에는 Member(); 생성자가 호출됨 -> 생성자 실행 --- 8줄 실행
		// cf) 생성자 중 매개변수가 없는 생성자 = 기본 생성자
	}
}
