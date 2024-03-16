package com.ruby.java.jvbasicCh07;

public class Imessenger implements Messenger {
// 인터페이스를 상속하는 클래스는 인터페이스의 본문을 갖는 default, static, private 메서드에 대해서는 오버라이딩 할 필요 X
// 본문을 구현하지 않은 추상 메서드에 대해서는 반드시 오버라이딩, 본문을 구현해야함
	
	public String getMessage() {
		return "Iphone";
	}
	
	public void setMessage(String msg) {
		System.out.println("I :" + msg);
	}
	
	public void clearMessage() {
		System.out.println("clear message");
	}
}
