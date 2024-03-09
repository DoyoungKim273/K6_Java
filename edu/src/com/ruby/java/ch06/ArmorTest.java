package com.ruby.java.ch06;

public class ArmorTest {
	public static void main(String[] args) {
		Armor suit1 = new Armor(); // 지역변수 선언 -- Armor 인스턴스의 메모리 위치 정보를 가지는 참조변수
		Armor suit2 = new Armor(); // 각 변수에는 new Armor() 명령문으로 인스턴스를 생성한 후 반환된 힙 메모리의 참조정보 대입(저장)함
		Armor suit3 = new Armor();
		
		suit1.setName("mark6"); // suit 변수가 참조하는 인스턴스를 찾아가 해당 인스턴스의 세터 메서드 호출
		suit1.setHeight(180); // 세터 메서드는 인자로 전달받은 값을 인스턴스의 각 필드에 저장
		
		suit2.setName("mark16");
		suit2.setHeight(220);
		
		suit3.setName("mark38");
		suit3.setHeight(200);
		
		System.out.println(suit1.getName() + ":" + suit1.getHeight()); // 게터가 반환하는 값을 출력
		System.out.println(suit2.getName() + ":" + suit2.getHeight());
		System.out.println(suit3.getName() + ":" + suit3.getHeight());
		
	}
}
