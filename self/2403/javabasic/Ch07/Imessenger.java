package com.ruby.java.jvbasicCh07;

public class Imessenger implements Messenger {
	
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
