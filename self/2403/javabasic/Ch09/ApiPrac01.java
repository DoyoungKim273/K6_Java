package com.ruby.java.jvbasicCh09;

public class ApiPrac01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		MyObject obj4 = new MyObject(123);
		MyObject obj5 = new MyObject(123);
		
		
		Class c = obj1.getClass(); // 클래스에 대한 정보만 담는 객체 새로 생성하여 활용하고자 할 때 사용
		
		System.out.println(obj1.hashCode()); // 각 인스턴스에 부여된 해시코드 값 출력
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		System.out.println(c.getName());
		
		if(obj4.equals(obj5)) { // 인자로 전달된 객체와 현재 객체가 같은지 판단(해시코드가 같은지 비교)
			System.out.println("equal");
		} else {
			System.out.println("different");
		}
		
		if(obj4 == obj5) { // 단순히 변숫값이 같은지를 비교
			System.out.println("equal1");
		} else {
			System.out.println("different1");
		}
	}
}
