package com.ruby.java.jvbasicCh07;

// 자바에서 클래스는 단일 상속만 가능하지만 인터페이스는 다중 상속이 가능함
public class Gmessenger implements Messenger, WorkFile {

	public String getMessage() {
		return "Galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("g : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("change keyboard");
	}
	
	public void fileUpload() {
		System.out.println("upload");
	}
	
	public void fileDownload() {
		System.out.println("download");
	}
	
	
	
}
