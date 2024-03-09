package com.ruby.java.ch06;

class Count { // Count 인스턴스는 코드메모리에 할당된 클래스 필드의 정보를 포함 -- 클래스 Count의 count 필드가 힙 메모리에 할당됨 
	public static int totalCount;
	int count;
}

public class CountTest {
	public static void main(String[] args) {
		
		Count c1 = new Count(); // 데이터 타입을 Count로 지정, Count 클래스의 인스턴스를 참조하는 변수
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.count++;
		Count.totalCount++;
		c2.count++;
		Count.totalCount++;
		c3.count++;
		Count.totalCount++;
		
		System.out.println(Count.totalCount + ":" + c1.count);
		System.out.println(Count.totalCount + ":" + c2.count);
		System.out.println(Count.totalCount + ":" + c3.count);
	}
}