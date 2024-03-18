package com.ruby.java.jvbasicCh07;
// 인터페이스 : 여러 프로그램에서 사용할 멤버(변수, 메서드)를 일관되게 하기 위한 기술 명세
// (자체적으로 속성과 기능을 가지는 객체는 X, 다른 클래스에서 구현할 내용과 형식만 갖춘 것)

// 제어자 interface 인터페이스명
public interface Messenger {

	// public static final 변수 선언 : 인터페이스는 실제 존재하는 객체가 X, 객체 생성 불가하기에 객체 생성과 상관 X인 static으로 선언
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	
	// public abstract 메서드 선언 - 인터페이스 통일 목적으로 선언, 본문 구현 X
	public abstract String getMessage();
	
	public abstract void setMessage(String msg);
	
	//public default 메서드 선언 - 인터페이스 사용하는 모든 클래스에서 공통으로 갖는 기능 구현 목적
	public default void setLogin(boolean login) {
		log();
		if(login) {
			System.out.println("LOGIN");
		} else {
			System.out.println("LOGOUT");
			}
		}
	
	// public static 메서드 선언
	public static void getConnection() {
		System.out.println("CONNECT NETWORK");
		// Messenger.getConnection(); 으로 호출
	}
	
	// private 메서드 선언 - 동일한 인터페이스에 선언된 default 메서드에서만 사용할 목적으로 본문을 구현함
	private void log() {
		System.out.println("START JOB");

	}
}
