package com.ruby.java.re;

public class Test322 {
	public static void main(String[] args) {
		char grade ='F';
		
		switch(grade) {
		case 'A' :
		System.out.println("over 90"); break;
		case 'B' :
		System.out.println("over 80"); break;
		case 'C' :
		System.out.println("over 70"); break;
		case 'D' :
		System.out.println("over 60"); break;
		default : 
			System.out.println("under 60"); break;
		}
	}
}
