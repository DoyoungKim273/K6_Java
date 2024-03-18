package com.ruby.java.jvbasicCh07;

public class Professor extends Person {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String toString() {
		return super.toString() + ":" + subject;
	}
	
	public Professor(String name, int age, String subject) {
//		super.setName(name);
//		super.setAge(age);
		super(name, age);
		this.subject = subject;
		System.out.println("p 생성자 실행");
	}
}
