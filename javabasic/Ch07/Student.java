package com.ruby.java.jvbasicCh07;

public class Student extends Person {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
		return super.toString() + ":" + major;
//		왜 major가 출력이 안되냐...............

	}
	
	public Student(String name, int age, String major) {
//		super.setName(name);
//		super.setAge(age);
		super(name,age);
		this.major = major;
		System.out.println("s 생성자 실행");
	}
}
