package com.ruby.java.jvbasicCh07;

public class Gmessenger implements Messenger {

	public String getMessage() {
		return "Galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("g : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("change keyboard");
	}
	
}
