package com.ruby.java.jvbasicCh09;

public class ApiString02 {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		// new 명령문으로 생성하면 무조건 힙 메모리에 인스턴스 새로 생성
		// 새로 생성된 주솟값이 참조변수에 저장
		String s2 = "java";
		// 큰따옴표로 생성 -- 무조건 인스턴스 생성하는 것이 아니고 힙 메모리의 고유 영역인 String pool로 감
		// 만약 String pool에 동일한 문자열 가진 String 인스턴스 있으면 새로 생성X, 기존 인스턴스의 주솟값 반환
		
		String s3 = new String("java");
		String s4 = "java";
		
		if(s1 == s3) { // 인스턴스 새로 생성, 주솟값도 각각 새로 생성
			System.out.println("o.equal1");
		} else { 
			System.out.println("o.different1");
		}
		
		if(s2 == s4) { // 서로 같은 인스턴스의 주솟값을 참조하게 됨
			System.out.println("o.equal2");
		} else {
			System.out.println("o.different2");
		}
		
		if(s1.equals(s3)) { // 문자열 비교하여 같으면 true, 다르면 false
			System.out.println("s.equal1");
		} else {
			System.out.println("s.different1");
		}
		
		if(s2.equals(s4)) {
			System.out.println("s.equal2");
		} else {
			System.out.println("s.different2");
		}
		
		String s5 = "JAVA";
		
		if(s1.equals(s5)) {
			System.out.println("s.equal3");
		} else {
			System.out.println("s.different3");
		}
		
		if(s1.equalsIgnoreCase(s5)) { // 대소문자 상관 없고 철자만 같으면 같다고 판단
			System.out.println("s.equal4");
		} else {
			System.out.println("s.different4");
		}
		
		System.out.println(s1); // 참조변수를 출력할때는 자동으로 toString() 메서드가 호출됨
		System.out.println(s2); 
		System.out.println(s3);
		System.out.println(s4);
		
	}
}
