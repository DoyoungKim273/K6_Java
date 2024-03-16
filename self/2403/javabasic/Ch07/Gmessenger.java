package com.ruby.java.jvbasicCh07;

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
