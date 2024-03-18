package com.ruby.java.jvbasicCh08;

enum Mandarin {
	금귤, 한라봉, 레드향, 천혜향, 황금향;
}
public class EnumMandarin {
	public static void main(String[] args) {
		
		Mandarin ma = Mandarin.한라봉; // Mandarin 타입의 ma 변수에 Mandarin.한라봉 저장
		
		System.out.println("이름 : " + ma.name()); // 변수가 가지는 열거 상수의 이름 반환
		System.out.println("위치 : " + ma.ordinal()); // 변수가 가지는 열거 상수의 선언된 순서 반환
		System.out.println("황금향과의 상대 위치 : " + ma.compareTo(Mandarin.황금향)); // -n은 n번째 앞에 위치한다는 의미
		
		Mandarin ma2 = Mandarin.valueOf("레드향"); // 인자로 전달한 문자열과 동일한 열거 상수를 찾아 열거형 클래스 타입으로 반환
		System.out.println(ma2);
		
		Mandarin list[] = Mandarin.values(); // Mandarin에 선언된 열거상수 모두를 Mandarin 객체로 생성하여 배열로 반환
		System.out.println("===== 귤의 종류 =====");
		for(Mandarin m : list)
			System.out.println(m);
	}
}
