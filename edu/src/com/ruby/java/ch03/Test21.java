package com.ruby.java.ch03;

public class Test21 {
	public static void main(String[] args) {
		int a = 12;
		int b = 2;
		char op ='+';
		/*
		if(op == '+') {
			System.out.println(a + b);
		}else if(op == '-'){
			System.out.println(a - b);
		}else if(op == '*'){
			System.out.println(a * b);
		}else if(op == '/'){
			System.out.println(a / b);
		}
		*/
		
		switch(op) {
		case '+' :
			System.out.println(a + b); break;
		case '-' :
			System.out.println(a - b); break;
		case '*' :
			System.out.println(a * b); break;
		case '/' : 
			System.out.println(a / b); break;
		}
		
	}
}
