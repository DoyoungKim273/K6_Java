package com.ruby.java.jvbasicCh07;

public class MessengerTest {
	public static void main(String[] args) {
		
		Imessenger iphone = new Imessenger();
		Gmessenger galaxy = new Gmessenger();
		
		System.out.println("min" + Messenger.MIN_SIZE);
		System.out.println("max" + Messenger.MAX_SIZE);
		
		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage("hello");
		iphone.clearMessage();
		iphone.draw_textBox();
		iphone.draw_submitButton();
		
		galaxy.setLogin(true);
		galaxy.getMessage();
		galaxy.setMessage("hi");
		galaxy.changeKeyboard();
		galaxy.fileUpload();
		galaxy.fileDownload();
		
	}
}
