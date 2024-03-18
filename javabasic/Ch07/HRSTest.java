package com.ruby.java.jvbasicCh07;
// 추상클래스 연습 및 오버라이드 연습

abstract class Employee_1{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee_1 {
	public void calcSalary() {
		System.out.println("s salary");
	}

	@Override
	public void calcBonus() {
		System.out.println("s bonus");
	}
}

class Consultant extends Employee_1 {
	public void calcSalary() {
		System.out.println("c salary");
	}

	@Override
	public void calcBonus() {
		System.out.println("c bonus");
	}
}

class Manager extends Employee_1 {
	public void calcSalary() {
		System.out.println("M salary");
	}

	@Override
	public void calcBonus() {
		System.out.println("m bonus");
	}
}

class Director extends Manager{
	public void calcsalary() {
		System.out.println("d salary");
	}
	
	public void calcBonus() {
		System.out.println("d bonus");
	}
	
}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman(); // 클래스 뒤에 항상 괄호 잊지 말기
		Consultant c = new Consultant();
		Manager m = new Manager();
		Director d = new Director();
		
		s.calcSalary();
		c.calcSalary();
		m.calcSalary();
		d.calcsalary();
		
		s.calcBonus();
		c.calcBonus();
		m.calcBonus();
		d.calcBonus();
		
	}
}
