package com.ruby.java.jvbasicCh08;

//class Status {
//	public static final int READY = 1 ;
//	public static final int SEND = 2;
//	public static final int COMPLETE = 3;
//	public static final int CLOSE = 4 ;
//}

enum Status { // 열거형 클래스를 선언할때는 class 대신 enum 키워드 사용
	READY, SEND, COMPLETE, CLOSE // 변수 이름으로 사용했던 문자열은 콤마(,) 구분자로 나열 --- 열거상수
} // 이렇게 바꾸고 나면 int work를 status work로 수정, 값은 null로 초기화

public class NonEnumTest {
	public static void main(String[] args) {
		Status work = null;
		
		int n = 2;
		
		switch (n) {
		case 1 : 
			work = Status.READY;
			break;
		case 2 : 
			work = Status.SEND;
			break;
		case 3 : 
			work = Status.COMPLETE;
			break;
		case 4 : 
			work = Status.CLOSE;
			break;
		}
		System.out.println("Status : " + work);
	}
}
