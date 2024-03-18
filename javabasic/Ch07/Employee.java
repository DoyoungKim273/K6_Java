package com.ruby.java.jvbasicCh07;
// Person에 정의한 기능을 사용하고자 Person 클래스를 상속

public class Employee extends Person {
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return super.toString() + ":" + dept;
	}
	
	public Employee(String name, int age, String dept){
//		super.setName(name);
//		super.setAge(age);
		super(name, age);
		this.dept = dept;
		System.out.println("e 생성자 실행");
	}

}
